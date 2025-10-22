package com.evolting.playerms.services.impl;

import com.evolting.playerms.dtos.request.PlayerRequestDto;
import com.evolting.playerms.dtos.response.PlayerResponseDto;
import com.evolting.playerms.dtos.request.PlayerSearchDto;
import com.evolting.playerms.entities.Player;
import com.evolting.playerms.helpers.PlayerSpecifications;
import com.evolting.playerms.repositories.PlayerRepository;
import com.evolting.playerms.services.PlayerService;
import com.evolting.playerms.utils.mappers.PlayerMapper;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class PlayerServiceImpl implements PlayerService {
    private final PlayerRepository playerRepository;

    @Cacheable(value = "players", key = "'list-' + #pageNo + '-' + #pageSize + '-' + #sortBy")
    @Override
    public List<PlayerResponseDto> getAllPlayers(Integer pageNo, Integer pageSize, String sortBy) {
        List<PlayerResponseDto> playerResponseDtos = new ArrayList<>();
        try {
            Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));
            playerResponseDtos = playerRepository.findAll(paging)
                    .stream()
                    .map(PlayerMapper::toResponse)
                    .toList();
        } catch (Exception e) {
            log.error("Error retrieving all players", e);
        }
        return playerResponseDtos;
    }

    @Cacheable(value = "players", key = "#id")
    @Override
    public PlayerResponseDto getPlayerById(Integer id) {
        PlayerResponseDto playerResponseDto = null;
        try {
            Player player = playerRepository.findById(id)
                    .orElseThrow(() -> new EntityNotFoundException("Player not found with ID: " + id));
            playerResponseDto = PlayerMapper.toResponse(player);
        } catch (Exception e) {
            log.error("Error retrieving player with ID {}", id, e);
        }
        return playerResponseDto;
    }

    @Override
    public List<PlayerResponseDto> searchPlayer(PlayerSearchDto playerSearchDto, Integer pageNo, Integer pageSize, String sortBy) {
        List<PlayerResponseDto> playerResponseDtos = new ArrayList<>();
        try {
            Specification<Player> spec = PlayerSpecifications.buildFromDto(playerSearchDto);
            Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));

            return playerRepository.findAll(spec, paging)
                    .stream()
                    .map(PlayerMapper::toResponse)
                    .toList();
        } catch (Exception e) {
            log.error("Error retrieving all players", e);
        }
        return playerResponseDtos;
    }

    @CacheEvict(value = "players", allEntries = true)
    @Override
    public PlayerResponseDto createPlayer(PlayerRequestDto playerRequestDto) {
        try {
            Player player = playerRepository.save(PlayerMapper.toEntity(playerRequestDto));
            return PlayerMapper.toResponse(player);
        } catch (Exception e) {
            log.error("Error creating player", e);
        }
        return null;
    }


    @CacheEvict(value = "players", allEntries = true)
    @Override
    public PlayerResponseDto updatePlayer(Integer id, PlayerRequestDto playerRequestDto) {
        try {
            Player player = PlayerMapper.toEntity(playerRequestDto);
            player.setId(id);
            player = playerRepository.save(player);
            return PlayerMapper.toResponse(player);
        } catch (Exception e) {
            log.error("Error updating player", e);
        }
        return null;
    }


    @CacheEvict(value = "players", allEntries = true)
    @Override
    public void deletePlayer(Integer id) {
        try {
            playerRepository.deleteById(id);
        } catch (Exception e) {
            log.error("Error deleting player with ID {}", id, e);
        }
    }
}
