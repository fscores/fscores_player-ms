package com.evolting.playerms.dtos.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayerRequestDto {
    private Integer id;

    @NotBlank(message = "First name is a mandatory field.")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "Last name can only contain letters.")
    @Length(min = 1, max = 30, message = "First name must be between 1 and 30 characters.")
    private String firstName;

    @NotBlank(message = "Last name is a mandatory field.")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "Last name can only contain letters.")
    @Length(min = 1, max = 30, message = "Last name must be between 1 and 30 characters.")
    private String lastName;

    @NotNull(message = "Birth date is a mandatory field.")
    @Past(message = "Birth date must be in the past.")
    private LocalDate birthDate;

    @NotBlank(message = "Position is a mandatory field.")
    private String position;

    @NotBlank(message = "Nationality is a mandatory field.")
    private String nationality;
}
