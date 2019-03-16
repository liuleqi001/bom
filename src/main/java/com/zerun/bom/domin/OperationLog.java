package com.zerun.bom.domin;

public class OperationLog {
    private  Integer id;
    private  Integer operationtype;
    private String samplecode;
    private Integer sampletype;
    private String samplename;
    private String samplemodel;
    private Integer samplecount;
    private String agent;
    private String createdby;
    private String modefiedby;
    private Character state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOperationtype() {
        return operationtype;
    }

    public void setOperationtype(Integer operationtype) {
        this.operationtype = operationtype;
    }

    public String getSamplecode() {
        return samplecode;
    }

    public void setSamplecode(String samplecode) {
        this.samplecode = samplecode;
    }

    public Integer getSampletype() {
        return sampletype;
    }

    public void setSampletype(Integer sampletype) {
        this.sampletype = sampletype;
    }

    public String getSamplename() {
        return samplename;
    }

    public void setSamplename(String samplename) {
        this.samplename = samplename;
    }

    public String getSamplemodel() {
        return samplemodel;
    }

    public void setSamplemodel(String samplemodel) {
        this.samplemodel = samplemodel;
    }

    public Integer getSamplecount() {
        return samplecount;
    }

    public void setSamplecount(Integer samplecount) {
        this.samplecount = samplecount;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public String getModefiedby() {
        return modefiedby;
    }

    public void setModefiedby(String modefiedby) {
        this.modefiedby = modefiedby;
    }

    public Character getState() {
        return state;
    }

    public void setState(Character state) {
        this.state = state;
    }
}
