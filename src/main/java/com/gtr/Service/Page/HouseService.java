package com.gtr.Service.Page;

import com.gtr.entity.H;

import java.util.List;

public interface HouseService {
    List<H> selectHouse(H house, int rentStart, int rentEnd);
    boolean newHouse(H house);
    boolean modifyHouse(H house);
}
