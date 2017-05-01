package com.dragovorn.dotaapi.match.hero;

public class Ability {

    private final int level;
    private final int time;

    private final Type type;

    public Ability(int id, int level, int time) {
        this(Type.fromId(id), level, time);
    }

    private Ability(Type type, int level, int time) {
        this.type = type;
        this.level = level;
        this.time = time;
    }

    public Type getType() {
        return this.type;
    }

    public int getLevel() {
        return this.level;
    }

    public int getTime() {
        return this.time;
    }

    public enum Type {
        ;

        private final int id;

        Type(int id) {
            this.id = id;
        }

        public int id() {
            return this.id;
        }

        public static Type fromId(int id) {
            for (Type type : values()) {
                if (type.id() == id) {
                    return type;
                }
            }

            throw new IllegalArgumentException("There is no ability " + id);
        }
    }
}