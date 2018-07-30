package com.db.dbfrontrunner.verify;



public interface VerifyMarketRepository{

    float findBySymbolandHoursandMinutes(String symbol,int hours,int minutes);
}
