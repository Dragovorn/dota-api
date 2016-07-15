package com.dragovorn.dotaapi.match;

import java.util.Date;
import java.util.List;

/**
 * *************************************************************************
 * (c) Dragovorn 2016. This file was created by Andrew at 09:07 PM.
 * as of July 14 2016 the project DotaAPI is Copyrighted.
 * *************************************************************************
 */
interface IMatch {

    List<Player> getPlayers();

    Team getWinner();

    int getDuration();
    @Deprecated
    int getCluster(); // Only deprecated until I figure out all/most cluster ids
    int getFirstBloodTime();
    int getHumanPlayers();
    int getLeagueId();
    int getPositiveVotes();
    int getNegativeVotes();

    Date getDate();

    long getId();
    long getSeqId();

    List<Tower> getRadiantTowers();
    List<Tower> getDireTowers();

    List<Barracks> getRadiantRax();
    List<Barracks> getDireRax();

    LobbyType getLobbyType();

    GameMode getGameMode();
}