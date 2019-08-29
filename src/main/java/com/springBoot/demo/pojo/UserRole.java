package com.springBoot.demo.pojo;

import java.io.Serializable;
import java.util.Date;

public class UserRole implements Serializable {

    private int id;

    private String userEmail;

    private String createUserEmail;

    private int status;

    private Date createTime;

    private Date updateTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getCreateUserEmail() {
        return createUserEmail;
    }

    public void setCreateUserEmail(String createUserEmail) {
        this.createUserEmail = createUserEmail;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "id=" + id +
                ", userEmail='" + userEmail + '\'' +
                ", createUserEmail='" + createUserEmail + '\'' +
                ", status=" + status +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
