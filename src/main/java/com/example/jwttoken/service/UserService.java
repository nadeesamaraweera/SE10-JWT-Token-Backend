package com.example.jwttoken.service;

import com.example.jwttoken.dto.UserDTO;

//07
public interface UserService {
    int saveUser (UserDTO userDTO);
    UserDTO searchUser(String userName);
}
