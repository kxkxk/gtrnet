package com.gtr.Mapper;

import com.gtr.entity.U;

import java.util.List;


public interface UserMapper {
    int insertUser(U user);
    U findAll();
    int deleteUser(String Uphone);
    String findReleaseById(int Uid);
    String findCollectionById(int Uid);
    int updateUserCollection(int Uid, String Collection);
    int updateUserRelease(int Uid, String Release);
    int deleteUserCollection(int Uid,String newColl);
    int deleteUserRelease(int Uid,String newRel);
    int updateUserHead(int Uid,String IPath);
    U findUserById(int Uid);
}
