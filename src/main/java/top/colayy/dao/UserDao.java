package top.colayy.dao;

import top.colayy.pojo.User;

import java.util.List;

public interface UserDao {

    //用户登录
    public User queryUserLogin(User user);

    //验证用户是否存在
    public User queryVerifyUserIsexist(User user);

    //注册用户
    public int siginUser(User user);

    //修改用户信息、修改密码
    public int changeUserMsg(User user);

    //重置密码
    public int resetPwd(User user);

    //通过uId查询用户
    public User queryUserById(User user);

    //查看所用用户
    public List<User> queryUsers();

    //禁用启用用户
    public int changeStatus(User user);

}
