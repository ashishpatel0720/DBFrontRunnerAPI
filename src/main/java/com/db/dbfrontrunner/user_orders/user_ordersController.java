package com.db.dbfrontrunner.user_orders;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class user_ordersController {

    @Autowired
    user_ordersRepository user_orders;

    @GetMapping("/{id}/orders")
    public List<orders> user_orders(@PathVariable String id){
         List<orders> orders = user_orders.findByBroker(id);
        return orders;

    }



}
