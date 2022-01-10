package com.lti.OnlineBanking.dao;

import java.util.List;

import com.lti.OnlineBanking.beans.Admin;

public interface AdminDao {

	public abstract Admin findAdminById(int adm_id );
	 public abstract List<Admin> listAllAdmin();
	 public abstract long addNewAdmin(Admin a);
	
}