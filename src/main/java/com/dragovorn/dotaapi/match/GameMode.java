package com.dragovorn.dotaapi.match;

/**
 * *************************************************************************
 * (c) Dragovorn 2016. This file was created by Andrew at 11:11 PM.
 * as of July 14 2016 the project DotaAPI is Copyrighted.
 * *************************************************************************
 */
public enum GameMode {
    NONE("None", 0),
    ALL_PICK("All Pick", 1),
    CAPTAINS_MODE("Captain's Mode", 2),
    RANDOM_DRAFT("Random Draft", 3),
    SINGLE_DRAFT("Single Draft", 4),
    ALL_RANDOM("All Random", 5),
    INTRO("Intro", 6),
    DIRETIDE("Diretide", 7), // Giff
    REVERSE_CAPTAINS_MODE("Reverse Captain's Mode", 8),
    GREEVLING("Greevling", 9),
    TUTORIAL("Tutorial", 10),
    MID_ONLY("Mid Only", 11),
    LEAST_PLAYED("Least Played", 12),
    LIMITED_HEROES("Limited Heroes", 13),
    COMPENDIUM("Compendium", 14),
    CUSTOM("Custom", 15); // Don't know when this is used, might be ti4 techies reveal.

    private String name;

    private int value;

    GameMode(String name, int value) {
        this.name = name;
        this.value = value;
    }
}