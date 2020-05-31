package com.dong.findjob.entity;

public class File {
    private String idfile;

    private String filename;

    private String uploadtime;

    private String filepath;

    private String filesize;

    public String getIdfile() {
        return idfile;
    }

    public void setIdfile(String idfile) {
        this.idfile = idfile == null ? null : idfile.trim();
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public String getUploadtime() {
        return uploadtime;
    }

    public void setUploadtime(String uploadtime) {
        this.uploadtime = uploadtime == null ? null : uploadtime.trim();
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath == null ? null : filepath.trim();
    }

    public String getFilesize() {
        return filesize;
    }

    public void setFilesize(String filesize) {
        this.filesize = filesize == null ? null : filesize.trim();
    }
}