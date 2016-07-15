package com.dragovorn.dotaapi.match;

/**
 * *************************************************************************
 * (c) Dragovorn 2016. This file was created by Andrew at 10:58 PM.
 * as of July 14 2016 the project DotaAPI is Copyrighted.
 * *************************************************************************
 */
public enum LobbyType {

    INVALID("Invalid", -1),
    PUBLIC_MM("Public Matchmaking", 0),
    PRACTICE("Practice", 1),
    TOURNAMENT("Tournament", 2),
    TUTORIAL("Tutorial", 3),
    COOP("Co-Op with Bots", 4),
    TEAM_MATCH("Team Match", 5),
    SOLO_QUEUE("Solo Queue Matchmaking", 6);

    private String name;

    private int value;

    LobbyType(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public String getName() {
        return this.name;
    }
}