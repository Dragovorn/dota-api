package com.dragovorn.dotaapi.match.team;

import com.dragovorn.dotaapi.match.building.Building;
import com.dragovorn.dotaapi.match.building.Lane;
import com.dragovorn.dotaapi.match.building.Type;
import com.dragovorn.dotaapi.match.building.IBuilding;
import com.dragovorn.dotaapi.match.player.IPlayer;
import com.google.common.collect.ImmutableList;

import java.util.List;

public class DotaTeam implements ITeam {

    private final Side side;

    private final ImmutableList<IBuilding> buildings;

    private final ImmutableList<IPlayer> players;

    private final int score;

    private final boolean won;

    public DotaTeam(Side side, int towerStatus, int raxStatus, boolean won, List<IPlayer> players, int score) {
        this.side = side;
        this.won = won;
        this.players = new ImmutableList.Builder<IPlayer>().addAll(players).build();

        List<IBuilding> buildings = Building.deduceFromDecimal(towerStatus, false);
        buildings.addAll(Building.deduceFromDecimal(raxStatus, true));

        if (won) {
            buildings.add(new Building(Type.ANCIENT, Lane.MID, 0));
        }

        this.buildings = new ImmutableList.Builder<IBuilding>().addAll(buildings).build();
        this.score = score;
    }

    @Override
    public boolean hasBuilding(Type type, Lane lane, int tier) {
        Building building = null;

        for (IBuilding buildings : this.buildings) {
            Building build = (Building) buildings;

            if (type == build.getType() && lane == build.getLane()) {
                if (build.getType() == Type.ANCIENT || build.getType() == Type.MELEERAX || build.getType() == Type.RANGEDRAX || tier == build.getTier()) {
                    building = build;
                }
            }
        }

        return building != null;
    }

    @Override
    public boolean didWin() {
        return this.won;
    }

    @Override
    public int getScore() {
        return this.score;
    }

    @Override
    public ImmutableList<IBuilding> getBuildings() {
        return this.buildings;
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