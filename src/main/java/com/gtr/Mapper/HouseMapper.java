package com.gtr.Mapper;

import com.gtr.entity.H;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;


public interface HouseMapper {
    List<H> findAllHouse();
    H findHouseById(int Hid);
    List<H> selectHouse(@Param("com.gtr.entity.H") H house,int rentStart, int rentEnd);
}
