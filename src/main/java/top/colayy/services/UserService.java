package top.colayy.services;

import top.colayy.pojo.User;

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

}
