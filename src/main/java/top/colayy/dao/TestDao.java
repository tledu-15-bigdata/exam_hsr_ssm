package top.colayy.dao;

import top.colayy.pojo.Test;

import java.util.List;

public interface TestDao {

    // 试题模块 - 添加试题
    int addTest(Test test);

    // 试题模块 - 添加试题选项
    int addOption(Test test);

    // 试题模块 - 删除试题
    int delTest(Test test);

    // 试题模块 - 修改试题
    int changeTest(Test test);

    // 试题模块 - 修改试题选项
    int changeOption(Test test);

    // 试题模块 - 显示试题 - 通过用户ID查询
    List<Test> showTestByUId(String uId);

    // 试题模块 - 显示试题 - 通过试题ID查询
    Test showTestByTId(Test test);


    // 试卷模块 - 显示试题 - 查询单选题的选项
    Test showOption(String tId);

    // 试卷模块 - 显示试题 - 通过分类ID查询或是部分题目模糊查询
    List<Test> showTestByCon(Test test);
}
