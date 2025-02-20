package com.ys.ecommerce.dto.request;
import com.ys.ecommerce.model.objectValue.FullName;
import jakarta.validation.constraints.*;

public record UserRegisterRequestDto(
        @NotBlank(message = "Username is required")
        @Size(min = 3, max = 20, message = "Username must be between 3 and 20 characters")
        String username,

        @NotBlank(message = "Email is required")
        @Email(message = "Invalid email format")
        String email,

        @NotBlank(message = "Password is required")
        @Size(min = 4, message = "Password must be at least 4 characters")
        String password,

        @NotNull(message = "Full name is required")
        FullName fullName
) {}

