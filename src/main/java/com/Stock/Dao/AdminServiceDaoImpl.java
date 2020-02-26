package com.Stock.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.Stock.Entities.Company;
import com.Stock.Entities.IPODetails;

@Component
@Repository ("adminServiceDao")

public class AdminServiceDaoImpl implements AdminServiceDao {
	
	@Autowired

	public void createCompany(Company company) {
		// TODO Auto-generated method stub
		
	}

	public boolean deleteCompany(int companyId) {
		// TODO Auto-generated method stub
		return false;
	}

	public Company editCompany(String companyName, int companyId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Company getCompany(String companyName, int companyId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Company> viewCompany(Company company) {
		// TODO Auto-generated method stub
		return null;
	}

	public Company findCompany(int companyId) {
		// TODO Auto-generated method stub
		return null;
	}

	public IPODetails updateIPODetails(int ipoId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

	
}
