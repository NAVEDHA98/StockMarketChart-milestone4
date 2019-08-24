package com.premium.stc.service;


import java.util.Date;
import java.util.List;

public interface StockPriceService {
	public List<Double> getStockPrice(int companyCode, Date fromDate, Date toDate);
}
