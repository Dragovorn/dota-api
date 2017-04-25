package com.dragovorn.dotaapi.match.building;

public interface IBuilding<T, L> {

    T getType();

    L getLane();

    int getTier();
}