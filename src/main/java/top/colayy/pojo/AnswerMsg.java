package top.colayy.pojo;

public class AnswerMsg {
    private String aId;
    private String rId;
    private String pId;
    private String tId;
    private String aAnswer;
    private String createTime;

    public AnswerMsg() {
    }

    public AnswerMsg(String aId, String rId, String pId, String tId, String aAnswer, String createTime) {
        this.aId = aId;
        this.rId = rId;
        this.pId = pId;
        this.tId = tId;
        this.aAnswer = aAnswer;
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "AnswerMsg{" +
                "aId='" + aId + '\'' +
                ", rId='" + rId + '\'' +
                ", pId='" + pId + '\'' +
                ", tId='" + tId + '\'' +
                ", aAnswer='" + aAnswer + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
    }

    public String getaId() {
        return aId;
    }

    public void setaId(String aId) {
        this.aId = aId;
    }

    public String getrId() {
        return rId;
    }

    public void setrId(String rId) {
        this.rId = rId;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId;
    }

    public String getaAnswer() {
        return aAnswer;
    }

    public void setaAnswer(String aAnswer) {
        this.aAnswer = aAnswer;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
