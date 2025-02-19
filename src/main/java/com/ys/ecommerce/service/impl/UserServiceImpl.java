package com.ys.ecommerce.service.impl;

import com.ys.ecommerce.dto.request.UpdateProfileRequestDto;
import com.ys.ecommerce.dto.response.UserResponseDto;
import com.ys.ecommerce.mapper.UserMapper;
import com.ys.ecommerce.model.entity.User;
import com.ys.ecommerce.repository.UserRepository;
import com.ys.ecommerce.service.UserService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
public class UserServiceImpl implements UserService {
    private final UserRepository repository;
    private final UserMapper mapper;

    @Override
    public UserResponseDto updateProfile(Long id ,UpdateProfileRequestDto requestDto) {
        User user = repository.findById(id).orElseThrow();
        if (!requestDto.username().equals(user.getUsername()))
            repository.findByUsername(requestDto.username()).orElseThrow();
        if (!requestDto.email().equals(user.getEmail()))
            repository.findByEmail(requestDto.email()).orElseThrow();

        user.setEmail(requestDto.email());
        user.setFullName(requestDto.fullName());
        user.setUsername(requestDto.username());

        return mapper.toDto(user);
    }
}
