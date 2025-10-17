package com.evolting.playerms.controllers;

import com.evolting.playerms.dtos.PlayerDto;
import com.evolting.playerms.services.PlayerService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/player")
@AllArgsConstructor
public class PlayerController {
    private final PlayerService playerService;

    @GetMapping
    public ResponseEntity<?> getAllPlayers() {
        return new ResponseEntity<>(playerService.getAllPlayers(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getPlayerById(@PathVariable Integer id) {
        PlayerDto playerDto = playerService.getPlayerById(id);
        if (playerDto == null) {
            return new ResponseEntity<>("Player not found.", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(playerService.getPlayerById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> createPlayer(@Valid @RequestBody PlayerDto playerDto) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @PutMapping
    public ResponseEntity<?> updatePlayer() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
