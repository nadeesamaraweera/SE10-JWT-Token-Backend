package com.example.jwttoken.dto;
//2

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class UserDTO {

        private String email;
        private String password;
        private String name;
        private String CompanyName;
        private String role;
    }
