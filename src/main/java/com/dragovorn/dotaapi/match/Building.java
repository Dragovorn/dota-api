package com.dragovorn.dotaapi.match;

import java.util.ArrayList;
import java.util.List;

/**
 * Enum to help keep track of buildings in a match
 *
 * @author Andrew Burr
 * @version 1
 * @since 0.0.1
 */
public class Building {

    private Type type;

    private Lane lane;

    private int tier;

    /**
     * Basic constructor for a building
     *
     * @param type Type of building.
     * @param lane Lane of the building.
     * @param tier Tier of the building.
     */
    private Building(Type type, Lane lane, int tier) {
        this.type = type;
        this.lane = lane;
        this.tier = tier;
    }

    /**
     * Gets the type of building.
     *
     * @return The type of building.
     */
    public Type getType() {
        return this.type;
    }

    /**
     * Gets the lane of the building.
     *
     * @return The lane of the building.
     */
    public Lane getLane() {
        return this.lane;
    }

    /**
     * Gets the tier of the building.
     *
     * @return The tier of the building.
     */
    public int getTier() {
        return this.tier;
    }

    /**
     * Deduces the buildings left in a game from the bit passed in.
     *
     * @param bit The bit to deduce the remaining buildings from.
     * @param rax Weather or not the bit passed in is the rax bit.
     * @return A list of buildings remaining deduced from the bit.
     */
    public static List<Building> deduceFromBit(int bit, boolean rax) {
        if (!rax) {
            String bin = Integer.toBinaryString(0x10000 | bit).substring(1);
        }

        // TODO

        return new ArrayList<>();
    }

    /**
     * Enum to represent the lane of a building.
     *
     * @author Andrew Burr
     * @version 1.1
     * @since 0.0.1
     */
    public enum Lane {
        BOT,
        MID,
        TOP
    }

    /**
     * Enum to represent the type of a building.
     *
     * @author Andrew Burr
     * @version 1
     * @since 0.0.1
     */
    public enum Type {
        TOWER,
        SHRINE,
        RANGEDRAX,
        MELEERAX,
        ANCHIENT
    }
}