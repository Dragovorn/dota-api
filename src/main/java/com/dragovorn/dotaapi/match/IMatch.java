/*
 * Copyright (c)  2016-2017, Andrew Burr
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.dragovorn.dotaapi.match;

import com.dragovorn.dotaapi.match.lobby.GameMode;
import com.dragovorn.dotaapi.match.lobby.LobbyType;
import com.dragovorn.dotaapi.match.team.ITeam;
import org.json.JSONObject;

import java.util.Date;

/**
 * Represents a match of Dota. Simple implementation found at {@link com.dragovorn.dotaapi.match.DotaMatch}.
 *
 * @author Andrew Burr
 * @version 1
 * @since 0.0.1
 */
public interface IMatch {

    // Use 2933092997 to test CM and LD stuff
    // Use MATCHID to test BC stuff

    /**
     * Returns weather or not the Radiant team won.
     *
     * @return If Radiant Team won.
     */
    boolean didRadiantWin();

    /**
     * Returns the duration of the match.
     *
     * @return The Duration of match.
     */
    int getDuration();

    /**
     * Returns the server cluster that the match was played on.
     *
     * @return The server cluster the match was played on
     */
    int getCluster();

    /**
     * Returns the number of negative votes on the match.
     *
     * @return The number of negative votes on the match.
     */
    int getNegativeVotes();

    /**
     * Returns the number of positive votes on the match.
     *
     * @return The number of positive votes on the match.
     */
    int getPositiveVotes();

    /**
     * @deprecated I don't know what purpose this value serves
     * @return The engine number that the match was played on?
     */
    @Deprecated
    int getEngine();

    /**
     * Returns the league id (if any) of the match
     *
     * @return The League Id of the match.
     */
    int getLeagueId();

    /**
     * Returns the when first blood happened in the match.
     *
     * @return The First Blood time of the match.
     */
    int getFirstBlood();

    /**
     * Returns the Match ID of the match.
     *
     * @return The Match ID of match.
     */
    long getMatchId();

    /**
     * Returns the Sequence ID of the match.
     *
     * @return The Sequence ID of match.
     */
    long getSequenceId();

    /**
     * Returns when the match started
     *
     * @return The start {@link Date} of match.
     */
    Date getStartTime();

    /**
     * Returns the Radiant {@link ITeam}.
     *
     * @return The Radiant {@link ITeam}.
     */
    ITeam getRadiant();

    /**
     * Returns the Dire {@link ITeam}.
     *
     * @return The Dire {@link ITeam}.
     */
    ITeam getDire();

    /**
     * Returns the {@link ITeam} that won the match.
     *
     * @return The Winning {@link ITeam}.
     */
    ITeam getWinner();

    /**
     * Returns the {@link ITeam} that lost the match.
     *
     * @return The Losing {@link ITeam}.
     */
    ITeam getLoser();

    /**
     * Returns the {@link GameMode} that the match was.
     *
     * @return The {@link GameMode} of the match.
     */
    GameMode getGameMode();

    /**
     * Returns the {@link LobbyType} that the match was.
     *
     * @return The {@link LobbyType} of the match.
     */
    LobbyType getLobbyType();

    /**
     * Returns the JSON used to generate this object.
     *
     * @return The JSON used to generate this object.
     */
    JSONObject getJSONObject();
}