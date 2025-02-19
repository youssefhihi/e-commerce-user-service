package com.ys.ecommerce.mapper;


import com.ys.ecommerce.dto.response.UserResponseDto;
import com.ys.ecommerce.model.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserResponseDto toDto(User user);
}
