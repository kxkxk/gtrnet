package com.gtr.Service.User;

import com.gtr.entity.U;

public interface LoginService {
    U findUser(int Uid);
    U getUser(String uname);
}
