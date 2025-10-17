package com.evolting.playerms.utils;

import com.evolting.playerms.dtos.PlayerDto;
import com.evolting.playerms.entities.Player;

public class PlayerMapper {

    /**
     * Converts a Player Entity to a Player DTO.
     *
     * @param player The strongly-typed JPA entity.
     * @return The DTO object for API transport.
     */
    public static PlayerDto toDto(Player player) {
        if (player == null) {
            return null;
        }

        PlayerDto dto = new PlayerDto();
        dto.setId(player.getId());
        dto.setFirstName(player.getFirstName());
        dto.setLastName(player.getLastName());
        dto.setBirthDate(player.getBirthDate());

        // Convert Enums to their String names (e.g., GK, BRAZIL) for the DTO
        if (player.getPosition() != null) {
            dto.setPosition(player.getPosition().name());
        }
        if (player.getNationality() != null) {
            dto.setNationality(player.getNationality().name());
        }

        return dto;
    }

    /**
     * Converts a Player DTO to a Player Entity.
     * This is the "setter" method, responsible for converting API strings back into strong Enum types.
     *
     * @param dto The DTO object received from the API.
     * @return The Entity object ready for database persistence.
     */
    public static Player toEntity(PlayerDto dto) {
        if (dto == null) {
            return null;
        }

        Player entity = new Player();
        entity.setId(dto.getId());
        entity.setFirstName(dto.getFirstName());
        entity.setLastName(dto.getLastName());
        entity.setBirthDate(dto.getBirthDate());

        if (dto.getPosition() != null && !dto.getPosition().isEmpty()) {
            try {
                PlayerPosition position = PlayerPosition.valueOf(dto.getPosition().toUpperCase());
                entity.setPosition(position);
            } catch (IllegalArgumentException e) {
                System.err.println("Invalid PlayerPosition string in DTO: " + dto.getPosition());
                entity.setPosition(null);
            }
        }

        if (dto.getNationality() != null && !dto.getNationality().isEmpty()) {
            try {
                Nationality nationality = Nationality.valueOf(dto.getNationality().toUpperCase());
                entity.setNationality(nationality);
            } catch (IllegalArgumentException e) {
                System.err.println("Invalid Nationality string in DTO: " + dto.getNationality());
                entity.setNationality(null);
            }
        }

        return entity;
    }
}
