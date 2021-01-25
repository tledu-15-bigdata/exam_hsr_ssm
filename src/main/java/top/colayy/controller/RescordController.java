package top.colayy.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.colayy.pojo.PageUtils;
import top.colayy.pojo.Rescord;
import top.colayy.pojo.Test;
import top.colayy.services.RescordService;

import java.util.List;
import java.util.Map;

@Controller
public class RescordController {

    @Autowired
    RescordService rescordServiceImpl;

    //考生信息展示
    @RequestMapping("/showRecord")
    @ResponseBody
    public PageUtils showRecord(@RequestBody Map<String,Object> params)throws Exception{
        PageHelper.offsetPage(Integer.parseInt(params.get("offset").toString()),Integer.parseInt(params.get("pageNumber").toString()));
        List<Rescord> rescords = rescordServiceImpl.queryAllRescord(params.get("pId").toString());
        PageInfo<Rescord> pageInfo = new PageInfo<Rescord>(rescords);
        return new PageUtils(pageInfo.getList(),new Long(pageInfo.getTotal()).intValue());
    }

}
