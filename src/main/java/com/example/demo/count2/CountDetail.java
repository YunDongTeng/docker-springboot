package com.example.demo.count2;

public class CountDetail {

    private String key;
    private Integer count;

    public CountDetail() {
    }

    public CountDetail(String key, Integer count) {
        this.key = key;
        this.count = count;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
