package top.colayy.services;

import top.colayy.pojo.Rescord;

import java.util.List;

public interface RescordService {

    //考生信息展示
    public List<Rescord> queryAllRescord(String pId);

}
