package com.dragovorn.dotaapi.match.lobby;

public enum LobbyType {

    INVALID(-1),
    PUBLIC_MATCHMAKING(0),
    PRACTICE(1),
    TOURNAMENT(2),
    TUTORIAL(3),
    COOP_WITH_AI(4),
    TEAM_MATCH(5),
    SOLO_QUEUE(6),
    RANKED_MATCHMAKING(7),
    SOLO_MID_1_V_1(8);

    private final int id;

    LobbyType(int id) {
        this.id = id;
    }

    public int id() {
        return this.id;
    }

    public static LobbyType fromId(int id) {
        for (LobbyType type : values()) {
            if (type.id() == id) {
                return type;
            }
        }

        throw new IllegalArgumentException();
    }
}