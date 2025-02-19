package com.ys.ecommerce.service;

import com.ys.ecommerce.dto.request.UpdateProfileRequestDto;
import com.ys.ecommerce.dto.response.UserResponseDto;

public interface UserService {
UserResponseDto updateProfile(Long id ,UpdateProfileRequestDto requestDto);
}
