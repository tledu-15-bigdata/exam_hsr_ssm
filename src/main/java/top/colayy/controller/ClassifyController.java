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
import top.colayy.services.ClassifyService;

import java.util.List;
import java.util.Map;

@Controller
public class ClassifyController {
    @Autowired
    private ClassifyService classifyServiceImpl;
    // 试题分类 -- 添加
    @RequestMapping("/addClassify")
    @ResponseBody
    public boolean addClassify(@RequestBody Classify classify){
        return classifyServiceImpl.addClassify(classify);
    }
    // 试题分类 -- 删除
    @RequestMapping("/delClassify")
    @ResponseBody
    public boolean delClassify(@RequestBody Classify classify){
        return classifyServiceImpl.delClassify(classify);
    }
    // 试题分类 -- 修改名称
    @RequestMapping("/changeClassify")
    @ResponseBody
    public boolean changeClassify(@RequestBody Classify classify){
        return classifyServiceImpl.changeClassify(classify);
    }
    // 试题分类 -- 显示所有
    @RequestMapping("/showClassify")
    @ResponseBody
    public PageUtils getBlogList(@RequestBody Map<String,Object> params)throws Exception{
        System.out.println(Integer.parseInt(params.get("offset").toString()));
        PageHelper.offsetPage(Integer.parseInt(params.get("offset").toString()),Integer.parseInt(params.get("pageNumber").toString()));
        List<Classify> blogList = classifyServiceImpl.queryAllClassify(params.get("uId").toString());
        PageInfo<Classify> pageInfo = new PageInfo<>(blogList);
        return new PageUtils(pageInfo.getList(),new Long(pageInfo.getTotal()).intValue());
    }
}
