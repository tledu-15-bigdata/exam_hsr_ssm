package top.colayy.pojo;

public class Menu {

    private String mId;             //主键列
    private String mCom;            //菜单内容
    private String mClass;          //菜单的class
    private String mLeader;         //上级菜单
    private String createTime;      //添加修改时间

    public Menu() {
    }

    public Menu(String mId, String mCom, String mClass, String mLeader, String createTime) {
        this.mId = mId;
        this.mCom = mCom;
        this.mClass = mClass;
        this.mLeader = mLeader;
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "mId='" + mId + '\'' +
                ", mCom='" + mCom + '\'' +
                ", mClass='" + mClass + '\'' +
                ", mLeader='" + mLeader + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public String getmCom() {
        return mCom;
    }

    public void setmCom(String mCom) {
        this.mCom = mCom;
    }

    public String getmClass() {
        return mClass;
    }

    public void setmClass(String mClass) {
        this.mClass = mClass;
    }

    public String getmLeader() {
        return mLeader;
    }

    public void setmLeader(String mLeader) {
        this.mLeader = mLeader;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
