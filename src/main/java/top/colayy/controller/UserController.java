package top.colayy.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.colayy.pojo.Classify;
import top.colayy.pojo.PageUtils;
import top.colayy.pojo.User;
import top.colayy.services.UserService;

import java.util.List;
import java.util.Map;

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
        System.out.println(user);
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

    //查看所用用户
    @RequestMapping("/showUsers")
    @ResponseBody
    public List<User> showUsers(@RequestBody User user){
        List<User> users = userServiceImpl.queryUsers(user);
        return users;
    }

    // 查看所用用户(表格)
    @RequestMapping("/showUserList")
    @ResponseBody
    public PageUtils showClassify(@RequestBody Map<String,Object> params)throws Exception{
        PageHelper.offsetPage(Integer.parseInt(params.get("offset").toString()),Integer.parseInt(params.get("pageNumber").toString()));
        List<User> classifyList = userServiceImpl.queryUserList();
        PageInfo<User> pageInfo = new PageInfo<User>(classifyList);
        return new PageUtils(pageInfo.getList(),new Long(pageInfo.getTotal()).intValue());
    }

    //禁用启用用户
    @RequestMapping("/changeStatus")
    @ResponseBody
    public boolean changeStatus(@RequestBody User user){
        boolean mark = userServiceImpl.changeStatus(user);
        return mark;
    }
}
