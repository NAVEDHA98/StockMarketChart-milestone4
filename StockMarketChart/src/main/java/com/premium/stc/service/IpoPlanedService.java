package com.premium.stc.service;

import java.util.List;

import com.premium.stc.model.IpoPlaned;

public interface IpoPlanedService {
      public List<IpoPlaned> getIpoPlanedList(String companyName) throws Exception;
      
      public List<IpoPlaned> getIpoDetails() throws Exception;
      
      public IpoPlaned getAddedIpoPlaned(IpoPlaned ipoPlaned) throws Exception;
}
