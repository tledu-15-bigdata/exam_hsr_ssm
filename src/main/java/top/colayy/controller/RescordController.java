package top.colayy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import top.colayy.services.RescordService;

@Controller
public class RescordController {

    @Autowired
    RescordService rescordServiceImpl;

}
