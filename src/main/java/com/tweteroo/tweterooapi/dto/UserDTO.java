package com.tweteroo.tweterooapi.dto;

import org.hibernate.validator.constraints.URL;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record UserDTO(
    @NotNull @Size(min = 5, max = 30) String username,
    @NotNull @URL String avatar
) {
    
}
