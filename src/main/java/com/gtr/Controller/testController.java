package com.gtr.Controller;

import com.gtr.Service.User.TreasureService;
import com.gtr.entity.H;
import com.gtr.entity.U;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class testController {
    @Autowired
    TreasureService treasureService;
    @RequestMapping("test1")
    public String getCollection(int Uid){
        //拿到房屋Hid
        List<String> resuleSet =  treasureService.getCollection(Uid);
        for (String i : resuleSet){
            System.out.println(i);
        }
        //通过Hid获得房屋信息
        
        //传给前端
        return "index";
    }
    @PostMapping("test2")
    public String setCollection(int Uid,String Collection) {
        treasureService.addCollection(Uid,Collection);
        return "success";
    }
}
