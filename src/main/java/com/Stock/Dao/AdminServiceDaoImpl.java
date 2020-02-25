package com.Stock.Dao;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.Stock.Entities.Company;
import com.Stock.Entities.IPODetails;

@Component
@Repository ("adminServiceDao")

public class AdminServiceDaoImpl implements AdminServiceDao {

	public void createCompany(String companyName) {
		// TODO Auto-generated method stub

	}

	public Boolean deleteCompany(Integer companyId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Company editCompany(String companyName, int companyId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Company getCompany(String companyName, int companyId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Company> ViewCompany(Company company) {
		// TODO Auto-generated method stub
		return null;
	}

	public IPODetails updateIPODetails(int ipoId) {
		// TODO Auto-generated method stub
		return null;
	}

}
