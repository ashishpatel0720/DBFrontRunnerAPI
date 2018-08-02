package com.db.dbfrontrunner.orders;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ordersController{

    @Autowired
    ordersRepository ordersrepository;

    @RequestMapping(value = "/orders" , method = RequestMethod.GET)
    public List<orders> Order_List (){

        List<orders> Orders = (List<orders>) ordersrepository.findAll();
        System.out.println(Orders);
        return Orders;

    }
}

//This is a controller