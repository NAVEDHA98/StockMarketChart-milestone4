package com.premium.stc.service;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.premium.stc.dao.StockPriceDao;

@Service
public class StockPriceServiceImpl implements StockPriceService
{
    @Autowired
    StockPriceDao stockPriceDao;
    
	@Override
	public List<Double> getStockPrice(int companyCode, Date fromDate, Date toDate) {
		return stockPriceDao.getStockPrice(companyCode, fromDate, toDate);
	}
}
