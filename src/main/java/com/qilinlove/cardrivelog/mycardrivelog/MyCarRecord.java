package com.qilinlove.cardrivelog.mycardrivelog;

import java.util.Date;

/**
 * Created by kevin on 2016/1/4.
 */
public class MyCarRecord {
    public MyCarRecord(){

    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Integer getEstRemains() {
        return estRemains;
    }

    public void setEstRemains(Integer estRemains) {
        this.estRemains = estRemains;
    }

    public Integer getRunningHistory() {
        return runningHistory;
    }

    public void setRunningHistory(Integer runningHistory) {
        this.runningHistory = runningHistory;
    }

    public Date getStopTime() {
        return stopTime;
    }

    public void setStopTime(Date stopTime) {
        this.stopTime = stopTime;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    private Date startTime;
    private Integer estRemains;
    private Integer runningHistory;
    private Date stopTime;
    private Date createdTime;
    private String objectId;

}
