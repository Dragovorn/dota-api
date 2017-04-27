package com.dragovorn.dotaapi.match.building;

import java.util.ArrayList;
import java.util.List;

/**
 * Object that represents a building in a match
 *
 * @author Andrew Burr
 * @version 1.1
 * @since 0.0.1
 */
public class Building implements IBuilding {

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
    public Building(Type type, Lane lane, int tier) {
        this.type = type;
        this.lane = lane;
        this.tier = tier;
    }

    /**
     * Gets the type of building.
     *
     * @return The type of building.
     */
    @Override
    public Type getType() {
        return this.type;
    }

    /**
     * Gets the lane of the building.
     *
     * @return The lane of the building.
     */
    @Override
    public Lane getLane() {
        return this.lane;
    }

    /**
     * Gets the tier of the building.
     *
     * @return The tier of the building.
     */
    @Override
    public int getTier() {
        return this.tier;
    }

    /**
     * Deduces the buildings left in a game from the bit passed in.
     *
     * @param decimal The decimal to deduce the remaining buildings from.
     * @param rax Weather or not the bit passed in is the rax bit.
     * @return A list of buildings remaining deduced from the bit.
     */
    public static List<IBuilding> deduceFromDecimal(int decimal, boolean rax) {
        if (decimal == 0) {
            return new ArrayList<>();
        }

        ArrayList<IBuilding> list = new ArrayList<>();

        if (!rax) {
            String bin = Integer.toBinaryString(0x10000 | decimal).substring(7);

            int binLoc = 0;

            for (int x = 0; x < 3; x++) {
                for (int y = 3; y > 0; y--) {
                    if (bin.charAt(binLoc++) == '1') {
                        list.add(new Building(Type.TOWER, Lane.values()[x], y));
                    }
                }
            }
        } else {
            String bin = Integer.toBinaryString(0x100 | decimal).substring(3);

            int binLoc = 0;

            for (int x = 0; x < 3; x++) {
                for (int y = 0; y < 2; y++) {
                    if (bin.charAt(binLoc++) == '1') {
                        list.add(new Building(Type.values()[y + 2], Lane.values()[x], 0));
                    }
                }
            }
        }

        return list;
    }

    @Override
    public String toString() {
        return "{Building: TYPE: " + this.type + ", LANE: " + this.lane + " TIER: " + this.tier + "}";
    }
}