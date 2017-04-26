package com.dragovorn.dotaapi.match;

import com.dragovorn.dotaapi.MatchJSON;
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
}