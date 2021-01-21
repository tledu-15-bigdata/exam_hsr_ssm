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
        User userlogin = userServiceImpl.queryLogin(user);
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

    //重置密码
    @RequestMapping("/resetPwd")
    @ResponseBody
    public boolean resetPwd(@RequestBody User user){
        boolean mark = userServiceImpl.resetPwd(user);
        return mark;
    }

    //通过UID查询用户
    @RequestMapping("/showUserById")
    @ResponseBody
    public User showUserById(@RequestBody User user){
        User userlogin = userServiceImpl.queryUserById(user);
        return userlogin;
    }
}
