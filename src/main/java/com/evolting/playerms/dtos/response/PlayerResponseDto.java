package com.evolting.playerms.dtos.response;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PlayerResponseDto implements Serializable {
    private Integer id; // ID is often null on creation (POST), so no validation needed.
    private String firstName;
    private String lastName;
    private String avatarUrl;
    private LocalDate birthDate;
    private String position;
    private String nationality;
}
