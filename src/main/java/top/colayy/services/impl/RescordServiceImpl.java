package top.colayy.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.colayy.dao.RescordDao;
import top.colayy.pojo.Rescord;
import top.colayy.services.RescordService;

import java.util.List;

@Service
public class RescordServiceImpl implements RescordService {

    @Autowired
    RescordDao rescordDao;

    //考生信息展示
    @Override
    public List<Rescord> queryAllRescord(String pId) {
        List<Rescord> rescords = rescordDao.queryAllRescord(pId);
        return rescords;
    }
}
