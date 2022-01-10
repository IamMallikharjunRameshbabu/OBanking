package com.lti.OnlineBanking.dao;

import java.util.List;

import com.lti.OnlineBanking.beans.Account;
import com.lti.OnlineBanking.beans.Login;

public interface LoginDao {
	public abstract long addNewLogins(Login a);
	public abstract List<Login> fetchLoginDetails(); 	
	public abstract Login fetchLoginDetailsById(long accNo);
}
