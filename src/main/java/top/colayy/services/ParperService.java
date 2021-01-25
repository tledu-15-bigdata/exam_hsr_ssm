package top.colayy.services;

import top.colayy.pojo.Parper;

import java.util.List;

public interface ParperService {

    //添加试卷
    public boolean addPaper(Parper parper);

    //删除试卷
    public boolean delPaper(Parper parper);

    //修改试卷名
    public boolean changePaper(Parper parper);

    //查看所用试卷
    public List<Parper> queryAllParper(String uId);

    //改变试卷状态
    public boolean changePaperStatus(Parper parper);

}
