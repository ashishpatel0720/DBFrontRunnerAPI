package com.db.dbfrontrunner.user_orders;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface user_ordersRepository  extends CrudRepository<orders , String> {
       public List<orders> findByUserId(String id);
}
