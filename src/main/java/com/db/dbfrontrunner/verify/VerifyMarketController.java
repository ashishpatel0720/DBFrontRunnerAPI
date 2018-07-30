package com.db.dbfrontrunner.verify;

import antlr.collections.List;
import com.db.dbfrontrunner.response.Response;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController    // This means that this class is a Controller
@RequestMapping(path="/verify") // This means URL's start wit
public class VerifyMarketController {
    @Autowired
    VerifyMarketRepository verifyMarketRepository;

    @PostMapping("/variance")
    public List<Stock> verify_price(@RequestBody VerifyMarket market)
    {


        String symbol = market.getName_of_stock();
        double broker_price = market.getBroker_price();
        List<Stock> stockList = verifyMarketRepository.findBySymbol(symbol);
//        List<Stock> stockList = verifyMarketRepository.findBySymbolandHoursandMinutes(symbol,9,15);
        float current_price = findcurrentprice(stockList,9,15);

        return stockList;


    }

    public float findcurrentprice(List<Stock> stockList,int hours,int minutes)
    {
            return 0;
    }




}
