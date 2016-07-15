package com.dragovorn.dotaapi.match;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * *************************************************************************
 * (c) Dragovorn 2016. This file was created by Andrew at 09:07 PM.
 * as of July 14 2016 the project DotaAPI is Copyrighted.
 * *************************************************************************
 */
public class Match implements IMatch {

    private final List<Player> players;

    private final Team winner;

    private final Date startTime;

    private final long id;
    private final long seqId;

    private final int duration;
    private final int cluster;
    private final int firstBlood;
    private final int humanPlayers;
    private final int leagueId;
    private final int positiveVotes;
    private final int negativeVotes;

    private final List<Tower> radiantTowers = new ArrayList<>();
    private final List<Tower> direTowers = new ArrayList<>();

    private final List<Barracks> direRax = new ArrayList<>();
    private final List<Barracks> radiantRax = new ArrayList<>();

    private final LobbyType lobbyType;

    private final GameMode gamemode;

    public Match(List<Player> players, boolean radiantWin, int duration, long startTime, long id, long seqId, int radiantTowers, int direTowers, int radiantRax, int direRax, int cluster, int firstBlood, int lobbyType, int humanPlayers, int leagueId, int positiveVotes, int negativeVotes, int gamemode) {
        this.players = players;
        this.winner = (radiantWin ? Team.RADIANT : Team.DIRE);
        this.duration = duration;
        this.startTime = new Date(startTime);
        this.id = id;
        this.seqId = seqId;
        populateTowers(this.radiantTowers, radiantTowers);
        populateTowers(this.direTowers, direTowers);
        populateRax(this.radiantRax, radiantRax);
        populateRax(this.direRax, direRax);
        this.cluster = cluster;
        this.firstBlood = firstBlood;
        this.lobbyType = LobbyType.values()[lobbyType];
        this.humanPlayers = humanPlayers;
        this.leagueId = leagueId;
        this.positiveVotes = positiveVotes;
        this.negativeVotes = negativeVotes;
        this.gamemode = GameMode.values()[gamemode];
    }

    private void populateRax(List<Barracks> rax, int num) {
        String str = Integer.toBinaryString(num);

        int length = str.length();

        for (int x = length; x < 6; x++) {
            str = "0" + str;
        }

        for (int x = 0; x < 6; x++) {
            if (str.charAt(x) == '1') {
                rax.add(Barracks.values()[x]);
            }
        }
    }

    private void populateTowers(List<Tower> towers, int num) {
        String str = Integer.toBinaryString(num);

        int length = str.length();

        for (int x = length; x < 11; x++) {
            str = "0" + str;
        }

        for (int x = 0; x < 11; x++) {
            if (str.charAt(x) == '1') {
                towers.add(Tower.values()[x]);
            }
        }
    }

    @Override
    public List<Player> getPlayers() {
        return this.players;
    }

    @Override
    public Team getWinner() {
        return this.winner;
    }

    @Override
    public int getDuration() {
        return this.duration;
    }

    @Deprecated
    @Override
    public int getCluster() { // Only deprecated until I figure out all/most cluster ids
        return this.cluster;
    }

    @Override
    public int getFirstBloodTime() { // Maybe make this a Date, could do some maths...
        return this.firstBlood;
    }

    @Override
    public int getHumanPlayers() {
        return this.humanPlayers;
    }

    @Override
    public int getLeagueId() {
        return this.leagueId;
    }

    @Override
    public int getPositiveVotes() {
        return this.positiveVotes;
    }

    @Override
    public int getNegativeVotes() {
        return this.negativeVotes;
    }

    @Override
    public Date getDate() {
        return this.startTime;
    }

    @Override
    public long getId() {
        return this.id;
    }

    @Override
    public long getSeqId() {
        return this.seqId;
    }

    @Override
    public List<Tower> getRadiantTowers() {
        return this.radiantTowers;
    }

    @Override
    public List<Tower> getDireTowers() {
        return this.direTowers;
    }

    @Override
    public List<Barracks> getRadiantRax() {
        return this.radiantRax;
    }

    @Override
    public List<Barracks> getDireRax() {
        return this.direRax;
    }

    @Override
    public LobbyType getLobbyType() {
        return this.lobbyType;
    }

    @Override
    public GameMode getGameMode() {
        return this.gamemode;
    }
}