package com.dragovorn.dotaapi.match;

/**
 * *************************************************************************
 * (c) Dragovorn 2016. This file was created by Andrew at 09:28 PM.
 * as of July 12 2016 the project DotaAPI is Copyrighted.
 * *************************************************************************
 */
public interface IMatchOverviewPlayer {

    long getAccountId();

    int getPlayerSlots();
    int getHeroId();
}