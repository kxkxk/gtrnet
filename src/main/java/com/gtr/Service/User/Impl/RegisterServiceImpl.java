package com.gtr.Service.User.Impl;

import com.gtr.Mapper.UserMapper;
import com.gtr.Service.User.RegisterService;
import com.gtr.entity.U;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RegisterServiceImpl implements RegisterService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public boolean addUser(U user) {
        System.out.println(userMapper.insertUser(user));
        return userMapper.insertUser(user) > 0;
    }


    @Override
    public boolean deleteUser(String Uphone) {
        return userMapper.deleteUser(Uphone) > 0;
    }

}
