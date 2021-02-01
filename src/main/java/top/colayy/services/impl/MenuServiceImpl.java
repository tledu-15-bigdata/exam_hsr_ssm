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

    //查看所用菜单(表格)
    @Override
    public List<Menu> queryMenuList() {
        return menuDao.queryMenuList();
    }

    @Override
    //修改菜单内容
    public boolean changeMenuCon(Menu menu) {
        //生成时间
        menu.setCreateTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
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
        menu.setCreateTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        Menu menu1 = menuDao.queryMenuById(menu.getmId());
        if (menu1.getIsDelete()==1) menu.setIsDelete(0);
        if (menu1.getIsDelete()==0) menu.setIsDelete(1);
        int i = menuDao.changeMenuStatus(menu);
        if (i==1){
            return true;
        }
        return false;
    }
}
