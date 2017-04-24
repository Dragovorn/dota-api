package com.dragovorn.dotaapi.match;

import com.dragovorn.dotaapi.MatchJSON;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBuilding {

    @Test
    public void testDeduceFrom() {
        IMatch match = new DotaMatch(MatchJSON.MATCH);

        assertEquals(true, match.getDireBuildings().isEmpty());

        match.getRadiantBuildings().forEach(building -> System.out.println(building));
    }
}