package top.colayy.pojo;

public class User {

    private String uId;         //主键
    private String uAcc;        //账号
    private String uName;       //用户名
    private String uPwd;        //密码
    private String uPhoto;      //头像路径
    private String createTime;  //添加修改时间
    private int isDisabled;     //禁用
    private int isRoot;         //管理员

    public User() {
    }

    public User(String uId, String uAcc, String uName, String uPwd, String uPhoto, String createTime, int isDisabled, int isRoot) {
        this.uId = uId;
        this.uAcc = uAcc;
        this.uName = uName;
        this.uPwd = uPwd;
        this.uPhoto = uPhoto;
        this.createTime = createTime;
        this.isDisabled = isDisabled;
        this.isRoot = isRoot;
    }

    @Override
    public String toString() {
        return "User{" +
                "uId='" + uId + '\'' +
                ", uAcc='" + uAcc + '\'' +
                ", uName='" + uName + '\'' +
                ", uPwd='" + uPwd + '\'' +
                ", uPhoto='" + uPhoto + '\'' +
                ", createTime='" + createTime + '\'' +
                ", isDisabled=" + isDisabled +
                ", isRoot=" + isRoot +
                '}';
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getuAcc() {
        return uAcc;
    }

    public void setuAcc(String uAcc) {
        this.uAcc = uAcc;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPwd() {
        return uPwd;
    }

    public void setuPwd(String uPwd) {
        this.uPwd = uPwd;
    }

    public String getuPhoto() {
        return uPhoto;
    }

    public void setuPhoto(String uPhoto) {
        this.uPhoto = uPhoto;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public int getIsDisabled() {
        return isDisabled;
    }

    public void setIsDisabled(int isDisabled) {
        this.isDisabled = isDisabled;
    }

    public int getIsRoot() {
        return isRoot;
    }

    public void setIsRoot(int isRoot) {
        this.isRoot = isRoot;
    }
}
