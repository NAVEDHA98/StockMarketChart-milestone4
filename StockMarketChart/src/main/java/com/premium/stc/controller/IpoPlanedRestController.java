package com.premium.stc.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.premium.stc.model.IpoPlaned;
import com.premium.stc.service.IpoPlanedService;

public class IpoPlanedRestController 
{
	@Autowired
    IpoPlanedService ipoPlanedService;
  
	@GetMapping("/ipoPlanedList/{companyName}")
	public List<IpoPlaned> getIpoPlanedList(@PathVariable("companyName") String companyName) throws Exception
	{
		return ipoPlanedService.getIpoPlanedList(companyName);
	}	
	
	@GetMapping("/ipo/details")
	public List<IpoPlaned> getIpoDetails() throws Exception
	{
		return ipoPlanedService.getIpoDetails();
	}
	
	@GetMapping("/ipo/insert/{id}/{companyCode}/{stockExchange}/{pricePerShare}/{totalShare}/{openDateTime}/{remarks}")
	public IpoPlaned getAddedIpoPlaned(@PathVariable("id") int id, @PathVariable("companyCode") int companyCode, @PathVariable("stockExchange") int stockExchange, @PathVariable("pricePerShare") double pricePerShare, @PathVariable("totalShare") int totalShare, @PathVariable("openDateTime") Date openDateTime, @PathVariable("remarks") String remarks) throws Exception
	{
		IpoPlaned ipoPlaned = new IpoPlaned(id, companyCode, stockExchange, pricePerShare, totalShare, openDateTime, remarks);
		return ipoPlanedService.getAddedIpoPlaned(ipoPlaned);
	}
}
