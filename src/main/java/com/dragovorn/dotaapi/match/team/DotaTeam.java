package com.dragovorn.dotaapi.match.team;

import com.dragovorn.dotaapi.match.building.Building;
import com.dragovorn.dotaapi.match.building.BuildingLane;
import com.dragovorn.dotaapi.match.building.BuildingType;
import com.dragovorn.dotaapi.match.building.IBuilding;
import com.google.common.collect.ImmutableList;

import java.util.List;

public class DotaTeam implements ITeam<TeamSide> {

    private final TeamSide side;

    private final ImmutableList<IBuilding> buildings;

    private final boolean won;

    public DotaTeam(TeamSide side, int towerStatus, int raxStatus, boolean won) {
        this.side = side;
        this.won = won;

        List<IBuilding> buildings = Building.deduceFromDecimal(towerStatus, false);
        buildings.addAll(Building.deduceFromDecimal(raxStatus, true));

        if (won) {
            buildings.add(new Building(BuildingType.ANCIENT, BuildingLane.MID, 0));
        }

        this.buildings = new ImmutableList.Builder<IBuilding>().addAll(buildings).build();
    }

    @Override
    public boolean hasBuilding(BuildingType type, BuildingLane lane, int tier) {
        return false;
    }

    @Override
    public boolean didWin() {
        return this.won;
    }

    @Override
    public ImmutableList<IBuilding> getBuildings() {
        return this.buildings;
    }

    @Override
    public TeamSide getSide() {
        return this.side;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof ITeam<?>)) {
            return false;
        }

        ITeam<?> team = (ITeam<?>) object;

        return (this.won == team.didWin()) && (this.buildings.equals(team.getBuildings())) && (this.side.equals(team.getSide()));
    }
}