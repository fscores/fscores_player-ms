package com.evolting.playerms.helpers;

import com.evolting.playerms.entities.Player;
import jakarta.persistence.criteria.Expression;
import org.springframework.data.jpa.domain.Specification;
import jakarta.persistence.criteria.Predicate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PlayerSpecifications {

    public static Specification<Player> buildFromDto(PlayerSearchDto dto) {
        return (root, query, cb) -> {
            List<Predicate> predicates = new ArrayList<>();

            if (dto.getNameContains() != null && !dto.getNameContains().isEmpty()) {
                String search = "%" + dto.getNameContains().toLowerCase() + "%";
                Expression<String> fullName = cb.concat(
                        cb.concat(cb.lower(root.get("firstName")), " "),
                        cb.lower(root.get("lastName"))
                );
                predicates.add(cb.like(fullName, search));
            }

            if (dto.getLowerAge() != null) {
                LocalDate maxBirthDate = LocalDate.now().minusYears(dto.getLowerAge());
                predicates.add(cb.lessThanOrEqualTo(root.get("birthDate"), maxBirthDate));
            }

            if (dto.getUpperAge() != null) {
                LocalDate minBirthDate = LocalDate.now().minusYears(dto.getUpperAge() + 1).plusDays(1);
                predicates.add(cb.greaterThanOrEqualTo(root.get("birthDate"), minBirthDate));
            }

            if (dto.getPositions() != null && !dto.getPositions().isEmpty()) {
                predicates.add(root.get("position").in(dto.getPositions()));
            }

            if (dto.getNationality() != null && !dto.getNationality().isEmpty()) {
                predicates.add(root.get("nationality").in(dto.getNationality()));
            }

            // Combine all predicates with AND
            return cb.and(predicates.toArray(new Predicate[0]));
        };
    }
}
