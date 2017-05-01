package com.dragovorn.dotaapi.match;

import com.dragovorn.dotaapi.MatchJSON;
import com.dragovorn.dotaapi.match.hero.Ability;
import com.dragovorn.dotaapi.match.hero.Hero;
import com.dragovorn.dotaapi.match.player.IPlayer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMatch {

    private final IMatch match = new DotaMatch(MatchJSON.MATCH);

    @Test
    public void testBuildings() {
        assertEquals(true, this.match.getDire().getBuildings().isEmpty());
        assertEquals(false, this.match.getRadiant().getBuildings().isEmpty());
    }

    @Test
    public void testWinner() {
        assertEquals(this.match.getRadiant(), this.match.getWinner());
    }

    @Test
    public void testInventory() {
        assertEquals(Hero.AXE, ((IPlayer) this.match.getDire().getPlayers().get(0)).getHero());
        assertEquals(Hero.ANTIMAGE, ((IPlayer) this.match.getDire().getPlayers().get(1)).getHero());
    }

    @Test
    public void testAbilities() {
        assertEquals(Ability.Type.PUDGE_MEAT_HOOK, ((IPlayer) this.match.getRadiant().getPlayers().get(0)).getAbilities().get(0).getType());
    }
}