package com.dragovorn.dotaapi.match;

import com.dragovorn.dotaapi.match.lobby.GameMode;
import com.dragovorn.dotaapi.match.lobby.LobbyType;
import com.dragovorn.dotaapi.match.player.DotaPlayerReduced;
import com.dragovorn.dotaapi.match.player.IPlayer;
import com.dragovorn.dotaapi.match.team.DotaTeamReduced;
import com.dragovorn.dotaapi.match.team.ITeam;
import com.dragovorn.dotaapi.match.team.Side;
import com.google.common.collect.ImmutableList;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Date;

public class DotaMatchReduced implements IMatch {

    private JSONObject object;

    private ImmutableList<IPlayer> players;

    private LobbyType type;

    private ITeam radiant;
    private ITeam dire;

    private Date startTime;

    private long sequenceId;
    private long matchId;

    public DotaMatchReduced(JSONObject object) {
        this.object = object;
        this.startTime = new Date(object.getLong("start_time"));
        this.sequenceId = object.getLong("match_seq_num");
        this.matchId = object.getLong("match_id");
        this.type = LobbyType.fromId(object.getInt("lobby_type"));

        ImmutableList.Builder<IPlayer> builder = new ImmutableList.Builder<>();

        ArrayList<IPlayer> players = new ArrayList<>();

        JSONArray array = object.getJSONArray("players");

        for (int x = 0; x < 5; x++) {
            JSONObject obj = array.getJSONObject(x);

            DotaPlayerReduced player = new DotaPlayerReduced(obj);

            builder.add(player);
            players.add(player);
        }

        this.radiant = new DotaTeamReduced(Side.RADIANT, players);

        players.clear();

        for (int x = 5; x < 10; x++) {
            JSONObject obj = array.getJSONObject(x);

            DotaPlayerReduced player = new DotaPlayerReduced(obj);

            builder.add(player);
            players.add(player);
        }

        this.dire = new DotaTeamReduced(Side.DIRE, players);
        this.players = builder.build();
    }

    @Override
    public boolean didRadiantWin() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getDuration() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getCluster() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getNegativeVotes() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getPositiveVotes() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getEngine() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getLeagueId() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getFirstBlood() {
        throw new UnsupportedOperationException();
    }

    @Override
    public long getMatchId() {
        return this.matchId;
    }

    @Override
    public long getSequenceId() {
        return this.sequenceId;
    }

    @Override
    public Date getStartTime() {
        return this.startTime;
    }

    @Override
    public ITeam getRadiant() {
        return this.radiant;
    }

    @Override
    public ITeam getDire() {
        return this.dire;
    }

    @Override
    public ITeam getWinner() {
        throw new UnsupportedOperationException();
    }

    @Override
    public ITeam getLoser() {
        throw new UnsupportedOperationException();
    }

    @Override
    public GameMode getGameMode() {
        throw new UnsupportedOperationException();
    }

    @Override
    public LobbyType getLobbyType() {
        return this.type;
    }

    @Override
    public ImmutableList<IPlayer> getPlayers() {
        return this.players;
    }

    @Override
    public JSONObject getJSONObject() {
        return this.object;
    }
}