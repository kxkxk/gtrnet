package com.gtr.Controller;

import com.gtr.Service.House.HouseService;
import com.gtr.Service.RQ.RQService;
import com.gtr.entity.H;
import com.gtr.entity.RQ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/page")
public class HouseController {
    @Autowired
    HouseService houseService;

    @Autowired
    RQService rqService;
    //搜索
    @PostMapping("/search")
    public List<H> selectPage(H house, int start, int end) {
        List<H> oldRes = houseService.selectHouse(house);
        if(start != -1 && end != -1) {
            for (H i : oldRes){
                int rent = i.getHrent();
                if(rent < start || rent > end)
                    oldRes.remove(i);
            }
        }
        return oldRes;
    }

    //全部房屋
    @RequestMapping("all_house")
    public List<H> allHouse() {
        return houseService.getAllHouse();
    }

    //房屋单页
    @RequestMapping("one_room")
    public H oneHouse(int Hid){
        return houseService.findHouse(Hid);
    }

    //新建小区
    @PostMapping("new_rq")
    public boolean createRQ(RQ rq) {
        return rqService.newRq(rq);
    }

    //获得房屋图片
    @RequestMapping("get_img")
    public List<String> getHouseImg(int Hid) {
        return houseService.getImg(Hid);
    }

    //获得小区
    @RequestMapping("one_rq")
    public RQ getRQ(int RQid) {
        return rqService.findRQ(RQid);
    }

    //获得小区图片
    @RequestMapping("rq_img")
    public List<String> getRQImg(RQ rq) {
        return rqService.getRQImg(rq);
    }
}
