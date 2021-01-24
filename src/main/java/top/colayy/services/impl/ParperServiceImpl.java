package top.colayy.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.colayy.dao.ParperDao;
import top.colayy.pojo.Parper;
import top.colayy.services.ParperService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Service
public class ParperServiceImpl implements ParperService {

    @Autowired
    ParperDao parperDao;

    //获得随机6位考试码
    public String getSixRandomLetter(){
        //用字符数组的方式随机
        String randomcode = "";
        String model = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        char[] m = model.toCharArray();
        for (int j=0;j<6 ;j++ )
        {
            char c = m[(int)(Math.random()*52)];
            randomcode = randomcode + c;
        }
        return randomcode;
    }

    //添加试卷
    @Override
    public boolean addPaper(Parper parper) {
        //生成ID
        String pId = UUID.randomUUID().toString();
        //生成时间
        Date date = new Date();
        String format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(date);
        //生成考试码
        String pCode = getSixRandomLetter();
        parper.setpId(pId);
        parper.setCreateTime(format);
        parper.setpCode(pCode);
        int i = parperDao.addPaper(parper);
        if (i==1){
            return true;
        }
        return false;
    }

    //删除试卷
    @Override
    public boolean delPaper(Parper parper) {
        int i = parperDao.delPaper(parper);
        if (i==1){
            return true;
        }
        return false;
    }
}
