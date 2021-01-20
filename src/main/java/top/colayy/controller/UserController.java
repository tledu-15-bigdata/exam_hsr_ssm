package top.colayy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.colayy.pojo.User;
import top.colayy.services.UserService;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/login")
    @ResponseBody
    public User login(@RequestBody User user){
        User userlogin = userService.login(user);
        return userlogin;
    }

    @RequestMapping("/sigin")
    @ResponseBody
    public boolean sigin(@RequestBody User user){
        boolean mark = userService.sigin(user);
        return mark;
    }

    @RequestMapping("/changeUserMsg")
    @ResponseBody
    public boolean changeUserMsg(@RequestBody User user){
        boolean mark = userService.changeUserMsg(user);
        return mark;
    }
}
