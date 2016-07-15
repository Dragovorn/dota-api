package com.dragovorn.dotaapi.match;

/**
 * *************************************************************************
 * (c) Dragovorn 2016. This file was created by Andrew at 09:36 PM.
 * as of July 14 2016 the project DotaAPI is Copyrighted.
 * *************************************************************************
 */
public enum Team {
    DIRE("Dire"),
    RADIANT("Radiant");

    private String name;

    Team(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}