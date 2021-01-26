package top.colayy.services;

import top.colayy.pojo.Test;

import java.util.List;

public interface TestService {

    // 试题模块 - 添加试题
    boolean addTest(Test test);

    // 试题模块 - 删除试题
    boolean delTest(Test test);

    // 试题模块 - 修改试题
    boolean changeTest(Test test);

    // 试题模块 - 显示试题 - 通过用户ID查询
    List<Test> queryTestByUId(String uId);

    // 试题模块 - 显示试题 - 通过试题ID查询
    Test queryTestByTId(Test test);

    // 试卷模块 - 显示试题 - 通过分类ID查询或是部分题目模糊查询
    List<Test> queryTestByCon(String uId,String cId,String tTopic,int tType,String pId);

    // 补全试卷信息 -- 添加cName,选项内容
    List<Test> queryReplenish(List<Test> testList);
}
