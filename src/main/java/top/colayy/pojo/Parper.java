package top.colayy.pojo;

public class Parper {

    private String pId;             //主键
    private String pName;           //试卷名称
    private String uId;             //试卷创建者ID
    private String createTime;      //添加修改时间
    private String startTime;       //开始时间
    private String endTime;         //结束时间
    private String pCode;           //考试码
    private String pTime;           //考试时长

    public Parper() {
    }

    public Parper(String pId, String pName, String uId, String createTime, String startTime, String endTime, String pCode, String pTime) {
        this.pId = pId;
        this.pName = pName;
        this.uId = uId;
        this.createTime = createTime;
        this.startTime = startTime;
        this.endTime = endTime;
        this.pCode = pCode;
        this.pTime = pTime;
    }

    @Override
    public String toString() {
        return "Parper{" +
                "pId='" + pId + '\'' +
                ", pName='" + pName + '\'' +
                ", uId='" + uId + '\'' +
                ", createTime='" + createTime + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", pCode='" + pCode + '\'' +
                ", pTime='" + pTime + '\'' +
                '}';
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getpCode() {
        return pCode;
    }

    public void setpCode(String pCode) {
        this.pCode = pCode;
    }

    public String getpTime() {
        return pTime;
    }

    public void setpTime(String pTime) {
        this.pTime = pTime;
    }
}
