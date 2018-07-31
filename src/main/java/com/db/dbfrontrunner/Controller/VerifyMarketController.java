package com.db.dbfrontrunner.Controller;

import com.db.dbfrontrunner.response.Response;
import com.db.dbfrontrunner.Tables.VerifyMarket;
import com.db.dbfrontrunner.Repository.VerifyMarketImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController    // This means that this class is a Controller
@RequestMapping(path="/verify") // This means URL's start wit
public class VerifyMarketController {
    @Autowired
    VerifyMarketImpl verifyMarketImpl;

    @PostMapping("/variance")
    public Response verify_price(@RequestBody VerifyMarket market)
    {


        String symbol = market.getName_of_stock();
        float broker_price = market.getBroker_price();
        float current_price;

        try {

            current_price  = verifyMarketImpl.findBySymbolandHoursandMinutes(symbol, 9, 15);

        }

        catch (Exception e)
        {
            Response response=new Response(3,"Compliance Verification","Query Error",null);
            return response;
        }

        if (verifyvariance(broker_price,current_price))
        {
            Response response=new Response(1,"Compliance Verification","Compliance Verified Set Price is within limits",null);
//            response.setCode(1);
//            response.setDescription("Compliance Verified");
            return response;

        }
        String poss_range = new String(0.98*current_price+":"+1.02*current_price);
        Response response=new Response(2,"Compliance Verification","Price is non-compliance it should be within 2% limit of market price",poss_range);



        return response;


    }

    boolean verifyvariance(float broker_price,float current_price)
    {
        if (broker_price < 1.02*current_price && broker_price > 0.98*current_price)
        {
            return true;

        }

        return false;
    }


}
