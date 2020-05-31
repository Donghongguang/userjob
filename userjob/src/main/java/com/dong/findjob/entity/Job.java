package com.dong.findjob.entity;

import java.util.Date;

public class Job {
    private Integer jobid;

    private String jobname;

    private Date createtime;

    private String jobstatus;

    private String jobdesc;

    private String jobneedskill;

    private String companyid;

    public Integer getJobid() {
        return jobid;
    }

    public void setJobid(Integer jobid) {
        this.jobid = jobid;
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname == null ? null : jobname.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getJobstatus() {
        return jobstatus;
    }

    public void setJobstatus(String jobstatus) {
        this.jobstatus = jobstatus == null ? null : jobstatus.trim();
    }

    public String getJobdesc() {
        return jobdesc;
    }

    public void setJobdesc(String jobdesc) {
        this.jobdesc = jobdesc == null ? null : jobdesc.trim();
    }

    public String getJobneedskill() {
        return jobneedskill;
    }

    public void setJobneedskill(String jobneedskill) {
        this.jobneedskill = jobneedskill == null ? null : jobneedskill.trim();
    }

    public String getCompanyid() {
        return companyid;
    }

    public void setCompanyid(String companyid) {
        this.companyid = companyid == null ? null : companyid.trim();
    }
}