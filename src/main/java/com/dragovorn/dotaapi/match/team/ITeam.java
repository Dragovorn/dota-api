package com.dragovorn.dotaapi.match.team;

import com.dragovorn.dotaapi.match.building.BuildingLane;
import com.dragovorn.dotaapi.match.building.BuildingType;
import com.dragovorn.dotaapi.match.building.IBuilding;
import com.dragovorn.dotaapi.match.player.IPlayer;
import com.google.common.collect.ImmutableList;

/**
 * Represents one of the two teams in an {@link com.dragovorn.dotaapi.match.IMatch} of Dota.
 * Simple Implementation found at {@link DotaTeam}
 *
 * @since 0.0.1
 * @version 1
 * @author Andrew Burr
 * @param <S> The TeamSide (Radiant, Dire) indicator.
 */
public interface ITeam<S> {

    boolean hasBuilding(BuildingType type, BuildingLane lane, int tier);
    boolean didWin();

    ImmutableList<IBuilding> getBuildings();

    ImmutableList<IPlayer> getPlayers();

    S getSide();
}