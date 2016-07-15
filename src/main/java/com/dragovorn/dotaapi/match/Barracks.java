package com.dragovorn.dotaapi.match;

/**
 * *************************************************************************
 * (c) Dragovorn 2016. This file was created by Andrew at 09:59 PM.
 * as of July 14 2016 the project DotaAPI is Copyrighted.
 * *************************************************************************
 */
public enum Barracks {
    MELEE_BOTTOM("Bottom Melee Barracks", 0),
    RANGED_BOTTOM("Bottom Ranged Barracks", 1),
    MELEE_MIDDLE("Middle Melee Barracks", 2),
    RANGED_MIDDLE("Middle Ranged Barracks", 3),
    MELEE_TOP("Top Melee Barracks", 4),
    RANGED_TOP("Top Ranged Barracks", 5);

    private String name;

    private int value;

    Barracks(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public int getValue() {
        return this.value;
    }
}