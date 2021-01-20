package top.colayy.services;

import top.colayy.pojo.Menu;
import top.colayy.pojo.User;

import java.util.List;

public interface MenuService {

    //查看菜单
    public List<Menu> showMenu(User user);

}
