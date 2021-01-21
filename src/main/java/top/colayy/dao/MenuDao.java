package top.colayy.dao;

import top.colayy.pojo.Menu;
import top.colayy.pojo.User;

import java.util.List;

public interface MenuDao {

    //查看菜单
    public List<Menu> queryShowMenu(Menu menu);

    //修改菜单内容
    public int changeMenuCon(Menu menu);

    //菜单禁用
    public int changeMenuStatus(Menu menu);

}
