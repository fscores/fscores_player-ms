package com.evolting.playerms.entities;

import com.evolting.playerms.utils.enums.Nationality;
import com.evolting.playerms.utils.enums.PlayerPosition;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    private String avatarUrl;
    private LocalDate birthDate;

    @Enumerated(EnumType.STRING)
    private PlayerPosition position;

    @Enumerated(EnumType.STRING)
    private Nationality nationality;
}
