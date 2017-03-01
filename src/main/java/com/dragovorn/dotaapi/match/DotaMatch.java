package com.dragovorn.dotaapi.match;

import org.json.JSONObject;

import java.util.Date;

public class DotaMatch {

    private final Date startTime;

    private final String matchId;
    private final String matchSeqId;

    private final int duration;

    private final boolean radiantWin;
    private final boolean radiantTopT1;
    private final boolean radiantTopT2;
    private final boolean radiantTopT3;
    private final boolean radiantTopMeeleRax;
    private final boolean radiantTopRangedRax;
    private final boolean radiantMidT1;
    private final boolean radiantMidT2;
    private final boolean radiantMidT3;
    private final boolean radiantMidMeeleRax;
    private final boolean radiantMidRangedRax;
    private final boolean radiantMidFirstT4;
    private final boolean radiantMidSecondT4;
    private final boolean radiantBottomT1;
    private final boolean radiantBottomT2;
    private final boolean radiantBottomT3;
    private final boolean radiantBottomMeeleRax;
    private final boolean radiantBottomRangedRax;
    private final boolean direTopT1;
    private final boolean direTopT2;
    private final boolean direTopT3;
    private final boolean direTopMeeleRax;
    private final boolean direTopRangedRax;
    private final boolean direMidT1;
    private final boolean direMidT2;
    private final boolean direMidT3;
    private final boolean direMidMeeleRax;
    private final boolean direMidRangedRax;
    private final boolean direMidFirstT4;
    private final boolean direMidSecondT4;
    private final boolean direBottomT1;
    private final boolean direBottomT2;
    private final boolean direBottomT3;
    private final boolean direBottomMeeleRax;
    private final boolean direBottomRangedRax;

    public DotaMatch(JSONObject object) {
        this.startTime = new Date(object.getLong("start_time"));
        this.matchId = object.getString("match_id");
        this.matchSeqId = object.getString("match_seq_num");
        this.duration = object.getInt("duration");
        this.radiantWin = object.getBoolean("radiant_win");
        this.radiantTopT1 = false;
        this.radiantTopT2 = false;
        this.radiantTopT3 = false;
        this.radiantTopMeeleRax = false;
        this.radiantTopRangedRax = false;
        this.radiantMidT1 = false;
        this.radiantMidT2 = false;
        this.radiantMidT3 = false;
        this.radiantMidMeeleRax = false;
        this.radiantMidRangedRax = false;
        this.radiantMidFirstT4 = false;
        this.radiantMidSecondT4 = false;
        this.radiantBottomT1 = false;
        this.radiantBottomT2 = false;
        this.radiantBottomT3 = false;
        this.radiantBottomMeeleRax = false;
        this.radiantBottomRangedRax = false;
        this.direTopT1 = false;
        this.direTopT2 = false;
        this.direTopT3 = false;
        this.direTopMeeleRax = false;
        this.direTopRangedRax = false;
        this.direMidT1 = false;
        this.direMidT2 = false;
        this.direMidT3 = false;
        this.direMidMeeleRax = false;
        this.direMidRangedRax = false;
        this.direMidFirstT4 = false;
        this.direMidSecondT4 = false;
        this.direBottomT1 = false;
        this.direBottomT2 = false;
        this.direBottomT3 = false;
        this.direBottomMeeleRax = false;
        this.direBottomRangedRax = false;

        // TODO
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public String getMatchId() {
        return this.matchId;
    }

    public String getMatchSeqId() {
        return this.matchSeqId;
    }

    public int getDuration() {
        return this.duration;
    }

    public boolean hasRadiantWon() {
        return this.radiantWin;
    }
}