package com.zerun.bom.domin;

import java.util.Date;

public class FinishedProduct {

    private Integer id;
    private Integer type;
    private String productcode;
    private String productname;
    private String productmodel;
    private String productversion;
    private Integer productstock;
    private Integer productcount;
    private String productsource;
    private String operatorby;
    private String borrower;
    private Date borrowtime;
    private Integer borrowperiod;
    private String createdby;
    private String modefiedby;
    private Character state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getProductcode() {
        return productcode;
    }

    public void setProductcode(String productcode) {
        this.productcode = productcode;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getProductmodel() {
        return productmodel;
    }

    public void setProductmodel(String productmodel) {
        this.productmodel = productmodel;
    }

    public String getProductversion() {
        return productversion;
    }

    public void setProductversion(String productversion) {
        this.productversion = productversion;
    }

    public Integer getProductstock() {
        return productstock;
    }

    public void setProductstock(Integer productstock) {
        this.productstock = productstock;
    }

    public Integer getProductcount() {
        return productcount;
    }

    public void setProductcount(Integer productcount) {
        this.productcount = productcount;
    }

    public String getProductsource() {
        return productsource;
    }

    public void setProductsource(String productsource) {
        this.productsource = productsource;
    }

    public String getOperatorby() {
        return operatorby;
    }

    public void setOperatorby(String operatorby) {
        this.operatorby = operatorby;
    }

    public String getBorrower() {
        return borrower;
    }

    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    public Date getBorrowtime() {
        return borrowtime;
    }

    public void setBorrowtime(Date borrowtime) {
        this.borrowtime = borrowtime;
    }

    public Integer getBorrowperiod() {
        return borrowperiod;
    }

    public void setBorrowperiod(Integer borrowperiod) {
        this.borrowperiod = borrowperiod;
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
