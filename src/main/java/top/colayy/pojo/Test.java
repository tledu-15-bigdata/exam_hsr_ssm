package top.colayy.pojo;

public class Test {
    private String tId;
    private String tTopic;
    private String tAnswer;
    private int tScore;
    private int tType;
    private String cId;
    private String cName;
    private String createTime;
    private String uId;
    private String oA;
    private String oB;
    private String oC;
    private String oD;

    public Test() {
    }

    public Test(String tId, String tTopic, String tAnswer, int tScore, int tType, String cId, String cName, String createTime, String uId, String oA, String oB, String oC, String oD) {
        this.tId = tId;
        this.tTopic = tTopic;
        this.tAnswer = tAnswer;
        this.tScore = tScore;
        this.tType = tType;
        this.cId = cId;
        this.cName = cName;
        this.createTime = createTime;
        this.uId = uId;
        this.oA = oA;
        this.oB = oB;
        this.oC = oC;
        this.oD = oD;
    }

    @Override
    public String toString() {
        return "Test{" +
                "tId='" + tId + '\'' +
                ", tTopic='" + tTopic + '\'' +
                ", tAnswer='" + tAnswer + '\'' +
                ", tScore=" + tScore +
                ", tType=" + tType +
                ", cId='" + cId + '\'' +
                ", cName='" + cName + '\'' +
                ", createTime='" + createTime + '\'' +
                ", uId='" + uId + '\'' +
                ", oA='" + oA + '\'' +
                ", oB='" + oB + '\'' +
                ", oC='" + oC + '\'' +
                ", oD='" + oD + '\'' +
                '}';
    }

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId;
    }

    public String gettTopic() {
        return tTopic;
    }

    public void settTopic(String tTopic) {
        this.tTopic = tTopic;
    }

    public String gettAnswer() {
        return tAnswer;
    }

    public void settAnswer(String tAnswer) {
        this.tAnswer = tAnswer;
    }

    public int gettScore() {
        return tScore;
    }

    public void settScore(int tScore) {
        this.tScore = tScore;
    }

    public int gettType() {
        return tType;
    }

    public void settType(int tType) {
        this.tType = tType;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getoA() {
        return oA;
    }

    public void setoA(String oA) {
        this.oA = oA;
    }

    public String getoB() {
        return oB;
    }

    public void setoB(String oB) {
        this.oB = oB;
    }

    public String getoC() {
        return oC;
    }

    public void setoC(String oC) {
        this.oC = oC;
    }

    public String getoD() {
        return oD;
    }

    public void setoD(String oD) {
        this.oD = oD;
    }
}
