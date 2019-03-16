package com.zerun.bom.domin;

public class BomMateriel {

    private String id;

    private String bomID;
    private String  materielID;
    private String createdby;
    private String modefiedby;
    private Character state;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBomID() {
        return bomID;
    }

    public void setBomID(String bomID) {
        this.bomID = bomID;
    }

    public String getMaterielID() {
        return materielID;
    }

    public void setMaterielID(String materielID) {
        this.materielID = materielID;
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
