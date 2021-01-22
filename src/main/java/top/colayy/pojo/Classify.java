package top.colayy.pojo;

public class Classify {
    private String cId;
    private String cName;
    private String uId;
    private String createTime;

    public Classify() {
    }

    public Classify(String cId, String cName, String uId, String createTime) {
        this.cId = cId;
        this.cName = cName;
        this.uId = uId;
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Classify{" +
                "cId='" + cId + '\'' +
                ", cName='" + cName + '\'' +
                ", uId='" + uId + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
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
}
