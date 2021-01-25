package top.colayy.dao;

import top.colayy.pojo.Rescord;

import java.util.List;

public interface RescordDao {

    //考生信息展示
    public List<Rescord> queryAllRescord(String pId);

}
