package top.colayy.services;

import top.colayy.pojo.Menu;
import top.colayy.pojo.User;

import java.util.List;

public interface MenuService {

    //查看菜单
    public List<Menu> queryShowMenu(Menu menu);

    //修改菜单内容
    public boolean changeMenuCon(Menu menu);

    //菜单禁用
    public boolean changeMenuStatus(Menu menu);

}
