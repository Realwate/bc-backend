package com.yonyou.nc.bc.entity;

public class NodeInfo {
    private String id;

    private String nodeid;

    private Integer requirementflag;

    private Integer developflag;

    private Integer testflag;

    private String boss;

    private String documentid;

    private Integer productid;

    private String objCode;

    private String objName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getNodeid() {
        return nodeid;
    }

    public void setNodeid(String nodeid) {
        this.nodeid = nodeid == null ? null : nodeid.trim();
    }

    public Integer getRequirementflag() {
        return requirementflag;
    }

    public void setRequirementflag(Integer requirementflag) {
        this.requirementflag = requirementflag;
    }

    public Integer getDevelopflag() {
        return developflag;
    }

    public void setDevelopflag(Integer developflag) {
        this.developflag = developflag;
    }

    public Integer getTestflag() {
        return testflag;
    }

    public void setTestflag(Integer testflag) {
        this.testflag = testflag;
    }

    public String getBoss() {
        return boss;
    }

    public void setBoss(String boss) {
        this.boss = boss == null ? null : boss.trim();
    }

    public String getDocumentid() {
        return documentid;
    }

    public void setDocumentid(String documentid) {
        this.documentid = documentid == null ? null : documentid.trim();
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public String getObjCode() {
        return objCode;
    }

    public void setObjCode(String objCode) {
        this.objCode = objCode == null ? null : objCode.trim();
    }

    public String getObjName() {
        return objName;
    }

    public void setObjName(String objName) {
        this.objName = objName == null ? null : objName.trim();
    }
}