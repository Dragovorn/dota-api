package com.dragovorn.dotaapi.match;

/**
 * *************************************************************************
 * (c) Dragovorn 2016. This file was created by Andrew at 09:52 PM.
 * as of July 14 2016 the project DotaAPI is Copyrighted.
 * *************************************************************************
 */
public enum Tower {
    TIER1_BOTTOM("Tier 1 Bottom", 0),
    TIER2_BOTTOM("Tier 2 Bottom", 1),
    TIER3_BOTTOM("Tier 3 Bottom", 2),
    TIER1_MIDDLE("Tier 1 Middle", 3),
    TIER2_MIDDLE("Tier 2 Middle", 4),
    TIER3_MIDDLE("Tier 3 Middle", 5),
    TIER1_TOP("Tier 1 Top", 6),
    TIER2_TOP("Tier 2 Top", 7),
    TIER3_TOP("Tier 3 Top", 8),
    ANCIENT_BOTTOM("Ancient", 9),
    ANCIENT_TOP("Ancient", 10);

    private String name;

    private int value;

    Tower(String name, int value) {
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