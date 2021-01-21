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
    UserService userServiceImpl;

    //登录
    @RequestMapping("/login")
    @ResponseBody
    public User login(@RequestBody User user){
        User userlogin = userServiceImpl.login(user);
        return userlogin;
    }

    //注册
    @RequestMapping("/sigin")
    @ResponseBody
    public boolean sigin(@RequestBody User user){
        boolean mark = userServiceImpl.sigin(user);
        return mark;
    }

    //修改用户信息修改密码
    @RequestMapping("/changeUserMsg")
    @ResponseBody
    public boolean changeUserMsg(@RequestBody User user){
        boolean mark = userServiceImpl.changeUserMsg(user);
        return mark;
    }
}
