package top.colayy.dao;

import top.colayy.pojo.Parper;

import java.util.List;

public interface ParperDao {

    //添加试卷
    public int addPaper(Parper parper);

    //删除试卷
    public int delPaper(Parper parper);

    //修改试卷名
    public int changePaper(Parper parper);

    //查看所有试卷
    public List<Parper> queryAllParper(String uId);

    //更改考试状态
    public int changePaperStatus(Parper parper);

}
