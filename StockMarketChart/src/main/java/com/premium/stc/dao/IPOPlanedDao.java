package com.premium.stc.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.premium.stc.model.IpoPlaned;

public interface IPOPlanedDao extends JpaRepository<IpoPlaned, Integer>{
    List<IpoPlaned> findByCompanyCode(int companyCode);
}
