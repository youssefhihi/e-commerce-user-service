package com.ys.ecommerce.api.controller;

import com.ys.ecommerce.api.helper.ApiResponse;
import com.ys.ecommerce.dto.request.UpdateProfileRequestDto;
import com.ys.ecommerce.dto.response.UserResponseDto;
import com.ys.ecommerce.model.entity.User;
import com.ys.ecommerce.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Validated
@RequiredArgsConstructor
public class UserController {
    private final UserService service;

    @GetMapping("/test")
    public String test() {
        return "hiiiiiiiii it wooooorks";
    }

    @PutMapping("update-profile")
    public ResponseEntity<ApiResponse<UserResponseDto>> updateProfile(@Validated @RequestBody UpdateProfileRequestDto requestDto) {
        UserResponseDto user = service.updateProfile(1L,requestDto);
        return ResponseEntity.ok(ApiResponse.success(user,"Profile updated successfully",200));
    }
}
