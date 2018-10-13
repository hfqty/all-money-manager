package me.yuzh.amm.bean;

import java.util.Date;

public class SleepRecord {

    private Integer id;
    private String type;
    private Date time;

    public SleepRecord() {
    }

    public SleepRecord(String type, Date time) {
        this.type = type;
        this.time = time;
    }

    public SleepRecord(Integer id, String type, Date time) {
        this.id = id;
        this.type = type;
        this.time = time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "SleepRecord{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", time=" + time +
                '}';
    }
}
