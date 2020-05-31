package com.dong.findjob.entity;

public class UserFile {
    private Integer iduserFile;

    private Integer userid;

    private String fileid;

    public Integer getIduserFile() {
        return iduserFile;
    }

    public void setIduserFile(Integer iduserFile) {
        this.iduserFile = iduserFile;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getFileid() {
        return fileid;
    }

    public void setFileid(String fileid) {
        this.fileid = fileid == null ? null : fileid.trim();
    }
}