package com.gtr.Mapper;

import com.gtr.entity.RQ;

import java.util.List;

public interface RQMapper {
    //找到所有小区
    List<RQ> findAllRQ();
    //通过房子找小区
    List<RQ> findRQByHouse(int Hid);
}
