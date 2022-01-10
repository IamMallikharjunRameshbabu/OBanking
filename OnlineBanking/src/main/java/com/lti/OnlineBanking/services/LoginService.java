package com.lti.OnlineBanking.services;

import java.util.List;

import javax.annotation.Resource;


import com.lti.OnlineBanking.beans.Login;

@Resource
public interface LoginService {
	public abstract List<Login> fetchLoginDetails(); 	
	public abstract Login fetchLoginDetailsById(long accNo);
	public abstract long addNewLogins(Login a);
}
