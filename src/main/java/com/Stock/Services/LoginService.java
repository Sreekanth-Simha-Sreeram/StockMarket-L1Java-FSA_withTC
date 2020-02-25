package com.Stock.Services;

import com.Stock.Entities.User;

public interface LoginService {
	
	public void signUp(User user);
	public boolean signIn(String userName, String userPassword);
	public void signOut(int userId);

}
