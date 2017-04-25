package com.dragovorn.dotaapi.match;

import com.dragovorn.dotaapi.match.building.Building;
import com.dragovorn.dotaapi.match.building.BuildingLane;
import com.dragovorn.dotaapi.match.building.BuildingType;
import com.google.common.collect.ImmutableList;
import org.json.JSONObject;

import java.util.Date;
import java.util.List;

/**
 * Default implementation of {@link com.dragovorn.dotaapi.IDota}.
 *
 * @author Andrew Burr
 * @version 0.1
 * @since 0.0.1
 */
public class DotaMatch implements IMatch {

    private final ImmutableList<Building> imutRadiantBuildings;
    private final ImmutableList<Building> imutDireBuildings;

    private final Date startTime;

    private final long matchId;
    private final long matchSeqId;

    private final int duration;

    private final boolean radiantWin;

    public DotaMatch(JSONObject object) {
        this.startTime = new Date(object.getLong("start_time"));
        this.matchId = object.getLong("match_id");
        this.matchSeqId = object.getLong("match_seq_num");
        this.duration = object.getInt("duration");
        this.radiantWin = object.getBoolean("radiant_win");

        List<Building> radiantBuildings = Building.deduceFromDecimal(object.getInt("tower_status_radiant"), false);
        radiantBuildings.addAll(Building.deduceFromDecimal(object.getInt("barracks_status_radiant"), true));
        List<Building> direBuildings = Building.deduceFromDecimal(object.getInt("tower_status_dire"), false);
        direBuildings.addAll(Building.deduceFromDecimal(object.getInt("barracks_status_dire"), true));

        if (this.radiantWin) {
            radiantBuildings.add(new Building(BuildingType.ANCIENT, BuildingLane.MID, 0));
        } else {
            direBuildings.add(new Building(BuildingType.ANCIENT, BuildingLane.MID, 0));
        }

        // TODO

        this.imutRadiantBuildings = new ImmutableList.Builder<Building>().addAll(radiantBuildings).build();
        this.imutDireBuildings = new ImmutableList.Builder<Building>().addAll(direBuildings).build();
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
    public ImmutableList<Building> getRadiantBuildings() {
        return this.imutRadiantBuildings;
    }

    @Override
    public ImmutableList<Building> getDireBuildings() {
        return this.imutDireBuildings;
    }
}