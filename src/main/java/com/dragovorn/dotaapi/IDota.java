package com.dragovorn.dotaapi;

import com.dragovorn.dotaapi.match.DotaMatch;

import java.util.List;

/**
 * Represents the basic API Object this is here for
 * people that want to make their own implementations
 * of the API. Default implementation: {@link Dota}.
 *
 * @author Andrew Burr
 * @version 0.1
 * @since 0.0.1
 */
public interface IDota {

    DotaMatch getMatchById(String id);
    DotaMatch getMatchBySeqId(String id);

    List<DotaMatch> getMatchesById(String id, int num);
    List<DotaMatch> getMatchesBySeqId(String id, int num);
}