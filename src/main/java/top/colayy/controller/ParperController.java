package top.colayy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.colayy.pojo.Parper;
import top.colayy.services.ParperService;

@Controller
public class ParperController {

    @Autowired
    ParperService parperServiceImpl;

    //添加试卷
    @RequestMapping("/addPaper")
    @ResponseBody
    public boolean addPaper(@RequestBody Parper parper){
        boolean mark = parperServiceImpl.addPaper(parper);
        return mark;
    }

}
