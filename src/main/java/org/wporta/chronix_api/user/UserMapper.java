package org.wporta.chronix_api.user;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {
    RegisterUserRequest toRegisterUserRequest(User user);
    UserDto toUserDto(User user);

    @Mapping(target = "role", expression = "java(Role.USER)")
    User toEntity(RegisterUserRequest registerUserRequest);
}