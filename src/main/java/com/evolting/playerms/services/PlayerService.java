package com.evolting.playerms.services;

import com.evolting.playerms.dtos.PlayerDto;
import com.evolting.playerms.helpers.PlayerSearchDto;

import java.util.List;

public interface PlayerService {
    List<PlayerDto> getAllPlayers(Integer pageNo, Integer pageSize, String sortBy);
    PlayerDto getPlayerById(Integer id);
    List<PlayerDto> searchPlayer(PlayerSearchDto playerSearchDto, Integer pageNo, Integer pageSize, String sortBy);
    PlayerDto createPlayer(PlayerDto playerDto);
    PlayerDto updatePlayer(Integer id, PlayerDto playerDto);
    void deletePlayer(Integer id);
}
