package com.ys.ecommerce.dto.request;

import com.ys.ecommerce.model.objectValue.FullName;
import jakarta.persistence.Embedded;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record UpdateProfileRequestDto(

        @NotBlank(message = "Username is required.")
        @Size(min = 3, max = 50, message = "Username must be between 3 and 50 characters.")
        String username,

        @NotBlank(message = "Email is required.")
        @Email(message = "Email must be valid.")
        String email,

        @Valid
        @NotNull(message = "Full name is required.")
        FullName fullName
) {}