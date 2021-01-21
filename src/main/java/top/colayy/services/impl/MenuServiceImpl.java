package top.colayy.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.colayy.dao.MenuDao;
import top.colayy.pojo.Menu;
import top.colayy.pojo.User;
import top.colayy.services.MenuService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    MenuDao menuDao;

    @Override
    //查看菜单
    public List<Menu> queryShowMenu(Menu menu) {
        List<Menu> menus = menuDao.queryShowMenu(menu);
        return menus;
    }

    @Override
    //修改菜单内容
    public boolean changeMenuCon(Menu menu) {
        //生成时间
        Date date = new Date();
        String format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(date);
        menu.setCreateTime(format);
        int i = menuDao.changeMenuCon(menu);
        if (i==1){
            return true;
        }
        return false;
    }

    @Override
//    菜单禁用
    public boolean changeMenuStatus(Menu menu) {
        //生成时间
        Date date = new Date();
        String format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(date);
        menu.setCreateTime(format);
        int i = menuDao.changeMenuStatus(menu);
        if (i==1){
            return true;
        }
        return false;
    }
}
