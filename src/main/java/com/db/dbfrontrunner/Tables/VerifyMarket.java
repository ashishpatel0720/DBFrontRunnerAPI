package com.db.dbfrontrunner.Tables;

public class VerifyMarket {

    String empid;
    String name_of_stock;
    int broker_price;

    public VerifyMarket()
    {

    }
    public VerifyMarket(String empid, String name_of_stock, int broker_price) {
        this.empid = empid;
        this.name_of_stock = name_of_stock;
        this.broker_price = broker_price;
    }
    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public String getName_of_stock() {
        return name_of_stock;
    }

    public void setName_of_stock(String name_of_stock) {
        this.name_of_stock = name_of_stock;
    }

    public int getBroker_price() {
        return broker_price;
    }

    public void setBroker_price(int broker_price) {
        this.broker_price = broker_price;
    }





}
