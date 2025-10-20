package com.evolting.playerms.services;

import com.evolting.playerms.dtos.request.PlayerRequestDto;
import com.evolting.playerms.helpers.PlayerSearchDto;

import java.util.List;

public interface PlayerService {
    List<PlayerRequestDto> getAllPlayers(Integer pageNo, Integer pageSize, String sortBy);
    PlayerRequestDto getPlayerById(Integer id);
    List<PlayerRequestDto> searchPlayer(PlayerSearchDto playerSearchDto, Integer pageNo, Integer pageSize, String sortBy);
    PlayerRequestDto createPlayer(PlayerRequestDto playerRequestDto);
    PlayerRequestDto updatePlayer(Integer id, PlayerRequestDto playerRequestDto);
    void deletePlayer(Integer id);
}
