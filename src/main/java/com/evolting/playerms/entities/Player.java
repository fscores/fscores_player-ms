package com.evolting.playerms.entities;

import com.evolting.playerms.utils.Nationality;
import com.evolting.playerms.utils.PlayerPosition;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    @Enumerated(EnumType.STRING)
    private PlayerPosition position;

    @Enumerated(EnumType.STRING)
    private Nationality nationality;
}
