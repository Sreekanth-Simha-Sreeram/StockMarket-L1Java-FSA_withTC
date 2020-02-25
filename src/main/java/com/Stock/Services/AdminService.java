package com.Stock.Services;
import com.Stock.Entities.Company;
import com.Stock.Entities.IPODetails;

import java.util.List;
public interface AdminService
{	
	public void createCompany(String companyName);
	public Boolean deleteCompany(Integer companyId);
	public Company editCompany(String companyName,int companyId);
	public Company getCompany(String companyName,int companyId);
	public List<Company> ViewCompany(Company company);
	IPODetails updateIPODetails(int ipoId);
	
}