package com.ys.ecommerce.dto.response;

import com.ys.ecommerce.model.objectValue.FullName;

public record UserResponseDto (
        String username,
        String email,
        FullName fullName
){
}
