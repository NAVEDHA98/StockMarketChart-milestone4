package com.premium.stc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.premium.stc.dao.SectorDao;
import com.premium.stc.model.Sector;

@Service
public class SectorServiceImpl implements SectorService {
	
	@Autowired
	private SectorDao sectorDao;

	public Sector getSector(String sectorName) {
		return sectorDao.findBySectorName(sectorName);
	}

	public List<Sector> getSectorDetails() throws Exception {
		return sectorDao.findAll();
	}

	public Sector getAddedSectorDetails(Sector sector) throws Exception {
		return sectorDao.save(sector);	}
}
