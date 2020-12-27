package com.gtr.Controller;

import com.gtr.Service.User.RegisterService;
import com.gtr.entity.U;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    RegisterService registerService;
    //用户注册
    @PostMapping("/login_in")
    public String addUser(U user){
        try {
            registerService.addUser(user);
        }catch (Exception ee){
            return "regfail";
        }
        return "regsuc";
    }
    //删除用户
    @PostMapping("/delete_user")
    public String deleteUser(String Uphone){
        if(registerService.deleteUser(Uphone)){
            return "delsuc";
        }
        return "delfail";
    }
}
