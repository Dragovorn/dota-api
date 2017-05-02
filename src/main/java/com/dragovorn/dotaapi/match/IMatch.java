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

import com.dragovorn.dotaapi.match.team.ITeam;
import org.json.JSONObject;

import java.util.Date;

/**
 * Represents a match of Dota. Simple implementation found at {@link com.dragovorn.dotaapi.match.DotaMatch}.
 *
 * @author Andrew Burr
 * @version 0.6
 * @since 0.0.1
 */
public interface IMatch {

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
     * Returns the when first blood happened in the match.
     *
     * @return The First Blood of the match.
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
     * @return The start date of match.
     */
    Date getStartTime();

    /**
     * Returns the Radiant Team.
     *
     * @return The Radiant Team.
     */
    ITeam getRadiant();

    /**
     * Returns the Dire Team.
     *
     * @return The Dire Team.
     */
    ITeam getDire();

    /**
     * Returns the team that won the match.
     *
     * @return The Winning Team.
     */
    ITeam getWinner();

    /**
     * Returns the team that lost the match.
     *
     * @return The Losing Team.
     */
    ITeam getLoser();

    /**
     * Returns the JSON used to generate this object.
     *
     * @return The JSON used to generate this object.
     */
    JSONObject getJSONObject();
}