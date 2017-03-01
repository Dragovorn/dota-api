package com.dragovorn.dotaapi;

import com.dragovorn.dotaapi.match.DotaMatch;

import java.util.List;

public interface IDota {

    DotaMatch getMatchById(String id);
    DotaMatch getMatchBySeqId(String id);

    List<DotaMatch> getMatchesById(String id, int num);
    List<DotaMatch> getMatchesBySeqId(String id, int num);
}