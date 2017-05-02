package com.dragovorn.dotaapi.match;

import com.dragovorn.dotaapi.MatchJSON;
import com.dragovorn.dotaapi.match.hero.Ability;
import com.dragovorn.dotaapi.match.hero.Hero;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPlayer {

    private final IMatch match = new DotaMatch(MatchJSON.MATCH);

    @Test
    public void testInventory() {
        assertEquals(Hero.AXE, this.match.getDire().getPlayers().get(0).getHero());
        assertEquals(Hero.ANTIMAGE, this.match.getDire().getPlayers().get(1).getHero());
    }
    @Test
    public void testAbilities() {
        assertEquals(Ability.Type.PUDGE_MEAT_HOOK, this.match.getRadiant().getPlayers().get(0).getAbilities().get(0).getType());
    }
}