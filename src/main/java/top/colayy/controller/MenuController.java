package top.colayy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.colayy.pojo.Menu;
import top.colayy.pojo.User;

import java.util.List;

@Controller
public class MenuController {


    @RequestMapping("/showMenu")
    @ResponseBody
    //查看菜单
    public List<Menu> showMenu(User user){

        return null;
    }
}
