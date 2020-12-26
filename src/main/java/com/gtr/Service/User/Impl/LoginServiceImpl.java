package com.gtr.Service.User.Impl;

import com.gtr.Mapper.UserMapper;
import com.gtr.Service.User.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    UserMapper userMapper;
    @Override
    public boolean findUser(int Uid) {
        return false;
    }
}
