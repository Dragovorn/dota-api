package com.dragovorn.dotaapi.match;

import com.dragovorn.dotaapi.MatchJSON;
import com.dragovorn.dotaapi.match.lobby.GameMode;
import com.dragovorn.dotaapi.match.lobby.LobbyType;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMatch {

    private final IMatch match = new DotaMatch(MatchJSON.MATCH);

    @Test
    public void testWinner() {
        assertEquals(this.match.getRadiant(), this.match.getWinner());
    }

    @Test
    public void testLoser() {
        assertEquals(this.match.getDire(), this.match.getLoser());
    }

    @Test
    public void testLobbyType() {
        assertEquals(LobbyType.RANKED_MATCHMAKING, this.match.getLobbyType());
    }

    @Test
    public void testGameMode() {
        assertEquals(GameMode.RANKED_ALL_PICK, this.match.getGameMode());
    }
}