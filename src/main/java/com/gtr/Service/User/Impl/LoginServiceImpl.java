package com.gtr.Service.User.Impl;

import com.gtr.Mapper.UserMapper;
import com.gtr.Service.User.LoginService;
import com.gtr.entity.U;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    UserMapper userMapper;
    @Override
    public U findUser(int Uid) {
        return userMapper.findUserById(Uid);
    }
}
