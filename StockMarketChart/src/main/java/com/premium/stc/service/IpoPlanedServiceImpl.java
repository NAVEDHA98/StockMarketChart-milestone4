package com.premium.stc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.premium.stc.dao.CompanyDao;
import com.premium.stc.dao.IPOPlanedDao;
import com.premium.stc.model.Company;
import com.premium.stc.model.IpoPlaned;

@Service
public class IpoPlanedServiceImpl implements IpoPlanedService{
	@Autowired
	private CompanyDao companyDao;
	
	@Autowired
	private IPOPlanedDao  ipoPlanedDao;

	public List<IpoPlaned> getIpoPlanedList(String companyName) throws Exception {
		Company company = companyDao.findByCompanyName(companyName);
		return ipoPlanedDao.findByCompanyCode(company.getCompanyCode());
	}

	public List<IpoPlaned> getIpoDetails() throws Exception {
		return ipoPlanedDao.findAll();
	}

	public IpoPlaned getAddedIpoPlaned(IpoPlaned ipoPlaned) throws Exception {
		return ipoPlanedDao.save(ipoPlaned);
	}
}
