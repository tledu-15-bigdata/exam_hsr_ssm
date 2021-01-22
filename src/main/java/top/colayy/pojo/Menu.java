package top.colayy.pojo;

public class Menu {

    private String mId;             //主键列
    private String mCon;            //菜单内容
    private String mPage;           //菜单的pageName
    private int mOrder;             //菜单顺序
    private String mLeader;         //上级菜单
    private String createTime;      //添加修改时间
    private int isDelete;           //禁用
    private int isRoot;             //管理员

    public Menu() {
    }

    public Menu(String mId, String mCon, String mPage, int mOrder, String mLeader, String createTime, int isDelete, int isRoot) {
        this.mId = mId;
        this.mCon = mCon;
        this.mPage = mPage;
        this.mOrder = mOrder;
        this.mLeader = mLeader;
        this.createTime = createTime;
        this.isDelete = isDelete;
        this.isRoot = isRoot;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "mId='" + mId + '\'' +
                ", mCon='" + mCon + '\'' +
                ", mPage='" + mPage + '\'' +
                ", mOrder=" + mOrder +
                ", mLeader='" + mLeader + '\'' +
                ", createTime='" + createTime + '\'' +
                ", isDelete=" + isDelete +
                ", isRoot=" + isRoot +
                '}';
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public String getmCon() {
        return mCon;
    }

    public void setmCon(String mCon) {
        this.mCon = mCon;
    }

    public String getmPage() {
        return mPage;
    }

    public void setmPage(String mPage) {
        this.mPage = mPage;
    }

    public int getmOrder() {
        return mOrder;
    }

    public void setmOrder(int mOrder) {
        this.mOrder = mOrder;
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

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    public int getIsRoot() {
        return isRoot;
    }

    public void setIsRoot(int isRoot) {
        this.isRoot = isRoot;
    }
}
