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
//        if (userMapper.insertUser(user) > 0) {
//            return true;
//        } else {
//            return false;
//        }
        return userMapper.insertUser(user)>0 ? true:false;
    }


    @Override
    public boolean deleteUser(String Uphone) {
        if(userMapper.deleteUser(Uphone))
            return true;
        return false;
    }

}
