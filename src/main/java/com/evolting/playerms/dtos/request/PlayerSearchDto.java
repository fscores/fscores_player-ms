package com.evolting.playerms.dtos.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayerSearchDto {
    private String nameContains;
    private Integer upperAge;
    private Integer lowerAge;

    private Set<String> positions;
    private Set<String> nationality;
}
