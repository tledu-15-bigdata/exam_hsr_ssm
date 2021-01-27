package top.colayy.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.colayy.dao.ClassifyDao;
import top.colayy.dao.ParperTestDao;
import top.colayy.dao.TestDao;
import top.colayy.pojo.Parper;
import top.colayy.pojo.ParperTest;
import top.colayy.pojo.Test;
import top.colayy.services.ParperTestService;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@Service
public class ParperTestServiceImpl implements ParperTestService {

    @Autowired
    ParperTestDao parperTestDao;

    @Autowired
    TestDao testDao;

    @Autowired
    ClassifyDao classifyDao;

    //添加试卷试题
    @Override
    public boolean addPaperTest(List<ParperTest> parperTests) {
        int i = parperTestDao.addPaperTest(parperTests);
        if (i==parperTests.size()){
            return true;
        }
        return false;
    }

    //删除试卷试题
    @Override
    public boolean delPapaerTest(ParperTest parperTest) {
        int i = parperTestDao.delPapaerTest(parperTest);
        if (i!=0){
            return true;
        }
        return false;
    }


    //试卷试题展示
    @Override
    public List<Test> queryAllParperTest(String pId) {
        List<ParperTest> parperTests = parperTestDao.queryAllParperTest(pId);
        List<Test> tests = new LinkedList<Test>();
        Iterator<ParperTest> iterator = parperTests.iterator();
        while (iterator.hasNext()){
            ParperTest parperTest = iterator.next();
            Test test = parperTestDao.showTestByTId(parperTest.gettId());
            test.setcName(classifyDao.showClassifyById(test.getcId()).getcName());
            if (test.gettType() == 0) {
                Test testOption = testDao.showOption(test.gettId());
                test.setoA(testOption.getoA());
                test.setoB(testOption.getoB());
                test.setoC(testOption.getoC());
                test.setoD(testOption.getoD());
            }
            tests.add(test);
        }
        return tests;
    }

    //显示可添加试题
    @Override
    public List<Test> queryAddibleTest(String pId,String uId) {
        Parper parper = new Parper();
        parper.setpId(pId);
        parper.setuId(uId);
        List<Test> tests = parperTestDao.queryAddibleTest(parper);
        return queryReplenish(tests);
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
