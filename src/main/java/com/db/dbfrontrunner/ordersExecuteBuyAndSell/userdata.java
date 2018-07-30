package com.db.dbfrontrunner.ordersExecuteBuyAndSell;

public class userdata {
    Double amount;
    String direction;
    String security;
    String brokerid;
    int quantity;
    String clientname;
    String isinno;


    public userdata(){

    }

    public userdata(Double amount, String direction, String security, String brokerid, int quantity, String clientname, String isinno) {
        this.amount = amount;
        this.direction = direction;
        this.security = security;
        this.brokerid = brokerid;
        this.quantity = quantity;
        this.clientname = clientname;
        this.isinno = isinno;
    }

    public String getIsinno() {
        return isinno;
    }

    public void setIsinno(String isinno) {
        this.isinno = isinno;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    public String getBrokerid() {
        return brokerid;
    }

    public void setBrokerid(String brokerid) {
        this.brokerid = brokerid;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname;
    }
}
