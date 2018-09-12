package com.example.demo.count2;

import java.util.ArrayList;
import java.util.List;

public class YearCount {

    //年份
    private String year;
    private List<CountDetail> details;
    private Integer count;

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public List<CountDetail> getDetails() {
        return details;
    }

    public void setDetails(List<CountDetail> details) {
        this.details = details;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
