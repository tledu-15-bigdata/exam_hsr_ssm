package top.colayy.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.colayy.dao.ParperDao;
import top.colayy.pojo.Parper;
import top.colayy.services.ParperService;

@Service
public class ParperServiceImpl implements ParperService {

    @Autowired
    ParperDao parperDao;

    //添加试卷
    @Override
    public boolean addPaper(Parper parper) {

        return false;
    }
}
