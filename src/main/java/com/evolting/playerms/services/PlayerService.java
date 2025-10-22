package com.evolting.playerms.services;

import com.evolting.playerms.dtos.request.PlayerRequestDto;
import com.evolting.playerms.dtos.response.PlayerResponseDto;
import com.evolting.playerms.dtos.request.PlayerSearchDto;

import java.util.List;

public interface PlayerService {
    List<PlayerResponseDto> getAllPlayers(Integer pageNo, Integer pageSize, String sortBy);
    PlayerResponseDto getPlayerById(Integer id);
    List<PlayerResponseDto> searchPlayer(PlayerSearchDto playerSearchDto, Integer pageNo, Integer pageSize, String sortBy);
    PlayerResponseDto createPlayer(PlayerRequestDto playerRequestDto);
    PlayerResponseDto updatePlayer(Integer id, PlayerRequestDto playerRequestDto);
    void deletePlayer(Integer id);
}
