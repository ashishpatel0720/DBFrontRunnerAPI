package com.db.dbfrontrunner.ordersExecuteBuyAndSell;

public class userdata {
    Double amount;
    String direction;
    String security;
    String brokerid;

    public userdata(){

    }

    public userdata(Double amount, String direction, String security, String brokerid) {
        this.amount = amount;
        this.direction = direction;
        this.security = security;
        this.brokerid = brokerid;
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
}
