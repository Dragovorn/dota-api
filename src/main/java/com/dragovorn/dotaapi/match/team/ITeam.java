package com.dragovorn.dotaapi.match.team;

import com.dragovorn.dotaapi.match.building.BuildingLane;
import com.dragovorn.dotaapi.match.building.BuildingType;
import com.dragovorn.dotaapi.match.building.IBuilding;
import com.google.common.collect.ImmutableList;

public interface ITeam {

    boolean hasBuilding(BuildingType type, BuildingLane lane, int tier);

    String getName();

    ImmutableList<IBuilding> getBuildings();
}