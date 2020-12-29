package com.gtr.Mapper;

import com.gtr.entity.H;

import java.util.List;


public interface HouseMapper {
    List<H> findAllHouse();
    H findHouseById(int Hid);
    List<H> selectHouse(H house);
    int newHouse(H house);
    int updateHouse(H house);
    int updateImg(int Hid,String IPath);
    String getImg(int Hid);
}
