package top.colayy.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.colayy.dao.RescordDao;
import top.colayy.services.RescordService;

@Service
public class RescordServiceImpl implements RescordService {

    @Autowired
    RescordDao rescordDao;

}
