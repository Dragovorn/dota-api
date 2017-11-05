package com.dragovorn.dotaapi;

import com.dragovorn.dotaapi.match.IMatch;

import java.util.List;

/**
 * Represents the basic API Object this is here for
 * people that want to make their own implementations
 * of the API. Default implementation: {@link Dota}.
 *
 * @author Andrew Burr
 * @version 0.3
 * @since 0.0.1
 */
public interface IDota {

    /**
     * Gets the a match by it's ID. (Doesn't cache the result, you'll have to do that)
     *
     * @param id The ID of the match you wish to get.
     * @return The {@link IMatch} of the match.
     */
    IMatch getMatchById(long id);

    /**
     * Gets the a match by it's Sequence ID. (Doesn't cache the result, you'll have to do that)
     *
     * @param id The Sequence ID of the match you wish to get.
     * @return The {@link IMatch} of the match.
     */
    IMatch getMatchBySeqId(long id);

    /**
     * Gets the a list of matches starting at the given Sequence ID. (Doesn't cache the results, you'll have to do that)
     *
     * @param id The Sequence ID to start at when bulk fetching matches.
     * @param num The number of matches you want to fetch.
     * @return A {@link List} of {@link IMatch}es of the matches.
     */
    List<IMatch> getMatchesStartingAtSeqId(long id, int num);

    List<IMatch> getMatchHistory();
}