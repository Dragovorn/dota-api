package com.dragovorn.dotaapi;

import com.dragovorn.dotaapi.match.IMatch;

import java.util.List;

/**
 * Represents the basic API Object this is here for
 * people that want to make their own implementations
 * of the API. Default implementation: {@link Dota}.
 *
 * @author Andrew Burr
 * @version 0.2
 * @since 0.0.1
 */
public interface IDota {

    // 7534 (Is steam protocol for fetching profile cards)

    IMatch getMatchById(long id);
    IMatch getMatchBySeqId(long id);

    List<IMatch> getMatchesById(long id, int num);
    List<IMatch> getMatchesBySeqId(long id, int num);
}