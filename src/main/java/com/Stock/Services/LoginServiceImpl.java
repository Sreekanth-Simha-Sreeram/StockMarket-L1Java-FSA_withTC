package com.Stock.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Stock.Dao.LoginServiceDao;
import com.Stock.Entities.User;

@Component
@Service ("loginService")

public class LoginServiceImpl implements LoginService {
	
	@Autowired
	LoginServiceDao loginServiceDao;
	@Transactional

	public void signUp(User user) {
		// TODO Auto-generated method stub

	}

	public boolean signIn(String userName, String userPassword) {
		// TODO Auto-generated method stub
		return false;
	}

	public void signOut(int userId) {
		// TODO Auto-generated method stub
		
	}

}
