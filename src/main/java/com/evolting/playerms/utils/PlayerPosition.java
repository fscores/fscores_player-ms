package com.evolting.playerms.utils;

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

    /**
     * Returns the full, descriptive name of the player position.
     * Example: PlayerPosition.CDM.getPosition() -> "Central Defensive Midfielder"
     */
    public String getPosition() {
        return position;
    }

    /**
     * Helper method to look up an Enum constant by its full name (case-insensitive).
     * @param name The full name of the position.
     * @return The matching PlayerPosition enum constant, or null if not found.
     */
    public static PlayerPosition fromPosition(String name) {
        for (PlayerPosition position : PlayerPosition.values()) {
            if (position.position.equalsIgnoreCase(name)) {
                return position;
            }
        }
        return null;
    }
}
