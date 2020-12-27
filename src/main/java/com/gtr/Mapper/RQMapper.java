package com.gtr.Mapper;

import com.gtr.entity.RQ;

import java.util.List;

public interface RQMapper {
    //找到所有小区
    List<RQ> findAllRQ();
    //通过房子找小区
    List<RQ> findRQByHouse(int Hid);
    //通过小区号找小区
    RQ findRQById(int RQid);
    //添加新小区
    int insertRQ(RQ rq);
}
