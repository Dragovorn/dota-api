package com.dragovorn.dotaapi.match;

import org.json.JSONObject;

import java.util.Date;

/**
 * Default implementation of {@link com.dragovorn.dotaapi.IDota}.
 *
 * @author Andrew Burr
 * @version 0.1
 * @since 0.0.1
 */
public class DotaMatch implements IMatch {

    private final Date startTime;

    private final String matchId;
    private final String matchSeqId;

    private final int duration;

    private final boolean radiantWin;

    public DotaMatch(JSONObject object) {
        this.startTime = new Date(object.getLong("start_time"));
        this.matchId = object.getString("match_id");
        this.matchSeqId = object.getString("match_seq_num");
        this.duration = object.getInt("duration");
        this.radiantWin = object.getBoolean("radiant_win");

        // TODO
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
    public String getMatchId() {
        return this.matchId;
    }

    @Override
    public String getSequenceId() {
        return this.matchSeqId;
    }

    @Override
    public Date getStartTime() {
        return this.startTime;
    }
}