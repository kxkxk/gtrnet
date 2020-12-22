package com.gtr.Service.User;

import com.gtr.entity.U;

public interface RegisterService {
    boolean addUser(U user);
    boolean deleteUser(String Uphone);
}
