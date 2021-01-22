package top.colayy.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.colayy.dao.TestDao;
import top.colayy.pojo.Test;
import top.colayy.services.TestService;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestDao testDao;

    // 试题模块 - 添加试题
    @Override
    public boolean addTest(Test test) {
        boolean mark = testDao.addTest(test) != 0;
        if(test.gettType() == 0) {
            mark = testDao.addOption(test) != 0;
        }
        return mark;
    }

    // 试题模块 - 删除试题
    @Override
    public boolean delTest(Test test) {
        return testDao.delTest(test) != 0;
    }

    // 试题模块 - 修改试题
    @Override
    public boolean changeTest(Test test) {
        boolean mark = testDao.changeTest(test) != 0;
        if (test.gettType() == 0)
            mark = testDao.changeOption(test) != 0;
        return mark;
    }

    // 试题模块 - 显示试题 - 通过用户ID查询
    @Override
    public List<Test> queryTestByUId(String uId) {
        List<Test> tests = testDao.showTestByUId(uId);
        for(int i = 0; i < tests.size(); i++){
            if(tests.get(i).gettType() == 0){
                Test testOption = testDao.showOption(tests.get(i).gettId());
                tests.get(i).setoA(testOption.getoA());
                tests.get(i).setoB(testOption.getoB());
                tests.get(i).setoC(testOption.getoC());
                tests.get(i).setoD(testOption.getoD());
            }
        }
        return tests;
    }

    // 试题模块 - 显示试题 - 通过试题ID查询
    @Override
    public Test queryTestByTId(Test test) {
        return testDao.showTestByTId(test);
    }


    // 试卷模块 - 显示试题
    // - 通过分类ID查询或是部分题目模糊查询
    @Override
    public List<Test> queryTestByCon(Test test) {
        return testDao.showTestByCon(test);
    }

}
