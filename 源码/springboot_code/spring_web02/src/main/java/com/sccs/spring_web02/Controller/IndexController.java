package com.sccs.spring_web02.Controller;

import com.sccs.spring_web02.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {

    /*发送/或者/login来到登录页面*/
    @GetMapping(value = {"/","/login"})
    public String loginPage(){
        return "login";
    }
    // 处理登录，用username和password
    @PostMapping("/login")
    public String main(User user, HttpSession session, Model model) {
        // 判断用户名和密码是否为空
        if (StringUtils.isEmpty(user.getUsername()) && "123456".equals(user.getPassword())) {
            // 登录成功把用户名和密码存入session
            session.setAttribute("loginUser",user);
            return "redirect:/main.html";
        } else{
            model.addAttribute("msg","账号密码错误");
            return "login";
        }
    }

    // 解决重复提交去main页面
    @GetMapping("/main.html")
    public String mainPage(HttpSession session,Model model) {
        Object loginUser = session.getAttribute("loginUser");
        if (loginUser != null) {
            return "main";
        }
        model.addAttribute("msg","请重新登录！！");
        return "login";
    }
}
