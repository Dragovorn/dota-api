package com.dragovorn.dotaapi.match;

import com.dragovorn.dotaapi.MatchJSON;
import com.dragovorn.dotaapi.match.hero.Ability;
import com.dragovorn.dotaapi.match.hero.generated.AbilityType;
import com.dragovorn.dotaapi.match.hero.generated.Hero;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPlayer {

    private final IMatch match = new DotaMatch(MatchJSON.MATCH);

    @Test
    public void testInventory() {
        assertEquals(Hero.NPC_DOTA_HERO_PUDGE, this.match.getRadiant().getPlayers().get(0).getHero());
    }

    @Test
    public void testAbilities() {
        assertEquals(AbilityType.PUDGE_MEAT_HOOK, this.match.getRadiant().getPlayers().get(0).getAbilities().get(0).getType());
    }

    @Test
    public void testKills() {
        assertEquals(8, this.match.getRadiant().getPlayers().get(0).getKills());
    }

    @Test
    public void testDeaths() {
        assertEquals(8, this.match.getRadiant().getPlayers().get(0).getDeaths());
    }

    @Test
    public void testAssists() {
        assertEquals(14, this.match.getRadiant().getPlayers().get(0).getAssists());
    }

    @Test
    public void testLevel() {
        assertEquals(23, this.match.getRadiant().getPlayers().get(0).getLevel());
    }

    @Test
    public void testLasthits() {
        assertEquals(59, this.match.getRadiant().getPlayers().get(0).getLasthits());
    }

    @Test
    public void testDenies() {
        assertEquals(2, this.match.getRadiant().getPlayers().get(0).getDenies());
    }
}