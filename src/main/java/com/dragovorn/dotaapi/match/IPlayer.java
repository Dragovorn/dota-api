package com.dragovorn.dotaapi.match;

/**
 * *************************************************************************
 * (c) Dragovorn 2016. This file was created by Andrew at 09:07 PM.
 * as of July 14 2016 the project DotaAPI is Copyrighted.
 * *************************************************************************
 */
interface IPlayer {

    String getAccountId();

    int getSlot();
    int[] getItems();
    int getKills();
    int getDeaths();
    int getAssists();
    int getLeaverStatus();
    int getGold();
    int getLastHits();
    int getDenies();
    int getGPM();
    int getXPM();
    int getGoldSpent();
    int getHeroDamage();
    int getTowerDamage();
    int getHeroHealing();

    short getLevel();

    Hero getHero();
}