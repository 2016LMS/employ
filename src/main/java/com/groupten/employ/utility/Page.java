package com.groupten.employ.utility;

/**
 * Autor Lms
 * Time 2019/10/7/007
 */
public class Page {

    private int pageNum;    //当前页,从1开始
    private int pageIndex;  //每一页的起始索引
    private int pageTotal;  //总页数
    private int totalCount; //总记录数
    private int pageSize;   //每页显示多少数据


    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageIndex() {
        pageIndex=(pageNum-1)*pageSize;
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageTotal() {
        if (totalCount%pageSize==0){
            pageTotal=totalCount/pageSize;
        }else{
            pageTotal=totalCount/pageSize+1;
        }
        return pageTotal;
    }

    public void setPageTotal(int pageTotal) {
        this.pageTotal = pageTotal;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
