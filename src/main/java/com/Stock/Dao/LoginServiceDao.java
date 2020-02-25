package com.Stock.Dao;

import com.Stock.Entities.User;

public interface LoginServiceDao {
	
	public void signUp(User user);
	public boolean signIn(String userName, String userPassword);
	public void signOut(int userId);

}
