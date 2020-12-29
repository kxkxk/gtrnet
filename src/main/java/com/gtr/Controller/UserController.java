package com.gtr.Controller;

import com.gtr.Service.House.HouseService;
import com.gtr.Service.User.RegisterService;
import com.gtr.Service.User.TreasureService;
import com.gtr.entity.H;
import com.gtr.entity.U;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    RegisterService registerService;
    @Autowired
    TreasureService treasureService;
    @Autowired
    HouseService houseService;
    //用户注册
    @PostMapping("/login_in")
    public boolean addUser(U user){
        try {
            registerService.addUser(user);
        }catch (Exception ee){
            return false;
        }
        return true;
    }
    //删除用户
    @PostMapping("/del_user")
    public boolean deleteUser(String Uphone){
        if(registerService.deleteUser(Uphone)){
            return true;
        }
        return false;
    }
    //新增收藏
    @PostMapping("/add_coll")
    public boolean setCollection(int Uid,String Collection) {
        if(treasureService.addCollection(Uid,Collection))
            return true;
        return false;
    }
    //删除收藏
    @RequestMapping("del_coll")
    public boolean delCollection(int Uid, List<String> Collection) {
        return treasureService.delCollection(Uid,Collection);
    }
    //新增发布
    @RequestMapping("add_rel")
    public boolean addRelease(int Uid,String rel) {
       return treasureService.addRelease(Uid, rel);
    }
    //修改发布
    @RequestMapping("mo_rel")
    public boolean moRelease(H house) {
        return houseService.modifyHouse(house);
    }
    //删除发布
    @RequestMapping("del_rel")
    public boolean delRelease(int Hid,List<String> rel) {
        return treasureService.delRelease(Hid,rel);
    }
}
