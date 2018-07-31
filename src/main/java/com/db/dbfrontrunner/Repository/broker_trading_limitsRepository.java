package com.db.dbfrontrunner.Repository;

import com.db.dbfrontrunner.Tables.Broker_trading_limits;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface broker_trading_limitsRepository extends CrudRepository<Broker_trading_limits , String> {

     @Query(value = "select REPLACE(sectorlimit, ',', '') from broker_trading_limits where empid = ?" , nativeQuery = true)
     String findByEmpid(String id);
}
