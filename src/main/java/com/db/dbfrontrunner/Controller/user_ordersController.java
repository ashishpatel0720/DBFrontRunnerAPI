package com.db.dbfrontrunner.Controller;


import com.db.dbfrontrunner.Tables.Orders;
import com.db.dbfrontrunner.Repository.user_ordersRepository;
import com.db.dbfrontrunner.Tables.userid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class user_ordersController {

    @Autowired
    user_ordersRepository user_orders;

    @PostMapping("/orders")
    public List<Orders> user_orders(@RequestBody userid data){
        System.out.println(data.brokerid);
         List<Orders> orders = user_orders.findByBroker(data.brokerid);
        return orders;

    }



}
