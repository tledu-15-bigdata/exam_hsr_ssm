package top.colayy.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.colayy.dao.ParperDao;
import top.colayy.pojo.Parper;
import top.colayy.services.ParperService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
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
        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
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
        parper.setCreateTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        int i = parperDao.delPaper(parper);
        if (i==1){
            return true;
        }
        return false;
    }

    //修改试卷名
    @Override
    public boolean changePaper(Parper parper){
        //生成时间
        Date date = new Date();
        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
        parper.setCreateTime(format);
        int i = parperDao.changePaper(parper);
        if (i==1){
            return true;
        }
        return false;
    }

    //查看所用试卷
    @Override
    public List<Parper> queryAllParper(String uId) {
        List<Parper> parpers = parperDao.queryAllParper(uId);
        return parpers;
    }

    //改变试卷状态
    @Override
    public boolean changePaperStatus(Parper parper) {
        int i = parperDao.changePaperStatus(parper);
        if (i==1){
            return true;
        }
        return false;
    }


    //通过ID获得试卷信息
    @Override
    public Parper queryPaperById(String pId) {
        Parper parper = parperDao.queryPaperById(pId);
        return parper;
    }
}
