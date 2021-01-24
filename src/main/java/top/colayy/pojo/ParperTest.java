package top.colayy.pojo;

public class ParperTest {

    private String pId;         //试卷ID
    private String tId;         //试题ID
    private int tType;          //0单选1简答

    public ParperTest() {
    }

    public ParperTest(String pId, String tId, int tType) {
        this.pId = pId;
        this.tId = tId;
        this.tType = tType;
    }

    @Override
    public String toString() {
        return "ParperTest{" +
                "pId='" + pId + '\'' +
                ", tId='" + tId + '\'' +
                ", tType=" + tType +
                '}';
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

    public int gettType() {
        return tType;
    }

    public void settType(int tType) {
        this.tType = tType;
    }
}
