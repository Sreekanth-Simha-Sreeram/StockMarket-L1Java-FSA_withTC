package com.Stock.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.Stock.Entities.User;

@Component
@Repository ("loginServiceDao")

public class LoginServiceDaoImpl implements LoginServiceDao {

	@Autowired
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
