package com.premium.stc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.premium.stc.model.Sector;

public interface SectorDao extends JpaRepository<Sector, Integer>
{
	Sector findBySectorName(String sectorName);
}
