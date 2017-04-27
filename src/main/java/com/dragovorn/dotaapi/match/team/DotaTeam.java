package com.dragovorn.dotaapi.match.team;

import com.dragovorn.dotaapi.match.building.Building;
import com.dragovorn.dotaapi.match.building.Lane;
import com.dragovorn.dotaapi.match.building.Type;
import com.dragovorn.dotaapi.match.building.IBuilding;
import com.dragovorn.dotaapi.match.player.IPlayer;
import com.google.common.collect.ImmutableList;

import java.util.List;

public class DotaTeam implements ITeam<Side> {

    private final Side side;

    private final ImmutableList<IBuilding> buildings;

    private final boolean won;

    public DotaTeam(Side side, int towerStatus, int raxStatus, boolean won) {
        this.side = side;
        this.won = won;

        List<IBuilding> buildings = Building.deduceFromDecimal(towerStatus, false);
        buildings.addAll(Building.deduceFromDecimal(raxStatus, true));

        if (won) {
            buildings.add(new Building(Type.ANCIENT, Lane.MID, 0));
        }

        this.buildings = new ImmutableList.Builder<IBuilding>().addAll(buildings).build();
    }

    @Override
    public boolean hasBuilding(Type type, Lane lane, int tier) {
        Building building = null;

        for (IBuilding buildings : this.buildings) {
            Building build = (Building) buildings;

            if (type == build.getType() && lane == build.getLane() && tier == build.getTier()) {
                building = build;
            }
        }

        return building != null;
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
    public ImmutableList<IPlayer> getPlayers() {
        return null;
    }

    @Override
    public Side getSide() {
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