package com.db.dbfrontrunner.ordersExecuteBuyAndSell;


import com.db.dbfrontrunner.ordersBuyAndSell.broker_trading_limitsRepository;
import com.db.dbfrontrunner.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/users")public class executeController {

    @Autowired
    executeRepository execute;
    @Autowired
    broker_trading_limitsRepository broker_trading_limit;
    @PostMapping("/orders/execute")
    public Response executeOrders(@RequestBody userdata userdata){
        String seclimit = broker_trading_limit.findByEmpid(userdata.brokerid);
        Double result = Double.parseDouble(seclimit);
        System.out.println(seclimit);
        double value = execute.getSum(userdata.brokerid , userdata.security);
        Double remaining_amount= result - value;

        if(remaining_amount - userdata.amount >= 0){

            orders new_order=new orders(userdata.clientname , userdata.security , "19-Jul",userdata.quantity,"LIMIT",userdata.amount/userdata.quantity , userdata.direction , userdata.amount,userdata.brokerid , userdata.isinno);

            execute.save(new_order);
           return new Response(1,"executed","You have successfully Order execution",remaining_amount-userdata.amount);
        }

        else{
            return new Response(0,"not executed","You have exceded the limit",remaining_amount);
        }
    }

}
