package com.zerun.bom.domin;

public class Materiel {
    private String id;
    private String materielcode;
    private Integer materielcategory;
    private String materielmodel;
    private String materielname;
    private Integer materielcount;
    private String materielmanu;
    private String materieldesc;
    private String createdby;
    private String modefiedby;
    private Character state;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaterielcode() {
        return materielcode;
    }

    public void setMaterielcode(String materielcode) {
        this.materielcode = materielcode;
    }

    public Integer getMaterielcategory() {
        return materielcategory;
    }

    public void setMaterielcategory(Integer materielcategory) {
        this.materielcategory = materielcategory;
    }

    public String getMaterielmodel() {
        return materielmodel;
    }

    public void setMaterielmodel(String materielmodel) {
        this.materielmodel = materielmodel;
    }

    public String getMaterielname() {
        return materielname;
    }

    public void setMaterielname(String materielname) {
        this.materielname = materielname;
    }

    public Integer getMaterielcount() {
        return materielcount;
    }

    public void setMaterielcount(Integer materielcount) {
        this.materielcount = materielcount;
    }

    public String getMaterielmanu() {
        return materielmanu;
    }

    public void setMaterielmanu(String materielmanu) {
        this.materielmanu = materielmanu;
    }

    public String getMaterieldesc() {
        return materieldesc;
    }

    public void setMaterieldesc(String materieldesc) {
        this.materieldesc = materieldesc;
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
