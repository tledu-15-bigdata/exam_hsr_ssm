package top.colayy.dao;

import top.colayy.pojo.Classify;
import top.colayy.pojo.Parper;
import top.colayy.pojo.ParperTest;
import top.colayy.pojo.Test;

import java.util.List;

public interface ParperTestDao {

    //添加试卷试题
    public int addPaperTest(List<ParperTest> parperTests);

    //删除试卷试题
    public int delPapaerTest(ParperTest parperTest);

    //试卷试题展示
    public List<ParperTest> queryAllParperTest(String pId);

    // 试题模块 - 显示试题 - 通过试题ID查询
    public Test showTestByTId(String tId);

    //显示可添加试题
    public List<Test> queryAddibleTest(Parper paper);


}
