package com.evolting.playerms.controllers;

import com.evolting.playerms.dtos.PlayerDto;
import com.evolting.playerms.helpers.PlayerSearchDto;
import com.evolting.playerms.services.PlayerService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/player")
@AllArgsConstructor
public class PlayerController {
    private final PlayerService playerService;

    @GetMapping
    public ResponseEntity<?> getAllPlayers(@RequestParam(defaultValue = "0") Integer pageNo,
                                           @RequestParam(defaultValue = "10") Integer pageSize,
                                           @RequestParam(defaultValue = "id") String sortBy) {
        return new ResponseEntity<>(playerService.getAllPlayers(pageNo, pageSize, sortBy), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getPlayerById(@PathVariable Integer id) {
        PlayerDto ret = playerService.getPlayerById(id);
        if (ret == null) {
            return new ResponseEntity<>("Player not found.", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(ret, HttpStatus.OK);
    }

    @GetMapping("/search")
    public ResponseEntity<?> searchPlayer(@RequestBody PlayerSearchDto playerSearchDto,
                                              @RequestParam(defaultValue = "0") Integer pageNo,
                                              @RequestParam(defaultValue = "10") Integer pageSize,
                                              @RequestParam(defaultValue = "id") String sortBy) {
        List<PlayerDto> ret = playerService.searchPlayer(playerSearchDto, pageNo, pageSize, sortBy);
        if (ret == null) {
            return new ResponseEntity<>("Player not found.", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(ret, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> createPlayer(@Valid @RequestBody PlayerDto playerDto) {
        PlayerDto ret = playerService.createPlayer(playerDto);
        if (ret == null) {
            return new ResponseEntity<>("Fail to register player data.", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(ret, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<?> updatePlayer(@Valid @RequestBody PlayerDto playerDto) {
        PlayerDto ret = playerService.updatePlayer(playerDto.getId(), playerDto);
        if (ret == null) {
            return new ResponseEntity<>("Fail to update player data.", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(ret, HttpStatus.OK);
    }

}
