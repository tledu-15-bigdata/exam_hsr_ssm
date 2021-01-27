package top.colayy.pojo;

/**
 * 主要记录学生信息
 */
public class Record {
    private String rId;
    private String rName;
    private String rPhone;
    private String pCode;
    private String rScore;
    private String pId;
    private String createTime;

    public Record() {
    }

    public Record(String rId, String rName, String rPhone, String rScore, String pId, String createTime) {
        this.rId = rId;
        this.rName = rName;
        this.rPhone = rPhone;
        this.rScore = rScore;
        this.pId = pId;
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Record{" +
                "rId='" + rId + '\'' +
                ", rName='" + rName + '\'' +
                ", rPhone='" + rPhone + '\'' +
                ", pCode='" + pCode + '\'' +
                ", rScore='" + rScore + '\'' +
                ", pId='" + pId + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
    }

    public String getpCode() {
        return pCode;
    }

    public void setpCode(String pCode) {
        this.pCode = pCode;
    }

    public String getrId() {
        return rId;
    }

    public void setrId(String rId) {
        this.rId = rId;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }

    public String getrPhone() {
        return rPhone;
    }

    public void setrPhone(String rPhone) {
        this.rPhone = rPhone;
    }

    public String getrScore() {
        return rScore;
    }

    public void setrScore(String rScore) {
        this.rScore = rScore;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
