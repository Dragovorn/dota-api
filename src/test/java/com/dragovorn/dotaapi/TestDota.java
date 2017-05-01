package com.dragovorn.dotaapi;

import com.dragovorn.dotaapi.match.IMatch;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDota {

    private IDota dota = new Dota(Keys.steam);

    @Test
    public void testGetMatchById() {
        IMatch match = this.dota.getMatchById(3134717701L);

        assertEquals(3134717701L, match.getMatchId());
    }
}