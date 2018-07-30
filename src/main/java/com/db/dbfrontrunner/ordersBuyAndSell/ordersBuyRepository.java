package com.db.dbfrontrunner.ordersBuyAndSell;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ordersBuyRepository extends CrudRepository<orders , String> {
    @Query(value = "select sum(value) from orders where broker = ? and security = ?" , nativeQuery = true)
    Double getSum(String id , String sec);

    List<orders> findBybrokerAndSecurity(String id , String sec);
}
