package me.yuzh.amm.vo;

import java.util.List;

public class Page<T> {

    private Integer total;
    private Integer pageNumber;
    private Integer pageSize;
    private Integer rowoffset;
    private String sortOrder;
    private String sortName;

    private List<T> rows;

    public Integer getRowoffset() {
        return rowoffset;
    }

    public void setRowoffset(Integer rowoffset) {
        this.rowoffset = rowoffset;
        this.pageNumber = rowoffset;
    }

    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        this.rowoffset = (pageNumber - 1) * pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public Page() {
    }


    public Page(Integer rowoffset, Integer pageSize) {
        if (rowoffset == null) {
            setPageNumber(1);
        } else {
            this.rowoffset = rowoffset;
        }
        if (pageSize == null) {
            this.pageSize = 10;
        } else {
            this.pageSize = pageSize;
        }
        this.sortOrder = "desc";
        this.sortName = "id";
    }

    public Page(Integer rowoffset, Integer pageSize, String sortOrder, String sortName) {
        if (rowoffset == null)
            this.rowoffset = 0;
        else
            this.rowoffset = rowoffset;
        if (pageSize == null)
            this.pageSize = 0;
        else
            this.pageSize = pageSize;
        if (sortOrder == null)
           this. sortOrder = "";
        else
            this.sortOrder = sortOrder;

        if (sortName == null)
            this.sortName = "id ";
        else if("recordDateStr".equals(sortName))
            this.sortName = "recordDate ";
        else if("typeStr".equals(sortName))
            this.sortName = "type";
        else
            this.sortName = sortName+" ";

    }

    public boolean canDo() {
        return (pageNumber != null && pageSize != null) || (rowoffset != null && pageSize != null);
    }

    @Override
    public String toString() {
        return "Page{" +
                "total=" + total +
                ", pageNumber=" + pageNumber +
                ", pageSize=" + pageSize +
                ", rowoffset=" + rowoffset +
                ", sortOrder='" + sortOrder + '\'' +
                ", sortName='" + sortName + '\'' +
                ", rows=" + rows +
                '}';
    }
}
