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

import com.dragovorn.dotaapi.match.building.IBuilding;
import com.google.common.collect.ImmutableList;

import java.util.Date;

/**
 * Represents a match of Dota. Simple implementation found at {@link com.dragovorn.dotaapi.match.DotaMatch}.
 *
 * @author Andrew Burr
 * @version 0.1
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
     * @return Duration of match.
     */
    int getDuration();

    /**
     * Returns the Match ID of the match.
     *
     * @return Match ID of match.
     */
    long getMatchId();

    /**
     * Returns the Sequence ID of the match.
     *
     * @return Sequence ID of match.
     */
    long getSequenceId();

    /**
     * Returns when the match started
     *
     * @return Start date of match.
     */
    Date getStartTime();

    /**
     * Returns the list of Radiant Buildings.
     *
     * @return List of Radiant Buildings.
     */
    ImmutableList<IBuilding> getRadiantBuildings();

    /**
     * Returns the list of Dire Buildings.
     *
     * @return List of Dire Buildings.
     */
    ImmutableList<IBuilding> getDireBuildings();
}