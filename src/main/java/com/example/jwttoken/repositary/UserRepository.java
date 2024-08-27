package com.example.jwttoken.repositary;

import com.example.jwttoken.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

//06
public interface UserRepository extends JpaRepository<User,String> {

    User findByEmail(String userName);

    boolean existsByEmail(String userName);

    int deleteByEmail (String userName);

}
