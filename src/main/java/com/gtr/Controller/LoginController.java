package com.gtr.Controller;

import com.gtr.Service.User.LoginService;
import com.gtr.entity.U;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

//控制用户登录状态
@Controller
@RequestMapping("/status")
public class LoginController {
    @Autowired
    LoginService loginService;
    @RequestMapping("/login_in")
    boolean isTrue(String username, String password, HttpServletRequest request) {
        U user = loginService.getUser(username);
        HttpSession session = request.getSession();
        if(user.getUpassword().equals(password)){
            session.setAttribute("UserInfo",user);
            session.setAttribute("LoginInfo",1);
            return true;
        }
        return false;
    }
    @RequestMapping("/login_out")
    boolean isExit(HttpServletRequest request){
        try{
            request.getSession().removeAttribute("UserInfo");
            return true;
        }catch (Exception ee){
            return false;
        }
    }
}
