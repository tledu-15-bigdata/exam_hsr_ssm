package top.colayy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import top.colayy.services.ParperTestService;

@Controller
public class ParperTestController {

    @Autowired
    ParperTestService parperTestServiceImpl;

}
