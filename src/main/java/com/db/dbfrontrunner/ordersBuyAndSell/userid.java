package com.db.dbfrontrunner.ordersBuyAndSell;

public class userid {

    String brokerid;
    String security;

    public userid(){

    }

    public userid(String brokerid, String security) {
        this.brokerid = brokerid;
        this.security = security;
    }

    @Override
    public String toString() {
        return "userid{" +
                "brokerid='" + brokerid + '\'' +
                ", security='" + security + '\'' +
                '}';
    }

    public String getBrokerid() {
        return brokerid;
    }

    public void setBrokerid(String brokerid) {
        this.brokerid = brokerid;
    }

    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }
}
