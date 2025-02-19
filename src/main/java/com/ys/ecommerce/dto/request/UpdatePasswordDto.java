package com.ys.ecommerce.dto.request;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UpdatePasswordDto(

        @NotBlank(message = "Current password is required.")
        @Size(min = 4, message = "Current password must be least 4 characters.")
        String currentPassword,

        @NotBlank(message = "New password is required.")
        @Size(min = 4, message = "New password must be least 4 characters.")
        String newPassword
) {}
