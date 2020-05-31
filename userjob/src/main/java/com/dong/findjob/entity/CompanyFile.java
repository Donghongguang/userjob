package com.dong.findjob.entity;

public class CompanyFile {
    private Integer idcompanyFile;

    private String companyid;

    private String fileid;

    public Integer getIdcompanyFile() {
        return idcompanyFile;
    }

    public void setIdcompanyFile(Integer idcompanyFile) {
        this.idcompanyFile = idcompanyFile;
    }

    public String getCompanyid() {
        return companyid;
    }

    public void setCompanyid(String companyid) {
        this.companyid = companyid == null ? null : companyid.trim();
    }

    public String getFileid() {
        return fileid;
    }

    public void setFileid(String fileid) {
        this.fileid = fileid == null ? null : fileid.trim();
    }
}