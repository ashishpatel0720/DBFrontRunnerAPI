package com.db.dbfrontrunner.Controller;


import com.db.dbfrontrunner.Repository.BrokerTradingLimitsRepository;
import com.db.dbfrontrunner.Repository.ExecuteRepository;
import com.db.dbfrontrunner.Tables.Orders;
import com.db.dbfrontrunner.Tables.UserData;
import com.db.dbfrontrunner.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/users")public class ExecuteController {

    @Autowired
    ExecuteRepository execute;
    @Autowired
    BrokerTradingLimitsRepository broker_trading_limit;

	 @CrossOrigin //Todo:
    @PostMapping("/orders/execute")
    public Response executeOrders(@RequestBody UserData UserData){
        String seclimit = broker_trading_limit.findByEmpid(UserData.brokerid);
        Double result = Double.parseDouble(seclimit);
        System.out.println(seclimit);
        double value = execute.getSum(UserData.brokerid , UserData.security);
        Double remaining_amount= result - value;

        if(remaining_amount - UserData.amount >= 0){

            Orders new_order=new Orders(UserData.clientname , UserData.security , "19-Jul",null, UserData.quantity,"LIMIT", UserData.amount/ UserData.quantity , UserData.direction , UserData.amount, UserData.brokerid , UserData.isinno);

            execute.save(new_order);

            return new Response(1,"executed","You have successfully Order execution",remaining_amount- UserData.amount);
        }

        else{
            return new Response(0,"not executed","You have exceded the limit",remaining_amount);
        }
    }

}
