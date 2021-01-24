package top.colayy.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.colayy.dao.ParperTestDao;
import top.colayy.services.ParperTestService;

@Service
public class ParperTestServiceImpl implements ParperTestService {

    @Autowired
    ParperTestDao parperTestDao;

}
