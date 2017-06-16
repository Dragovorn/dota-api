package com.dragovorn.dotaapi.match;

import com.dragovorn.dotaapi.MatchJSON;
import com.dragovorn.dotaapi.match.building.Lane;
import com.dragovorn.dotaapi.match.building.Type;
import com.dragovorn.dotaapi.match.team.Side;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTeam {

    private final IMatch match = new DotaMatch(MatchJSON.MATCH);

    @Test
    public void testBuildings() {
        assertEquals(true, this.match.getDire().getBuildings().isEmpty());
        assertEquals(false, this.match.getRadiant().getBuildings().isEmpty());
    }

    @Test
    public void testHasBuilding() {
        assertEquals(false, this.match.getDire().hasBuilding(Type.ANCIENT, Lane.MID, 0));
        assertEquals(true, this.match.getRadiant().hasBuilding(Type.ANCIENT, Lane.MID, 0));
    }

    @Test
    public void testScore() {
        assertEquals(54, this.match.getRadiant().getScore());
        assertEquals(28, this.match.getDire().getScore());
    }

    @Test
    public void testSide() {
        assertEquals(Side.RADIANT, this.match.getRadiant().getSide());
        assertEquals(Side.DIRE, this.match.getDire().getSide());
    }
}