package top.colayy.services;

import top.colayy.pojo.User;

public interface UserService {

    public User login(User user);

    public boolean sigin(User user);

    public boolean changeUserMsg(User user);

}
