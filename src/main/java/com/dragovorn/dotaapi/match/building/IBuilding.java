package com.dragovorn.dotaapi.match.building;

/**
 * Object that represents a building in an {@link com.dragovorn.dotaapi.match.IMatch}.
 * Default implementation: {@link Building}.
 *
 * @author Andrew Burr
 * @version 1
 * @since 0.0.1
 */
public interface IBuilding {

    /**
     * Gets the type of building.
     *
     * @return The type of building.
     */
    Type getType();

    /**
     * Gets the lane of the building.
     *
     * @return The lane of the building.
     */
    Lane getLane();

    /**
     * Gets the tier of the building.
     *
     * @return The tier of the building.
     */
    int getTier();
}