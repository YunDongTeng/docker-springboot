package com.example.demo.count2;

import java.util.ArrayList;
import java.util.List;

public class MonthCount {

    //月份
    private String month;
    private List<CountDetail> monthArray;
    private Integer count;

    public MonthCount() {
    }

    public MonthCount(String month, Integer count) {
        this.month = month;
        this.count = count;
    }

    public MonthCount(String month, List<CountDetail> monthArray) {
        this.month = month;
        this.monthArray = monthArray;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public List<CountDetail> getMonthArray() {
        return monthArray;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void setMonthArray(List<CountDetail> monthArray) {
        this.monthArray = monthArray;
    }
}
