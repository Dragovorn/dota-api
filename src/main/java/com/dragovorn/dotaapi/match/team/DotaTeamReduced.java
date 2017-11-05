package com.dragovorn.dotaapi.match.team;

import com.dragovorn.dotaapi.match.building.IBuilding;
import com.dragovorn.dotaapi.match.building.Lane;
import com.dragovorn.dotaapi.match.building.Type;
import com.dragovorn.dotaapi.match.player.IPlayer;
import com.google.common.collect.ImmutableList;

import java.util.List;

public class DotaTeamReduced implements ITeam {

    private ImmutableList<IPlayer> players;

    private Side side;

    public DotaTeamReduced(Side side, List<IPlayer> players) {
        this.side = side;
        this.players = ImmutableList.copyOf(players);
    }

    @Override
    public boolean hasBuilding(Type type, Lane lane, int tier) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean didWin() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getScore() {
        throw new UnsupportedOperationException();
    }

    @Override
    public ImmutableList<IBuilding> getBuildings() {
        throw new UnsupportedOperationException();
    }

    @Override
    public ImmutableList<IPlayer> getPlayers() {
        return this.players;
    }

    @Override
    public Side getSide() {
        return this.side;
    }
}