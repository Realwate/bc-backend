package com.yonyou.nc.bc.entity;

public class Config {
    private String id;

    private String uploaddir;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUploaddir() {
        return uploaddir;
    }

    public void setUploaddir(String uploaddir) {
        this.uploaddir = uploaddir == null ? null : uploaddir.trim();
    }
}