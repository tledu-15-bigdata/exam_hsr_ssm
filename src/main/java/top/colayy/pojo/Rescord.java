package top.colayy.pojo;

public class Rescord {

    private String rId;             //主键
    private String rName;           //学生姓名
    private String rPhone;          //学生手机号
    private int rScore;             //学生成绩，默认-1，表示正在考试
    private String pId;             //试卷ID
    private String createTime;      //添加修改时间

    public Rescord() {
    }

    public Rescord(String rId, String rName, String rPhone, int rScore, String pId, String createTime) {
        this.rId = rId;
        this.rName = rName;
        this.rPhone = rPhone;
        this.rScore = rScore;
        this.pId = pId;
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Rescord{" +
                "rId='" + rId + '\'' +
                ", rName='" + rName + '\'' +
                ", rPhone='" + rPhone + '\'' +
                ", rScore=" + rScore +
                ", pId='" + pId + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
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

    public int getrScore() {
        return rScore;
    }

    public void setrScore(int rScore) {
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
