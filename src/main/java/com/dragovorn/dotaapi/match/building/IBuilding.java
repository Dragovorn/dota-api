package com.dragovorn.dotaapi.match.building;

public interface IBuilding {

    Type getType();

    Lane getLane();

    int getTier();
}