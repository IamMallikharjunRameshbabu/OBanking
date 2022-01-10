package com.lti.OnlineBanking.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.OnlineBanking.beans.Login;
import com.lti.OnlineBanking.dao.LoginDaoImpl;

@Service("LoginService")
public class LoginServiceImpl implements LoginService{

	@Autowired
	LoginDaoImpl Ldao;

	@Override
	public List<Login> fetchLoginDetails() {
		List<Login> Log=Ldao.fetchLoginDetails();
		return Log;
	}

	@Override
	public Login fetchLoginDetailsById(long accNo) {
		Login e=Ldao.fetchLoginDetailsById(accNo);
		return e;
	}

	@Override
	public long addNewLogins(Login a) {
		System.out.println("Service Layer 2 Logins");
		long userId=Ldao.addNewLogins(a);
		return userId;
		
	}

}
