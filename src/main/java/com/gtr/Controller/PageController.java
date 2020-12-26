package com.gtr.Controller;

import com.gtr.Service.User.TreasureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class PageController {
    @Autowired
    TreasureService treasureService;
    @RequestMapping
    public String index() {
        return "index";
    }

    @RequestMapping("tosign")
    public String tosign(){
        return "SignIn";
    }

}
