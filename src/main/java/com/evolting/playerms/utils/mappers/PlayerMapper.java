package com.evolting.playerms.utils.mappers;

import com.evolting.playerms.dtos.request.PlayerRequestDto;
import com.evolting.playerms.dtos.response.PlayerResponseDto;
import com.evolting.playerms.entities.Player;
import com.evolting.playerms.utils.enums.Nationality;
import com.evolting.playerms.utils.enums.PlayerPosition;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PlayerMapper {
    public static Player toEntity(PlayerRequestDto playerRequestDto) {
        return Player.builder()
                .firstName(playerRequestDto.getFirstName())
                .lastName(playerRequestDto.getLastName())
                .birthDate(playerRequestDto.getBirthDate())
                .position(PlayerPosition.fromFullName(playerRequestDto.getPosition()))
                .nationality(Nationality.fromFullName(playerRequestDto.getNationality()))
                .build();
    }

    public static PlayerResponseDto toResponse(Player entity) {
        return PlayerResponseDto.builder()
                .id(entity.getId())
                .firstName(entity.getFirstName())
                .lastName(entity.getLastName())
                .avatarUrl(entity.getAvatarUrl())
                .birthDate(entity.getBirthDate())
                .position(entity.getPosition().getFullName())
                .nationality(entity.getNationality().getFullName())
                .build();
    }
}
