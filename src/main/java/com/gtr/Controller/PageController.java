package com.gtr.Controller;

import com.gtr.Service.House.HouseService;
import com.gtr.Service.User.TreasureService;
import com.gtr.entity.H;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class PageController {
    @Autowired
    TreasureService treasureService;
    @Autowired
    HouseService houseService;
    @RequestMapping
    public String index() {
        return "index";
    }
   @RequestMapping("/test")
   public String test(){
        return "downloadtest";
   }
    @RequestMapping("/tosign")
    public String tosign(){
        return "SignIn";
    }
    //搜索房屋
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
}
