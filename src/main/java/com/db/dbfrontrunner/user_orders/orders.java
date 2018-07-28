package com.db.dbfrontrunner.user_orders;

import com.db.dbfrontrunner.user.User;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class orders {

    String clientname;
    String security;
    String tradedate;
    String tradetime;
    String quantity;
    String tradetype;
    String limitprice;
    String direction;
    String value;
    String  broker;
    @Id
    String isinno;

    public orders(){

    }

    public orders(String clientname, String security, String tradedate, String tradetime, String quantity, String tradetype, String limitprice, String direction, String value, String broker, String isinno) {
        this.clientname = clientname;
        this.security = security;
        this.tradedate = tradedate;
        this.tradetime = tradetime;
        this.quantity = quantity;
        this.tradetype = tradetype;
        this.limitprice = limitprice;
        this.direction = direction;
        this.value = value;
        this.broker = broker;
        this.isinno = isinno;
    }

    @Override
    public String toString() {
        return "orders{" +
                "clientname='" + clientname + '\'' +
                ", security='" + security + '\'' +
                ", tradedate='" + tradedate + '\'' +
                ", tradetime='" + tradetime + '\'' +
                ", quantity='" + quantity + '\'' +
                ", tradetype='" + tradetype + '\'' +
                ", limitprice='" + limitprice + '\'' +
                ", direction='" + direction + '\'' +
                ", value='" + value + '\'' +
                ", broker='" + broker + '\'' +
                ", isinno='" + isinno + '\'' +
                '}';
    }

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname;
    }

    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    public String getTradedate() {
        return tradedate;
    }

    public void setTradedate(String tradedate) {
        this.tradedate = tradedate;
    }

    public String getTradetime() {
        return tradetime;
    }

    public void setTradetime(String tradetime) {
        this.tradetime = tradetime;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getTradetype() {
        return tradetype;
    }

    public void setTradetype(String tradetype) {
        this.tradetype = tradetype;
    }

    public String getLimitprice() {
        return limitprice;
    }

    public void setLimitprice(String limitprice) {
        this.limitprice = limitprice;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getBroker() {
        return broker;
    }

    public void setBroker(String broker) {
        this.broker = broker;
    }

    public String getIsinno() {
        return isinno;
    }

    public void setIsinno(String isinno) {
        this.isinno = isinno;
    }
}
