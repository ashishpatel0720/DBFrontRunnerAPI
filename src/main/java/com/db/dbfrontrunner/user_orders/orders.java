package com.db.dbfrontrunner.user_orders;

import com.db.dbfrontrunner.user.User;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class orders {

           String client_name;
           String security;
           String trade_date;
           String trade_time;
           int quantity;
           String trade_type;
           Double limit_price;
           String direction;
           Double value_rs;
           String Broker_id;
           @Id
           String isin_no;

//        String CLIENT_NAME;
//        String SECURITY;
//        String TRADE_DATE;
//        String TRADE_TIME;
//        int QUANTITY;
//        String TRADE_TYPE;
//        Double LIMIT_PRICE;
//        String DIRECTION;
//        Double VALUE_RS;
//        @Column(name = "BROKER_ID")
//        String BROKER_ID;
//        @Id
//        String ISIN_NO;
        @ManyToOne
        User user;


        public orders(){

        }

    public orders(String client_name, String security, String trade_date, String trade_time, int quantity, String trade_type, Double limit_price, String direction, Double value_rs, String broker, String isin_no, User user) {
        this.client_name = client_name;
        this.security = security;
        this.trade_date = trade_date;
        this.trade_time = trade_time;
        this.quantity = quantity;
        this.trade_type = trade_type;
        this.limit_price = limit_price;
        this.direction = direction;
        this.value_rs = value_rs;
        Broker_id = broker;
        this.isin_no = isin_no;
        this.user = user;
    }

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    public String getTrade_date() {
        return trade_date;
    }

    public void setTrade_date(String trade_date) {
        this.trade_date = trade_date;
    }

    public String getTrade_time() {
        return trade_time;
    }

    public void setTrade_time(String trade_time) {
        this.trade_time = trade_time;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getTrade_type() {
        return trade_type;
    }

    public void setTrade_type(String trade_type) {
        this.trade_type = trade_type;
    }

    public Double getLimit_price() {
        return limit_price;
    }

    public void setLimit_price(Double limit_price) {
        this.limit_price = limit_price;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Double getValue_rs() {
        return value_rs;
    }

    public void setValue_rs(Double value_rs) {
        this.value_rs = value_rs;
    }

    public String getBroker_id() {
        return Broker_id;
    }

    public void setBroker_id(String broker_id) {
        Broker_id = broker_id;
    }

    public String getIsin_no() {
        return isin_no;
    }

    public void setIsin_no(String isin_no) {
        this.isin_no = isin_no;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}


