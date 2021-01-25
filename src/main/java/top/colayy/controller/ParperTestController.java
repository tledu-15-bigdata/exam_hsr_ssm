package top.colayy.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.colayy.pojo.PageUtils;
import top.colayy.pojo.Parper;
import top.colayy.pojo.ParperTest;
import top.colayy.pojo.Test;
import top.colayy.services.ParperTestService;

import java.util.List;
import java.util.Map;

@Controller
public class ParperTestController {

    @Autowired
    ParperTestService parperTestServiceImpl;

    //添加试卷试题
    @RequestMapping("/addPaperTest")
    @ResponseBody
    public boolean addPaperTest(@RequestBody List<ParperTest> parperTests){
        boolean mark = parperTestServiceImpl.addPaperTest(parperTests);
        return mark;
    }

    //删除试卷试题
    @RequestMapping("/delPapaerTest")
    @ResponseBody
    public boolean delPapaerTest(@RequestBody ParperTest parperTest){
        boolean mark = parperTestServiceImpl.delPapaerTest(parperTest);
        return mark;
    }


    //试卷试题展示
    @RequestMapping("/showPaperTest")
    @ResponseBody
    public PageUtils showPaperTest(@RequestBody Map<String,Object> params)throws Exception{
        PageHelper.offsetPage(Integer.parseInt(params.get("offset").toString()),Integer.parseInt(params.get("pageNumber").toString()));
        List<Test> parperTest = parperTestServiceImpl.queryAllParperTest(params.get("pId").toString());
        PageInfo<Test> pageInfo = new PageInfo<Test>(parperTest);
        return new PageUtils(pageInfo.getList(),new Long(pageInfo.getTotal()).intValue());
    }

}
