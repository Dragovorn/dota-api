package com.dragovorn.dotaapi.match.player;

import com.dragovorn.dotaapi.match.hero.Ability;
import com.dragovorn.dotaapi.match.hero.generated.Hero;
import com.dragovorn.dotaapi.match.hero.generated.Item;
import com.google.common.collect.ImmutableList;
import org.json.JSONObject;

public class DotaPlayerReduced implements IPlayer {

    private Hero hero;

    private long accountId;

    public DotaPlayerReduced(JSONObject object) {
        if (object.has("account_id")) {
            this.accountId = object.getLong("account_id");
        } else {
            this.accountId = IPlayer.ANONYMOUS;
        }
        this.hero = Hero.fromId(object.getInt("hero_id"));
    }

    @Override
    public boolean isAnonymous() {
        return this.accountId == IPlayer.ANONYMOUS;
    }

    @Override
    public long getAccountId() {
        return this.accountId;
    }

    @Override
    public int getGold() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getLevel() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getNetworth() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getGoldSpent() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getKills() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getDeaths() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getAssists() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getDenies() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getLasthits() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getHeroDamage() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getTowerDamage() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getHeroHealing() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getXPM() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getGPM() {
        throw new UnsupportedOperationException();
    }

    @Override
    public ImmutableList<Item> getInventory() {
        throw new UnsupportedOperationException();
    }

    @Override
    public ImmutableList<Item> getBackpack() {
        throw new UnsupportedOperationException();
    }

    @Override
    public ImmutableList<Ability> getAbilities() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Hero getHero() {
        return this.hero;
    }

    @Override
    public LeaverStatus getLeaverStatus() {
        throw new UnsupportedOperationException();
    }
}