package top.colayy.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.colayy.dao.UserDao;
import top.colayy.pojo.User;
import top.colayy.services.UserService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
//    登录
    public User login(User user) {
        User userLogin = userDao.queryUserLogin(user);
        if (userLogin==null){
            userLogin = new User();
        }
        return userLogin;
    }

    @Override
//    用户注册
    public boolean sigin(User user) {
        //验证uName和uAcc是否存在
        User user1 = userDao.verifyUserIsexist(user);
        if (user1==null){
            //生成时间
            Date date = new Date();
            String format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(date);
            //生成ID
            String uId = UUID.randomUUID().toString();
            //默认头像
            String uPhoto = "img/TL.png";
            user.setuId(uId);
            user.setuPhoto(uPhoto);
            user.setCreateTime(format);
            int i = userDao.siginUser(user);
            if (i==1){
                return true;
            }
        }
        return false;
    }

    @Override
//    修改用户信息、修改密码
    public boolean changeUserMsg(User user) {
        //验证uName和uAcc是否存在
        User user1 = userDao.verifyUserIsexist(user);
        if (user1==null){
            //生成时间
            Date date = new Date();
            String format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(date);
            user.setCreateTime(format);
            int i = userDao.changeUserMsg(user);
            if (i==1){
                return true;
            }
        }
        return false;
    }
}
