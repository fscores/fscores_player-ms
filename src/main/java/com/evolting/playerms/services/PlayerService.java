package com.evolting.playerms.services;

import com.evolting.playerms.dtos.PlayerDto;

import java.util.List;

public interface PlayerService {
    List<PlayerDto> getAllPlayers();
    PlayerDto getPlayerById(Integer id);
    PlayerDto createPlayer(PlayerDto playerDto);
    PlayerDto updatePlayer(Integer id, PlayerDto playerDto);
    void deletePlayer(Integer id);
}
