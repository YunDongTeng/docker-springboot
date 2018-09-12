package com.example.demo.count2;

import java.util.ArrayList;
import java.util.List;

public class BaseCount {

    private String orgId;
    private String orgCode;

  private YearCount yearCount;

    private List<MonthCount> months;

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public YearCount getYearCount() {
        return yearCount;
    }

    public void setYearCount(YearCount yearCount) {
        this.yearCount = yearCount;
    }

    public List<MonthCount> getMonths() {
        return months;
    }

    public void setMonths(List<MonthCount> months) {
        this.months = months;
    }
}
