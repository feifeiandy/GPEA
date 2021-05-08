package com.example.demo.Controller;

import com.example.demo.Service.IHuiyiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BaseController {
    @Autowired
    private IHuiyiService huiyiService;
    @RequestMapping("/Huiyi")
    public String Huiyi()
    {
        return "Huiyi";
    }

    @ResponseBody
    @RequestMapping("/PullHuiyiData")
    public String PullHuiyiData()
    {
        String a= huiyiService.PullHuiyiData();
        System.out.println(a);
        return a;
//        return "[{\"month\":\"1\",\"event\":[{\"id\":\"1101\",\"value\":\"亚洲asdasdaaaaaaaaaaaaaaaaaaa峰会\"},{\"id\":\"1101\",\"value\":\"体育赛事\"}]},{\"month\":\"2\",\"event\":[{\"id\":\"1102\",\"value\":\"亚洲asdddddddd峰会2\"},{\"id\":\"1102\",\"value\":\"体育asddddddd赛事2\"}]},\n" +
//                "            {\"month\":\"3\",\"event\":[{\"id\":\"1103\",\"value\":\"亚洲asddddddddddd峰会3\"},{\"id\":\"1103\",\"value\":\"体育赛事3\"}]},{\"month\":\"4\",\"event\":[{\"id\":\"1104\",\"value\":\"亚洲dddasddddddddd峰会4\"},{\"id\":\"1104\",\"value\":\"体育赛asddddd事4\"}]},\n" +
//                "            {\"month\":\"5\",\"event\":[{\"id\":\"1105\",\"value\":\"亚洲asdddddddddd峰会5\"},{\"id\":\"1105\",\"value\":\"体育赛事5\"}]},{\"month\":\"6\",\"event\":[{\"id\":\"1106\",\"value\":\"亚洲峰ddasddddddddddddddd会6\"},{\"id\":\"1106\",\"value\":\"体育asddddddddddd赛事6\"}]},\n" +
//                "            {\"month\":\"7\",\"event\":[{\"id\":\"1107\",\"value\":\"亚洲asddddddddddddddd峰会7\"},{\"id\":\"1107\",\"value\":\"体育赛事7\"}]},{\"month\":\"8\",\"event\":[{\"id\":\"1108\",\"value\":\"亚洲ddasddddddddddddd峰会8\"},{\"id\":\"1108\",\"value\":\"体育asdddddddddddddddddd赛事8\"}]}]";
    }
}
