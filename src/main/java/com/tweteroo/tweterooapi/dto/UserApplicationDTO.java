package com.tweteroo.tweterooapi.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record UserApplicationDTO(
    @NotNull @Size(min = 5, max = 30) String username,
    @NotNull String avatar
) {
    
}
