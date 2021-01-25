package top.colayy.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.colayy.pojo.Classify;
import top.colayy.pojo.PageUtils;
import top.colayy.pojo.Parper;
import top.colayy.services.ParperService;

import java.util.List;
import java.util.Map;

@Controller
public class ParperController {

    @Autowired
    ParperService parperServiceImpl;

    //添加试卷
    @RequestMapping("/addPaper")
    @ResponseBody
    public boolean addPaper(@RequestBody Parper parper){
        boolean mark = parperServiceImpl.addPaper(parper);
        return mark;
    }

    //删除试卷
    @RequestMapping("/delPaper")
    @ResponseBody
    public boolean delPaper(@RequestBody Parper parper){
        boolean mark = parperServiceImpl.delPaper(parper);
        return mark;
    }

    //修改试卷名
    @RequestMapping("/changePaper")
    @ResponseBody
    public boolean changePaper(@RequestBody Parper parper){
        boolean mark = parperServiceImpl.changePaper(parper);
        return mark;
    }

    //试卷展示
    @RequestMapping("/showPaper")
    @ResponseBody
    public PageUtils showPaper(@RequestBody Map<String,Object> params)throws Exception{
        PageHelper.offsetPage(Integer.parseInt(params.get("offset").toString()),Integer.parseInt(params.get("pageNumber").toString()));
        List<Parper> classifyList = parperServiceImpl.queryAllParper(params.get("uId").toString());
        PageInfo<Parper> pageInfo = new PageInfo<Parper>(classifyList);
        return new PageUtils(pageInfo.getList(),new Long(pageInfo.getTotal()).intValue());
    }

    //改变试卷状态
    @RequestMapping("/changePaperStatus")
    @ResponseBody
    public boolean changePaperStatus(@RequestBody Parper parper){
        boolean mark = parperServiceImpl.changePaperStatus(parper);
        return mark;
    }

    //通过ID获得试卷信息
    @RequestMapping("/showPaperById")
    @ResponseBody
    public Parper showPaperById(@RequestBody Parper parper){
        Parper parper1 = parperServiceImpl.queryPaperById(parper.getpId());
        return parper1;
    }

}
