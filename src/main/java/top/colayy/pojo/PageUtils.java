package top.colayy.pojo;

import java.util.List;

public class PageUtils {
    private static final long serialVersionUID = 1L;
    private List<?> rows;
    private int total;

    public PageUtils() {
    }

    public PageUtils(List<?> rows, int total) {
        this.rows = rows;
        this.total = total;
    }

    @Override
    public String toString() {
        return "PagaUtils{" +
                "total=" + total +
                ", rows=" + rows +
                '}';
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }
}
