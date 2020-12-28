package com.gtr.Service.House.Impl;

import com.gtr.Mapper.HouseMapper;
import com.gtr.Service.House.HouseService;
import com.gtr.entity.H;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HouseServiceImpl implements HouseService {
    @Autowired
    HouseMapper houseMapper;
    @Override
    public List<H> selectHouse(H house) {
        return houseMapper.selectHouse(house);
    }

    @Override
    public boolean newHouse(H house) {
        return houseMapper.newHouse(house)>0;
    }

    @Override
    public boolean modifyHouse(H house) {
        return houseMapper.updateHouse(house)>0;
    }

    @Override
    public H findHouse(int Hid) {
        return houseMapper.findHouseById(Hid);
    }
}
