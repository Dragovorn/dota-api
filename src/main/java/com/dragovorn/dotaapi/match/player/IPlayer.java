package com.dragovorn.dotaapi.match.player;

import com.dragovorn.dotaapi.match.hero.Ability;
import com.dragovorn.dotaapi.match.hero.Hero;
import com.dragovorn.dotaapi.match.hero.Item;
import com.google.common.collect.ImmutableList;

/**
 * Represents one of the 10 players in a {@link com.dragovorn.dotaapi.match.IMatch} of Dota.
 * Simple implementation found at {@link DotaPlayer}.
 *
 * @since 0.0.1
 * @version 1
 * @author Andrew Burr
 */
public interface IPlayer {

    boolean isAnonymous();

    long getAccountId();

    int getGold();

    int getLevel();

    int getNetworth();

    int getGoldSpent();

    int getKills();

    int getDeaths();

    int getAssists();

    int getDenies();

    int getLasthits();

    int getHeroDamage();

    int getTowerDamage();

    int getHeroHealing();

    int getXPM();

    int getGPM();

    ImmutableList<Item> getInventory();

    ImmutableList<Item> getBackpack();

    ImmutableList<Ability> getAbilities();

    Hero getHero();

    LeaverStatus getLeaverStatus();
}