package com.example.demo.count;


/**
 * 统计实体类
 */
public class CountEntity {

    private String orgId;
    private String orgCode;
    private Integer level;
    private String key;
    private Integer keyLevel;
    private String year;
    private String month;
    private Integer countType;
    private Integer count;

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

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getKeyLevel() {
        return keyLevel;
    }

    public void setKeyLevel(Integer keyLevel) {
        this.keyLevel = keyLevel;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public Integer getCountType() {
        return countType;
    }

    public void setCountType(Integer countType) {
        this.countType = countType;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
