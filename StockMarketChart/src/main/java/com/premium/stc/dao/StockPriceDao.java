package com.premium.stc.dao;
 
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.premium.stc.model.StockPrice;

public interface StockPriceDao extends JpaRepository<StockPrice, Integer>{
	
 @Query("Select s.currentPrice from StockPrice s where s.companyId= :companyCode and s.date between :fromDate and :toDate ")
  public List<Double> getStockPrice(@Param("companyCode") int companyCode,@Param("fromDate") Date fromDate,@Param("toDate") Date toDate); 
	  
}
