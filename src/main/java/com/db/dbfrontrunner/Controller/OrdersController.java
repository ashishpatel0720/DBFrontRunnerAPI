package com.db.dbfrontrunner.Controller;


import com.db.dbfrontrunner.Tables.Orders;
import com.db.dbfrontrunner.Repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrdersController {

    @Autowired
    OrdersRepository ordersrepository;


    @RequestMapping(value = "/orders" , method = RequestMethod.GET)
    public List<Orders> Order_List (){

        List<Orders> Orders = (List<Orders>) ordersrepository.findAll();
        System.out.println(Orders);
        return Orders;

    }
}
