package top.colayy.dao;

import top.colayy.pojo.Parper;

public interface ParperDao {

    //添加试卷
    public int addPaper(Parper parper);

    //删除试卷
    public int delPaper(Parper parper);

}
