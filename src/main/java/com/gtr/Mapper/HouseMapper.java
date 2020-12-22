package com.gtr.Mapper;

import com.gtr.entity.H;
import org.springframework.stereotype.Component;

import java.util.List;


public interface HouseMapper {
    List<H> findAllHouse();
}
