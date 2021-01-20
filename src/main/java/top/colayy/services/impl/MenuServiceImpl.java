package top.colayy.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import top.colayy.dao.MenuDao;
import top.colayy.pojo.Menu;
import top.colayy.pojo.User;
import top.colayy.services.MenuService;

import java.util.List;

public class MenuServiceImpl implements MenuService {

    @Autowired
    MenuDao menuDao;

    @Override
    public List<Menu> showMenu(User user) {
        return null;
    }
}
