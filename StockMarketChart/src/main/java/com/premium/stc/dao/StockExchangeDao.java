package com.premium.stc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.premium.stc.model.StockExchange;

public interface StockExchangeDao extends JpaRepository<StockExchange, Integer>{
	
}
