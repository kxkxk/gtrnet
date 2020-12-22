package com.gtr.Mapper;

import com.gtr.entity.U;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


public interface UserMapper {
    int insertUser(U user);
    U findAll();
    boolean deleteUser(String Uphone);
}
