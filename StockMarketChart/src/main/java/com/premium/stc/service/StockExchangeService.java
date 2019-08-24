package com.premium.stc.service;

import java.util.List;

import com.premium.stc.model.StockExchange;

public interface StockExchangeService {

	public List<StockExchange> getStockExchangeDetails() throws Exception;

	public StockExchange getAddedStockExchange(StockExchange stockExchange) throws Exception;
}
