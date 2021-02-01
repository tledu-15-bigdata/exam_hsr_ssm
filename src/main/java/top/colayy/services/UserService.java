package top.colayy.services;

import top.colayy.pojo.User;

import java.util.List;

public interface UserService {

    //登录
    public User queryLogin(User user);

    //注册
    public boolean sigin(User user);

    //修改用户信息修改密码
    public boolean changeUserMsg(User user);

    //重置密码
    public boolean resetPwd(User user);

    //通过uId查询用户
    public User queryUserById(User user);

    //查看所用用户
    public List<User> queryUsers(User user);

    //禁用启用用户
    public boolean changeStatus(User user);

    //修改用户头像
//    public boolean changeUserPhoto()

}
