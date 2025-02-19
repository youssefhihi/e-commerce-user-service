package com.ys.ecommerce.model.objectValue;

import jakarta.validation.constraints.NotBlank;

public record FullName(
        @NotBlank(message = "Full name is required.")
        String firstName,
        @NotBlank(message = "Full name is required.")
        String lasTName
) {
}
