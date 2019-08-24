package com.premium.stc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.premium.stc.model.Company;
import com.premium.stc.service.CompanyService;

@RestController
public class CompanyRestController 
{
	@Autowired
    CompanyService companyService;
	
	@GetMapping("/companyList/{name}")
    public List<Company> getCompanyList(@PathVariable("name") String stockName) throws Exception
    {
		  return companyService.getCompanyListSector(stockName);
    }
	
	@GetMapping("/matchingCompanyList/{name}")
	public List<Company> getMatchingCompanyList(@PathVariable("name") String name) throws Exception
	{
		return companyService.getMatchingCompanies(name);
	}
}
