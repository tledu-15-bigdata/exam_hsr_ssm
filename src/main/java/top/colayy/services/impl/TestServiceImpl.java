package top.colayy.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.colayy.dao.ClassifyDao;
import top.colayy.dao.TestDao;
import top.colayy.pojo.Classify;
import top.colayy.pojo.Test;
import top.colayy.services.TestService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    TestDao testDao;

    @Autowired
    ClassifyDao classifyDao;

    // 试题模块 - 添加试题
    @Override
    public boolean addTest(Test test) {
        test.settId(UUID.randomUUID().toString());
        test.setCreateTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        boolean mark = testDao.addTest(test) != 0;
        if(test.gettType() == 0) {
            mark = testDao.addOption(test) != 0;
        }
        return mark;
    }

    // 试题模块 - 删除试题
    @Override
    public boolean delTest(Test test) {
        test.setCreateTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        return testDao.delTest(test) != 0;
    }

    // 试题模块 - 修改试题
    @Override
    public boolean changeTest(Test test) {
        test.setCreateTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        boolean mark = testDao.changeTest(test) != 0;
        if (test.gettType() == 0)
            mark = testDao.changeOption(test) != 0;
        return mark;
    }

    // 试题模块 - 显示试题 - 通过用户ID查询
    @Override
    public List<Test> queryTestByUId(String uId) {
        List<Test> testList = testDao.showTestByUId(uId);
        return queryReplenish(testList);
    }

    // 试题模块 - 显示试题 - 通过试题ID查询
    @Override
    public Test queryTestByTId(Test test) {
        Test queryTest = testDao.showTestByTId(test);
        queryTest.setcName(classifyDao.showClassifyById(queryTest.getcId()).getcName());
        if (queryTest.gettType() == 0) {
            Test testOption = testDao.showOption(queryTest.gettId());
            queryTest.setoA(testOption.getoA());
            queryTest.setoB(testOption.getoB());
            queryTest.setoC(testOption.getoC());
            queryTest.setoD(testOption.getoD());
        }
        return queryTest;
    }


    // 试卷模块 - 显示试题
    // - 通过分类ID查询或是部分题目模糊查询
    @Override
    public List<Test> queryTestByCon(String uId,String cId,String tTopic,int tType,String pId) {
        Test test = new Test(uId,cId,tTopic,tType,pId);
        List<Test> testList = testDao.showTestByCon(test);
        return queryReplenish(testList);
    }




    // 补全试卷信息 -- 添加cName,选项内容
    @Override
    public List<Test> queryReplenish(List<Test> testList) {
        for (Test test1 : testList) {
            test1.setcName(classifyDao.showClassifyById(test1.getcId()).getcName());
            if (test1.gettType() == 0) {
                Test testOption = testDao.showOption(test1.gettId());
                test1.setoA(testOption.getoA());
                test1.setoB(testOption.getoB());
                test1.setoC(testOption.getoC());
                test1.setoD(testOption.getoD());
            }
        }
        return testList;
    }

}
