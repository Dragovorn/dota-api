package com.dragovorn.dotaapi.match.team;

import com.dragovorn.dotaapi.match.building.Lane;
import com.dragovorn.dotaapi.match.building.Type;
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
 */
public interface ITeam {

    /**
     * Checks to see if the team as a building.
     *
     * @param type The {@link Type} of the building being checked.
     * @param lane The {@link Lane} of the building being checked.
     * @param tier The tier of the building being checked.
     * @return Weather or not the building is standing.
     */
    boolean hasBuilding(Type type, Lane lane, int tier);

    /**
     * Returns weather or not the team won.
     *
     * @return Weather or not the team won.
     */
    boolean didWin();

    /**
     * Returns the kill score of the team.
     *
     * @return The kill score of the team.
     */
    int getScore();

    /**
     * Returns the list of the team's buildings that remain.
     *
     * @return The list of the team's buildings that remain.
     */
    ImmutableList<IBuilding> getBuildings();

    /**
     * Returns the list of the team's {@link IPlayer}s.
     *
     * @return The list of the team's {@link IPlayer}s.
     */
    ImmutableList<IPlayer> getPlayers();

    /**
     * Returns which side the team was.
     *
     * @return The side of the team.
     */
    Side getSide();
}