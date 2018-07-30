package com.db.dbfrontrunner.user_orders;

public class userid {

    String brokerid;
    public userid(){
        
    }

    public userid(String brokerid) {
        this.brokerid = brokerid;
    }

    public String getBrokerid() {
        return brokerid;
    }

    @Override
    public String toString() {
        return "userid{" +
                "brokerid='" + brokerid + '\'' +
                '}';
    }

    public void setBrokerid(String brokerid) {
        this.brokerid = brokerid;
    }
}


