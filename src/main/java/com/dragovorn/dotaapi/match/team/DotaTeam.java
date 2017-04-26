package com.dragovorn.dotaapi.match.team;

import com.dragovorn.dotaapi.match.building.Building;
import com.dragovorn.dotaapi.match.building.BuildingLane;
import com.dragovorn.dotaapi.match.building.BuildingType;
import com.dragovorn.dotaapi.match.building.IBuilding;
import com.google.common.collect.ImmutableList;

import java.util.List;

public class DotaTeam implements ITeam {

    private final String name;

    private final ImmutableList<IBuilding> buildings;

    public DotaTeam(String name, int towerStatus, int raxStatus, boolean won) {
        this.name = name;

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
    public String getName() {
        return name;
    }

    @Override
    public ImmutableList<IBuilding> getBuildings() {
        return this.buildings;
    }
}