package top.colayy.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.colayy.dao.MenuDao;
import top.colayy.pojo.Menu;
import top.colayy.pojo.User;
import top.colayy.services.MenuService;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    MenuDao menuDao;

    @Override
    public List<Menu> showMenu(User user) {
        return null;
    }
}
