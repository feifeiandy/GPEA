package com.example.demo.Controller;

import com.example.demo.OtherEntity.Man;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/")
    public String Index()
    {
        return "Index";
    }

    @RequestMapping("/man")
    public String GetMan( Man man)
    {
        return man.getName();
    }
}

