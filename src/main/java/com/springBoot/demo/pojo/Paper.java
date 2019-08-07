package com.springBoot.demo.pojo;

public class Paper {
    private Integer pid;

    private String pname;

    private Integer sid;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    @Override
    public String toString() {
        return "Paper{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", sid=" + sid +
                '}';
    }
}