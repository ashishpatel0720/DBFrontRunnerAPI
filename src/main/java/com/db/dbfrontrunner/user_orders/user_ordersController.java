package com.db.dbfrontrunner.user_orders;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class user_ordersController {

    @Autowired
    user_ordersRepository user_orders;

    @PostMapping("/orders")
    public List<orders> user_orders(@RequestBody userid data){
        System.out.println(data.brokerid);
         List<orders> orders = user_orders.findByBroker(data.brokerid);
        return orders;

    }



}
