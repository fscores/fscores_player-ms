package com.evolting.playerms.utils.enums;

public enum PlayerPosition {
    GK("Goalkeeper"),
    CB("Center Back"),
    RB("Right Back"),
    LB("Left Back"),
    RWB("Right Wing Back"),
    LWB("Left Wing Back"),
    CDM("Central Defensive Midfielder"),
    CM("Central Midfielder"),
    CAM("Central Attacking Midfielder"),
    RM("Right Midfielder"),
    LM("Left Midfielder"),
    RW("Right Winger"),
    LW("Left Winger"),
    CF("Center Forward"),
    ST("Striker");

    private final String position;

    // Constructor
    PlayerPosition(String position) {
        this.position = position;
    }

    public String getFullName() {
        return position;
    }

    public static PlayerPosition fromFullName(String name) {
        for (PlayerPosition position : PlayerPosition.values()) {
            if (position.position.equalsIgnoreCase(name)) {
                return position;
            }
        }
        return null;
    }
}
