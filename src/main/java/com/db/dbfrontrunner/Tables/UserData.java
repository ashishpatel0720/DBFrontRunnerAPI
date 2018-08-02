package com.db.dbfrontrunner.Tables;

public class UserData {
   public  Double amount;
   public  String direction;
    public String symbol;
    public String brokerid;
    public int quantity;
    public String clientname;
    public String isinno;


    public UserData(){

    }

    public UserData(Double amount, String direction, String symbol, String brokerid, int quantity, String clientname, String isinno) {
        this.amount = amount;
        this.direction = direction;
        this.symbol = symbol;
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

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
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
