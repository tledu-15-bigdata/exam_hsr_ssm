package top.colayy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.colayy.pojo.AnswerMsg;
import top.colayy.pojo.Parper;
import top.colayy.pojo.Record;
import top.colayy.pojo.Test;
import top.colayy.services.ExamService;
import top.colayy.services.TestService;

import java.text.SimpleDateFormat;
import java.util.*;

@Controller
public class ExamController {
    @Autowired
    ExamService examServiceImpl;

    @Autowired
    TestService testServiceImpl;

    @RequestMapping("/addRecord")
    @ResponseBody
    public Record addRecord(@RequestBody Record record){
        Parper paperIdByCode = examServiceImpl.getPaperIdByCode(record.getpCode());
        record.setpId(paperIdByCode.getpId());
        Record verifyRecord = examServiceImpl.verifyRecord(record);
        if(verifyRecord != null){
            System.out.println(verifyRecord);
            if(verifyRecord.getrScore() != -1) return new Record();
            else {
                verifyRecord.setpCode(record.getpCode());
                return verifyRecord;
            }
        }else {
            record.setrId(UUID.randomUUID().toString());
            record.setCreateTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
            if(examServiceImpl.saveRecord(record) == 0) return new Record();
            else return record;
        }
    }


    @RequestMapping("/showExamTest")
    @ResponseBody
    public List<AnswerMsg> showExamTest(@RequestBody Map<String, Object> params){

        String pId = params.get("pId").toString();
        String rId = params.get("rId").toString();

        List<AnswerMsg> answerMsgList = new LinkedList<>();

        List<String> tIdList = examServiceImpl.getTIdList(pId);

        for(String tId : tIdList){
            AnswerMsg answerMsg = new AnswerMsg();
            answerMsg.setrId(rId);
            answerMsg.setpId(pId);
            answerMsg.settId(tId);
            answerMsgList.add(answerMsg);
        }


        return answerMsgList;
    }


    @RequestMapping("/submitPaper")
    @ResponseBody
    public int submitPaper(@RequestBody List<AnswerMsg> answerMsgList){

        String dataStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());

        for(AnswerMsg answerMsg : answerMsgList){
            answerMsg.setaId(UUID.randomUUID().toString());
            answerMsg.setCreateTime(dataStr);
        }
        examServiceImpl.saveAnswerMsg(answerMsgList);

        int score = 0;

        for(AnswerMsg answerMsg : answerMsgList){
            Test test = new Test();
            test.settId(answerMsg.gettId());
            Test testByTId = testServiceImpl.queryTestByTId(test);

            if(testByTId.gettAnswer().equals(answerMsg.getaAnswer()))
                score += testByTId.gettScore();
        }

        return score;
    }

}
