package com.dragovorn.dotaapi.match;

/**
 * *************************************************************************
 * (c) Dragovorn 2016. This file was created by Andrew at 09:07 PM.
 * as of July 14 2016 the project DotaAPI is Copyrighted.
 * *************************************************************************
 */
public class Player implements IPlayer {

    private final String accountId;

    private final int slot;
    private final int[] items; // Make Enum
    private final int kills;
    private final int deaths;
    private final int assists;
    private final int leaverStatus;
    private final int gold;
    private final int lastHits;
    private final int denies;
    private final int gpm;
    private final int xpm;
    private final int goldSpent;
    private final int heroDamage;
    private final int towerDamage;
    private final int heroHealing;

    private final short level;

    private final Hero hero;

    public Player(String id, int slot, int hero, int[] items, int kills, int deaths, int assists, int leaverStatus, int gold, int lastHits, int denies, int gpm, int xpm, int goldSpent, int heroDamage, int towerDamage, int heroHealing, short level) {
        this.accountId = id;
        this.slot = slot;
        this.hero = Hero.values()[hero];
        this.items = items;
        this.kills = kills;
        this.deaths = deaths;
        this.assists = assists;
        this.leaverStatus = leaverStatus;
        this.gold = gold;
        this.lastHits = lastHits;
        this.denies = denies;
        this.gpm = gpm;
        this.xpm = xpm;
        this.goldSpent = goldSpent;
        this.heroDamage = heroDamage;
        this.towerDamage = towerDamage;
        this.heroHealing = heroHealing;
        this.level = level;
    }

    @Override
    public final String getAccountId() {
        return this.accountId;
    }

    @Override
    public final int getSlot() {
        return this.slot;
    }

    @Override
    public final Hero getHero() {
        return this.hero;
    }

    @Override
    public final int[] getItems() {
        return this.items;
    }

    @Override
    public int getKills() {
        return this.kills;
    }

    @Override
    public int getDeaths() {
        return this.deaths;
    }

    @Override
    public int getAssists() {
        return this.assists;
    }

    @Override
    public int getLeaverStatus() {
        return this.leaverStatus;
    }

    @Override
    public int getGold() {
        return gold;
    }

    @Override
    public int getLastHits() {
        return this.lastHits;
    }

    @Override
    public int getDenies() {
        return this.denies;
    }

    @Override
    public int getGPM() {
        return this.gpm;
    }

    @Override
    public int getXPM() {
        return this.xpm;
    }

    @Override
    public int getGoldSpent() {
        return this.goldSpent;
    }

    @Override
    public int getHeroDamage() {
        return this.heroDamage;
    }

    @Override
    public int getTowerDamage() {
        return this.towerDamage;
    }

    @Override
    public int getHeroHealing() {
        return this.heroHealing;
    }

    @Override
    public short getLevel() {
        return this.level;
    }
}