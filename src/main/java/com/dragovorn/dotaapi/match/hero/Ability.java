package com.dragovorn.dotaapi.match.hero;

import com.dragovorn.dotaapi.match.hero.generated.AbilityType;

/**
 * Represents an ability in Dota.
 */
public class Ability {

    private final int level;
    private final int time;

    private final AbilityType type;

    public Ability(int id, int level, int time) {
        this(AbilityType.fromId(id), level, time);
    }

    private Ability(AbilityType type, int level, int time) {
        this.type = type;
        this.level = level;
        this.time = time;
    }

    public AbilityType getType() {
        return this.type;
    }

    public int getLevel() {
        return this.level;
    }

    public int getTime() {
        return this.time;
    }
}