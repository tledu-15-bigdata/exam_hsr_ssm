package top.colayy.dao;

import top.colayy.pojo.AnswerMsg;
import top.colayy.pojo.Parper;
import top.colayy.pojo.Record;

import java.util.List;

public interface ExamDao {
    Parper getPaperIdByCode(String pCode);
    Record verifyRecord(Record record);
    int saveRecord(Record record);
    List<String> getTIdList(String pId);
    int saveAnswerMsg(List<AnswerMsg> answerMsgList);
}
