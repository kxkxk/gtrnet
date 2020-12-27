package com.gtr.Service.Img.Impl;

import com.gtr.Mapper.HouseMapper;
import com.gtr.Mapper.UserMapper;
import com.gtr.Service.Img.ImgService;
import com.gtr.entity.H;
import com.gtr.tools.longStringDeal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImgServiceImpl implements ImgService {
    @Autowired
    HouseMapper houseMapper;
    @Autowired
    UserMapper userMapper;
    @Autowired
    longStringDeal lsd;
    @Override
    public void addHouseImg(int Hid, String Ipath) {
        Ipath = "|" +Ipath;
        houseMapper.updateImg(Hid,Ipath);
    }

    @Override
    public void addUserHead(int Uid, String Ipath) {
        userMapper.updateUserHead(Uid,Ipath);
    }

    @Override
    public void delHouseImg(int Hid, String Ipath) {
        H house = houseMapper.findHouseById(Hid);
        String oldPath = house.getHimage();
        List<String> list = lsd.imageSplit(oldPath);
        list.remove(Ipath);
        String newp = "";
        for (String i : list) {
            newp = newp + "|"+i;
        }
        houseMapper.updateImg(Hid,newp);
    }
}
