package com.db.dbfrontrunner.ordersBuy;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface broker_trading_limitsRepository extends CrudRepository<broker_trading_limits , String> {

     @Query(value = "select REPLACE(sectorlimit, ',', '') from broker_trading_limits where empid = ?" , nativeQuery = true)
    String findByEmpid(String id );
}
