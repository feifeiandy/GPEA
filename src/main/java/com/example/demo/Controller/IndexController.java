package com.example.demo.Controller;

import com.example.demo.OtherEntity.Man;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.naming.Name;

@Controller
public class IndexController {
    @RequestMapping("/")
    public String Index()
    {
        return "Index";
    }
    @RequestMapping("/index")
    public String index()
    {
        return "Index";
    }
    @RequestMapping("/login")
    public String login()
    {
        return "login";
    }

    @RequestMapping("/doLogin")
    public String doLogin(String name,String password)
    {
        Subject subject = SecurityUtils.getSubject();
        subject.login(new UsernamePasswordToken(name, password));
        return "Index";
    }
    @RequestMapping("/logout")
    @ResponseBody
    public String logout()
    {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return "退出成功！";
    }

    @RequestMapping("/unauthorizedurl")
    public String unauthorizedurl()
    {
        return "error";
    }
    @RequestMapping("/param")
    @ResponseBody
    public String param(@RequestParam  String name)
    {
        return name;
    }
    @RequestMapping("/man")
    public String GetMan( Man man)
    {
        return man.getName();
    }
}

