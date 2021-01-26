package top.colayy.services;

import top.colayy.pojo.ParperTest;
import top.colayy.pojo.Test;

import java.util.List;

public interface ParperTestService {

    //添加试卷试题
    public boolean addPaperTest(List<ParperTest> parperTests);

    //删除试卷试题
    public boolean delPapaerTest(ParperTest parperTest);

    //试卷试题展示
    public List<Test> queryAllParperTest(String pId);

    //显示可添加试题
    public List<Test> queryAddibleTest(String pId,String uId);

    // 补全试卷信息 -- 添加cName,选项内容
    public List<Test> queryReplenish(List<Test> testList);

}
