package com.evolting.playerms.services.impl;

import com.evolting.playerms.dtos.PlayerDto;
import com.evolting.playerms.entities.Player;
import com.evolting.playerms.repositories.PlayerRepository;
import com.evolting.playerms.services.PlayerService;
import com.evolting.playerms.utils.PlayerMapper;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class PlayerServiceImpl implements PlayerService {
    private final PlayerRepository playerRepository;

    @Cacheable(value = "players", key = "'allPlayers'")
    @Override
    public List<PlayerDto> getAllPlayers() {
        List<PlayerDto> playerDtos = new ArrayList<>();
        try {
            playerDtos = playerRepository.findAll()
                    .stream()
                    .map(PlayerMapper::toDto)
                    .toList();
        } catch (Exception e) {
            log.error("Error retrieving all players", e);
        }
        return playerDtos;
    }

    @Cacheable(value = "players", key = "#id")
    @Override
    public PlayerDto getPlayerById(Integer id) {
        PlayerDto playerDto = new PlayerDto();
        try {
            Player player = playerRepository.findById(id)
                    .orElseThrow(() -> new EntityNotFoundException("Player not found with ID: " + id));
            playerDto = PlayerMapper.toDto(player);
        } catch (Exception e) {
            log.error("Error retrieving player with ID {}", id, e);
        }
        return playerDto;
    }

    @CacheEvict(value = "players", allEntries = true)
    @Override
    public PlayerDto createPlayer(PlayerDto playerDto) {
        try {
            Player player = playerRepository.save(PlayerMapper.toEntity(playerDto));
            return PlayerMapper.toDto(player);
        } catch (Exception e) {
            log.error("Error creating player", e);
        }
        return null;
    }


    @CacheEvict(value = "players", allEntries = true)
    @Override
    public PlayerDto updatePlayer(Integer id, PlayerDto playerDto) {
        return null;
    }


    @CacheEvict(value = "players", allEntries = true)
    @Override
    public void deletePlayer(Integer id) {

    }
}
