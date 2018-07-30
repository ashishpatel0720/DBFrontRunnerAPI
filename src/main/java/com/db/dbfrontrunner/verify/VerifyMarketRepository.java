package com.db.dbfrontrunner.verify;

import com.db.dbfrontrunner.user_orders.orders;
import java.util.List;


import org.springframework.data.repository.CrudRepository;

public interface VerifyMarketRepository extends CrudRepository<Stock,String> {
    List<Stock> findBySymbol(String symbol);
//    List<Stock> findBySymbolandHoursandMinutes(String symbol,int hours,int minutes);


}
