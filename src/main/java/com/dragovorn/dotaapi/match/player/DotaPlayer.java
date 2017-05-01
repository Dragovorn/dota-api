package com.dragovorn.dotaapi.match.player;

import com.dragovorn.dotaapi.match.hero.Ability;
import com.dragovorn.dotaapi.match.hero.Hero;
import com.dragovorn.dotaapi.match.hero.Item;
import com.google.common.collect.ImmutableList;
import org.json.JSONObject;

public class DotaPlayer implements IPlayer {

    private ImmutableList<Item> inventory;
    private ImmutableList<Item> backpack;

    private Hero hero;

    private LeaverStatus leaverStatus;

    public static final long ANONYMOUS = 4294967295L;
    private long accountId;

    private int kills;
    private int deaths;
    private int assists;
    private int goldSpent;
    private int gold;
    private int networth;
    private int gpm;
    private int xpm;
    private int level;
    private int lasthits;
    private int denies;
    private int heroDamage;
    private int towerDamage;
    private int heroHealing;

    public DotaPlayer(JSONObject object) {
        this.accountId = object.getLong("account_id");
        this.kills = object.getInt("kills");
        this.deaths = object.getInt("deaths");
        this.assists = object.getInt("assists");
        this.gold = object.getInt("gold");
        this.goldSpent = object.getInt("gold_spent");
        this.networth = this.gold + this.goldSpent;
        this.gpm = object.getInt("gold_per_min");
        this.xpm = object.getInt("xp_per_min");
        this.level = object.getInt("level");
        this.lasthits = object.getInt("last_hits");
        this.denies = object.getInt("denies");
        this.heroDamage = object.getInt("hero_damage");
        this.towerDamage = object.getInt("tower_damage");
        this.heroHealing = object.getInt("hero_healing");
        this.hero = Hero.getFromId(object.getInt("hero_id"));
        this.leaverStatus = LeaverStatus.values()[object.getInt("leaver_status")];

        ImmutableList.Builder<Item> builder = new ImmutableList.Builder<>();

        for (int x = 0; x < 6; x++) {
            builder.add(Item.fromId(object.getInt("item_" + x)));
        }

        this.inventory = builder.build();

        builder = new ImmutableList.Builder<>();

        for (int x = 0; x < 3; x++) {
            builder.add(Item.fromId(object.getInt("backpack_" + x)));
        }

        this.backpack = builder.build();
    }

    @Override
    public boolean isAnonymous() {
        return accountId == ANONYMOUS;
    }

    @Override
    public long getAccountId() {
        return this.accountId;
    }

    @Override
    public int getGold() {
        return this.gold;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public int getNetworth() {
        return this.networth;
    }

    @Override
    public int getGoldSpent() {
        return this.goldSpent;
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
    public int getDenies() {
        return this.denies;
    }

    @Override
    public int getLasthits() {
        return this.lasthits;
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
    public int getXPM() {
        return this.xpm;
    }

    @Override
    public int getGPM() {
        return this.gpm;
    }

    @Override
    public ImmutableList<Item> getInventory() {
        return this.inventory;
    }

    @Override
    public ImmutableList<Item> getBackpack() {
        return this.backpack;
    }

    @Override
    public ImmutableList<Ability> getAbilities() {
        return null;
    }

    @Override
    public Hero getHero() {
        return this.hero;
    }

    @Override
    public LeaverStatus getLeaverStatus() {
        return this.leaverStatus;
    }

    @Override
    public String toString() {
        return this.hero.toString();
    }
}