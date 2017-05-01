package com.dragovorn.dotaapi.match;

import com.dragovorn.dotaapi.match.player.DotaPlayer;
import com.dragovorn.dotaapi.match.player.IPlayer;
import com.dragovorn.dotaapi.match.team.DotaTeam;
import com.dragovorn.dotaapi.match.team.ITeam;
import com.dragovorn.dotaapi.match.team.Side;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Date;

/**
 * Default implementation of {@link com.dragovorn.dotaapi.IDota}.
 *
 * @author Andrew Burr
 * @version 1
 * @since 0.0.1
 */
public class DotaMatch implements IMatch {

    private final JSONObject object;

    private final ITeam radiant;
    private final ITeam dire;

    private final Date startTime;

    private final long matchId;
    private final long matchSeqId;

    private final int duration;
    private final int firstBlood;

    private final boolean radiantWin;

    public DotaMatch(JSONObject object) {
        this.object = object;
        this.startTime = new Date(object.getLong("start_time"));
        this.matchId = object.getLong("match_id");
        this.matchSeqId = object.getLong("match_seq_num");
        this.duration = object.getInt("duration");
        this.firstBlood = object.getInt("first_blood_time");
        this.radiantWin = object.getBoolean("radiant_win");

        ArrayList<IPlayer> players = new ArrayList<>();

        JSONArray array = object.getJSONArray("players");

        for (int x = 0; x < 5; x++) {
            JSONObject obj = array.getJSONObject(x);

            players.add(new DotaPlayer(obj));
        }

        this.radiant = new DotaTeam(Side.RADIANT, object.getInt("tower_status_radiant"), object.getInt("barracks_status_radiant"), this.radiantWin, players);

        players.clear();

        for (int x = 5; x < 10; x++) {
            JSONObject obj = array.getJSONObject(x);

            players.add(new DotaPlayer(obj));
        }

        this.dire = new DotaTeam(Side.DIRE, object.getInt("tower_status_dire"), object.getInt("barracks_status_dire"), !this.radiantWin, players);
    }

    @Override
    public boolean didRadiantWin() {
        return this.radiantWin;
    }

    @Override
    public int getDuration() {
        return this.duration;
    }

    @Override
    public int getFirstBlood() {
        return this.firstBlood;
    }

    @Override
    public long getMatchId() {
        return this.matchId;
    }

    @Override
    public long getSequenceId() {
        return this.matchSeqId;
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
        return (this.radiantWin ? this.radiant : this.dire);
    }

    @Override
    public JSONObject getJSONObject() {
        return object;
    }
}