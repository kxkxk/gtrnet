package com.gtr.Service.House;

import com.gtr.entity.H;

import java.util.List;

public interface HouseService {
    List<H> selectHouse(H house);
    boolean newHouse(H house);
    boolean modifyHouse(H house);
    H findHouse(int Hid);
    List<String> getImg(int Hid);
    List<H> getAllHouse();
}
