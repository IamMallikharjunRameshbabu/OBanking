package com.lti.OnlineBanking.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lti.OnlineBanking.beans.Account;
import com.lti.OnlineBanking.beans.Admin;



public interface AdminService {
	public abstract long addNewAdmin(Admin a);
	public abstract Admin findAdminById(int adm_id );
	public abstract List<Admin> listAllAdmin();
}
