package com.zerun.bom.domin;

public class Bom {
    private String  id;
    private String bomname;
    private String bomversion;
    private String bomdesc;
    private String bomtype;
    private String createdby;
    private String modefiedby;
    private Character state;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBomname() {
        return bomname;
    }

    public void setBomname(String bomname) {
        this.bomname = bomname;
    }

    public String getBomversion() {
        return bomversion;
    }

    public void setBomversion(String bomversion) {
        this.bomversion = bomversion;
    }

    public String getBomdesc() {
        return bomdesc;
    }

    public void setBomdesc(String bomdesc) {
        this.bomdesc = bomdesc;
    }

    public String getBomtype() {
        return bomtype;
    }

    public void setBomtype(String bomtype) {
        this.bomtype = bomtype;
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
