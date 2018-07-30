package com.db.dbfrontrunner.verify;

import javax.persistence.*;

@Entity
//@Table(name="stock")
public class Stock {

    int hours;

    int minutes;
    @Id
    String symbol;
    String isinno;
    float stockcol;


    public Stock()
    {}

    public Stock(int hours, int minutes, String symbol, String isinno, float stockcol) {
        this.hours = hours;
        this.minutes = minutes;
        this.symbol = symbol;
        this.isinno = isinno;
        this.stockcol = stockcol;
    }


    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getIsinno() {
        return isinno;
    }

    public void setIsinno(String isinno) {
        this.isinno = isinno;
    }

    public float getstockcol() {
        return stockcol;
    }

    public void setstockcol(float stockcol) {
        this.stockcol = stockcol;
    }






}
