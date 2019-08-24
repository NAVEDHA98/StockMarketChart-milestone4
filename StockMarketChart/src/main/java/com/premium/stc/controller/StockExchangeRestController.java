package com.premium.stc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.premium.stc.model.StockExchange;
import com.premium.stc.service.StockExchangeService;

@RestController
public class StockExchangeRestController {
      @Autowired
      StockExchangeService stockExchangeService;
      
      @GetMapping("/stockExchange/display")
      public List<StockExchange> getStockExchangeDetails() throws Exception
      {
    	  return stockExchangeService.getStockExchangeDetails();
      }
      
      @GetMapping("/stockExchange/insert/{stockExchangeId}/{stockExchangeName}/{brief}/{address}/{remarks}")
      public StockExchange getAddedStockExchange(@PathVariable("stockExchangeId") int stockExchangeId, @PathVariable("stockExchangeName") String stockExchangeName, @PathVariable("brief") String brief, @PathVariable("address") String address, @PathVariable("remarks") String remarks) throws Exception
      {
    	  StockExchange stockExchange = new StockExchange(stockExchangeId, stockExchangeName, brief, address, remarks);
    	  return stockExchangeService.getAddedStockExchange(stockExchange);
      }
}
