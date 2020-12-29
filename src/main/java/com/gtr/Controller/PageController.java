package com.gtr.Controller;

import com.gtr.Service.House.HouseService;
import com.gtr.Service.User.TreasureService;
import com.gtr.entity.H;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
}
