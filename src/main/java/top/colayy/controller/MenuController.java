package top.colayy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.colayy.pojo.Menu;
import top.colayy.pojo.User;
import top.colayy.services.MenuService;

import java.util.List;

@Controller
public class MenuController {

    @Autowired
    MenuService menuServiceImpl;

    //查看菜单
    @RequestMapping("/showMenu")
    @ResponseBody
    public List<Menu> showMenu(@RequestBody Menu menu){
        List<Menu> menus = menuServiceImpl.queryShowMenu(menu);
        return menus;
    }

    //修改菜单内容
    @RequestMapping("/changeMenuCon")
    @ResponseBody
    public boolean changeMenuCon(@RequestBody Menu menu){
        boolean mark = menuServiceImpl.changeMenuCon(menu);
        return mark;
    }

    //菜单禁用
    @RequestMapping("/changeMenuStatus")
    @ResponseBody
    public boolean changeMenuStatus(@RequestBody Menu menu){
        boolean mark = menuServiceImpl.changeMenuStatus(menu);
        return mark;
    }
}
