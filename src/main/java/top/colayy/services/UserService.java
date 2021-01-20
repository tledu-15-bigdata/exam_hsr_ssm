package top.colayy.services;

import top.colayy.pojo.User;

public interface UserService {

    //登录
    public User login(User user);

    //注册
    public boolean sigin(User user);

    //修改用户信息修改密码
    public boolean changeUserMsg(User user);

}
