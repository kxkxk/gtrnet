package com.gtr.Service.Page;

import com.gtr.entity.H;

import java.util.List;

public interface HouseService {
    List<H> getHouseByRQ(int RQid);
    List<H> getHouseByHrent(int start, int end);
    List<H> getHouseByHmethod(String Hmethod);
    List<H> getHouseByHstructure(String Hstructure);
}
