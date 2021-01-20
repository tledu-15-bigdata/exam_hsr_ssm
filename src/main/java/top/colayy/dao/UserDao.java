package top.colayy.dao;

import top.colayy.pojo.User;

public interface UserDao {

    //用户登录
    public User quseryUserLogin(User user);

    //验证用户是否存在
    public User verifyUserIsexist(User user);

    //注册用户
    public int siginUser(User user);

    //修改用户信息、修改密码
    public int changeUserMsg(User user);

}
