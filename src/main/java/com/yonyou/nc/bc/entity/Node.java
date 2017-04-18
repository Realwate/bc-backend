package com.yonyou.nc.bc.entity;

public class Node {
    private String id;

    private String parentid;

    private String label;

    private Integer productid;

    private Integer nodelevel;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Integer getNodelevel() {
        return nodelevel;
    }

    public void setNodelevel(Integer nodelevel) {
        this.nodelevel = nodelevel;
    }
}