package top.colayy.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.colayy.dao.ExamDao;
import top.colayy.pojo.AnswerMsg;
import top.colayy.pojo.Parper;
import top.colayy.pojo.Record;
import top.colayy.services.ExamService;

import java.util.List;

@Service
public class ExamServiceImpl implements ExamService {
    @Autowired
    ExamDao examDao;

    @Override
    public Parper getPaperIdByCode(String pCode) {
        return examDao.getPaperIdByCode(pCode);
    }

    @Override
    public Record verifyRecord(Record record) {
        return examDao.verifyRecord(record);
    }

    @Override
    public int saveRecord(Record record) {
        return examDao.saveRecord(record);
    }

    @Override
    public List<String> getTIdList(String pId) {
        return examDao.getTIdList(pId);
    }

    @Override
    public int saveAnswerMsg(List<AnswerMsg> answerMsgList) {
        return examDao.saveAnswerMsg(answerMsgList);
    }
}
