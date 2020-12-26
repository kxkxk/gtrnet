package com.gtr.Service.Page.Impl;

import com.gtr.Mapper.HouseMapper;
import com.gtr.Service.Page.HouseService;
import com.gtr.entity.H;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class HouseServiceImpl implements HouseService {
    @Autowired
    HouseMapper houseMapper;
    @Override
    public List<H> selectHouse(H house, int rentStart, int rentEnd) {
        return houseMapper.selectHouse(house,rentStart,rentEnd);
    }

    @Override
    public boolean newHouse(H house) {
        return false;
    }

    @Override
    public boolean modifyHouse(H house) {
        return false;
    }
}
