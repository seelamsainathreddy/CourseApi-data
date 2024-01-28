package io.javabrains.SocialWebsite.service;


import java.util.List;

import io.javabrains.SocialWebsite.dto.UserDto;
import io.javabrains.SocialWebsite.entity.User;

public interface UserService {

    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}