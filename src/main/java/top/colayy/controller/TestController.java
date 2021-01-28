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
import top.colayy.pojo.Test;
import top.colayy.services.TestService;

import java.util.List;
import java.util.Map;

@Controller
public class TestController {

    @Autowired
    TestService testServiceImpl;

    // 试题模块 - 添加试题
    @RequestMapping("/addTest")
    @ResponseBody
    public boolean addTest(@RequestBody Test test){
        return testServiceImpl.addTest(test);
    }
    // 试题模块 - 删除试题
    @RequestMapping("/delTest")
    @ResponseBody
    public boolean delTest(@RequestBody Test test){
        return testServiceImpl.delTest(test);
    }
    // 试题模块 - 修改试题
    @RequestMapping("/changeTest")
    @ResponseBody
    public boolean changeTest(@RequestBody Test test){
        return testServiceImpl.changeTest(test);
    }
    // 试题模块 - 显示试题 - 通过用户ID查询 --- bootstrapTable 分页
    @RequestMapping("/showAllTest")
    @ResponseBody
    public PageUtils showAllTest(@RequestBody Map<String,Object> params)throws Exception{
        PageHelper.offsetPage(Integer.parseInt(params.get("offset").toString()),Integer.parseInt(params.get("pageNumber").toString()));
        List<Test> testList = testServiceImpl.queryTestByUId(params.get("uId").toString());
        PageInfo<Test> pageInfo = new PageInfo<>(testList);
        return new PageUtils(pageInfo.getList(),new Long(pageInfo.getTotal()).intValue());
    }

    // 试题模块 - 显示试题 - 通过试题ID查询
    @RequestMapping("/showTestById")
    @ResponseBody
    public Test showTestByTId(@RequestBody Test test){
        return testServiceImpl.queryTestByTId(test);
    }



    // 试题模块 - 显示试题 - 通过分类ID查询或是部分题目模糊查询
    @RequestMapping("/showTestByCon")
    @ResponseBody
    public PageUtils showTestByCon(@RequestBody Map<String,Object> params)throws Exception{
        PageHelper.offsetPage(Integer.parseInt(params.get("offset").toString()),Integer.parseInt(params.get("pageNumber").toString()));
        List<Test> testList = testServiceImpl.queryTestByCon(params.get("uId").toString(),params.get("cId").toString(),params.get("tTopic").toString(), (Integer) params.get("tType"),params.get("pId").toString());
        PageInfo<Test> pageInfo = new PageInfo<>(testList);
        return new PageUtils(pageInfo.getList(),new Long(pageInfo.getTotal()).intValue());
    }

}
