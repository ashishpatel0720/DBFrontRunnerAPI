package com.db.dbfrontrunner.orders;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class orders {

    String CLIENT_NAME;
    String SECURITY;
    String TRADE_DATE;
    String TRADE_TIME;
    int QUANTITY;
    String TRADE_TYPE;
    Double LIMIT_PRICE;
    String DIRECTION;
    Double VALUE_RS;
    String BROKER_ID;
    @Id
    String ISIN_NO;

    public orders(){

    }

    public orders(String CLIENT_NAME, String SECURITY, String TRADE_DATE, String TRADE_TIME, int QUANTITY, String TRADE_TYPE, Double LIMIT_PRICE, String DIRECTION, Double VALUE_RS, String BROKER_ID, String ISIN_NO) {
        this.CLIENT_NAME = CLIENT_NAME;
        this.SECURITY = SECURITY;
        this.TRADE_DATE = TRADE_DATE;
        this.TRADE_TIME = TRADE_TIME;
        this.QUANTITY = QUANTITY;
        this.TRADE_TYPE = TRADE_TYPE;
        this.LIMIT_PRICE = LIMIT_PRICE;
        this.DIRECTION = DIRECTION;
        this.VALUE_RS = VALUE_RS;
        this.BROKER_ID = BROKER_ID;
        this.ISIN_NO = ISIN_NO;
    }

    @Override
    public String toString() {
        return "oders{" +
                "CLIENT_NAME='" + CLIENT_NAME + '\'' +
                ", SECURITY='" + SECURITY + '\'' +
                ", TRADE_DATE='" + TRADE_DATE + '\'' +
                ", TRADE_TIME='" + TRADE_TIME + '\'' +
                ", QUANTITY=" + QUANTITY +
                ", TRADE_TYPE='" + TRADE_TYPE + '\'' +
                ", LIMIT_PRICE=" + LIMIT_PRICE +
                ", DIRECTION='" + DIRECTION + '\'' +
                ", VALUE_RS=" + VALUE_RS +
                ", BROKER_ID='" + BROKER_ID + '\'' +
                ", ISIN_NO='" + ISIN_NO + '\'' +
                '}';
    }

    public String getCLIENT_NAME() {
        return CLIENT_NAME;
    }

    public void setCLIENT_NAME(String CLIENT_NAME) {
        this.CLIENT_NAME = CLIENT_NAME;
    }

    public String getSECURITY() {
        return SECURITY;
    }

    public void setSECURITY(String SECURITY) {
        this.SECURITY = SECURITY;
    }

    public String getTRADE_DATE() {
        return TRADE_DATE;
    }

    public void setTRADE_DATE(String TRADE_DATE) {
        this.TRADE_DATE = TRADE_DATE;
    }

    public String getTRADE_TIME() {
        return TRADE_TIME;
    }

    public void setTRADE_TIME(String TRADE_TIME) {
        this.TRADE_TIME = TRADE_TIME;
    }

    public int getQUANTITY() {
        return QUANTITY;
    }

    public void setQUANTITY(int QUANTITY) {
        this.QUANTITY = QUANTITY;
    }

    public String getTRADE_TYPE() {
        return TRADE_TYPE;
    }

    public void setTRADE_TYPE(String TRADE_TYPE) {
        this.TRADE_TYPE = TRADE_TYPE;
    }

    public Double getLIMIT_PRICE() {
        return LIMIT_PRICE;
    }

    public void setLIMIT_PRICE(Double LIMIT_PRICE) {
        this.LIMIT_PRICE = LIMIT_PRICE;
    }

    public String getDIRECTION() {
        return DIRECTION;
    }

    public void setDIRECTION(String DIRECTION) {
        this.DIRECTION = DIRECTION;
    }

    public Double getVALUE_RS() {
        return VALUE_RS;
    }

    public void setVALUE_RS(Double VALUE_RS) {
        this.VALUE_RS = VALUE_RS;
    }

    public String getBROKER_ID() {
        return BROKER_ID;
    }

    public void setBROKER_ID(String BROKER_ID) {
        this.BROKER_ID = BROKER_ID;
    }

    public String getISIN_NO() {
        return ISIN_NO;
    }

    public void setISIN_NO(String ISIN_NO) {
        this.ISIN_NO = ISIN_NO;
    }


}
