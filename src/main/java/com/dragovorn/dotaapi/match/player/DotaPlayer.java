package com.dragovorn.dotaapi.match.player;

import com.dragovorn.dotaapi.match.hero.Ability;
import com.dragovorn.dotaapi.match.hero.Hero;
import com.dragovorn.dotaapi.match.hero.Item;
import com.google.common.collect.ImmutableList;
import org.json.JSONObject;

public class DotaPlayer implements IPlayer {

    public DotaPlayer(JSONObject object) {

    }

    @Override
    public boolean isAnonymous() {
        return false;
    }

    @Override
    public long getPlayerId() {
        return 0;
    }

    @Override
    public int getGold() {
        return 0;
    }

    @Override
    public int getLevel() {
        return 0;
    }

    @Override
    public int getNetworth() {
        return 0;
    }

    @Override
    public int getGoldSpent() {
        return 0;
    }

    @Override
    public int getKills() {
        return 0;
    }

    @Override
    public int getDeaths() {
        return 0;
    }

    @Override
    public int getAssists() {
        return 0;
    }

    @Override
    public int getDenies() {
        return 0;
    }

    @Override
    public int getLasthits() {
        return 0;
    }

    @Override
    public int getHeroDamage() {
        return 0;
    }

    @Override
    public int getTowerDamage() {
        return 0;
    }

    @Override
    public int getHeroHealing() {
        return 0;
    }

    @Override
    public int getXPM() {
        return 0;
    }

    @Override
    public int getGPM() {
        return 0;
    }

    @Override
    public ImmutableList<Item> getActiveItems() {
        return null;
    }

    @Override
    public ImmutableList<Item> getBackpackItems() {
        return null;
    }

    @Override
    public ImmutableList<Ability> getAbilities() {
        return null;
    }

    @Override
    public Hero getHero() {
        return null;
    }

    @Override
    public LeaverStatus getLeaverStatus() {
        return null;
    }
}