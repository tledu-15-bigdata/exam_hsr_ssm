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

}
