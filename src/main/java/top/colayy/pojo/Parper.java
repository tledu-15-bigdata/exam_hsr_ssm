package top.colayy.pojo;

public class Parper {

    private String pId;             //主键
    private String pName;           //试卷名称
    private String uId;             //试卷创建者ID
    private String createTime;      //添加修改时间
    private String pCode;           //考试码
    private int pTime;           //考试时长
    private int pStatus;         //试卷状态

    public Parper() {
    }

    public Parper(String pId, String pName, String uId, String createTime, String pCode, int pTime, int pStatus) {
        this.pId = pId;
        this.pName = pName;
        this.uId = uId;
        this.createTime = createTime;
        this.pCode = pCode;
        this.pTime = pTime;
        this.pStatus = pStatus;
    }

    @Override
    public String toString() {
        return "Parper{" +
                "pId='" + pId + '\'' +
                ", pName='" + pName + '\'' +
                ", uId='" + uId + '\'' +
                ", createTime='" + createTime + '\'' +
                ", pCode='" + pCode + '\'' +
                ", pTime='" + pTime + '\'' +
                ", pStatus='" + pStatus + '\'' +
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

    public String getpCode() {
        return pCode;
    }

    public void setpCode(String pCode) {
        this.pCode = pCode;
    }

    public int getpTime() {
        return pTime;
    }

    public void setpTime(int pTime) {
        this.pTime = pTime;
    }

    public int getpStatus() {
        return pStatus;
    }

    public void setpStatus(int pStatus) {
        this.pStatus = pStatus;
    }
}
