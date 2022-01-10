package com.lti.OnlineBanking.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.OnlineBanking.beans.Admin;
import com.lti.OnlineBanking.dao.AdminDao;

@Service("adminService")
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	AdminDao dao;
	
	
	public AdminDao getDao() {
		return dao;
	}

	public void setDao(AdminDao dao) {
		this.dao = dao;
	}


	@Override
	public Admin findAdminById(int adm_id) {
		Admin a=dao.findAdminById(adm_id);
		return a;
	}

	@Override
	public List<Admin> listAllAdmin() {
		List<Admin> empList=dao.listAllAdmin();// TODO Auto-generated method stub
		return empList;
	}

	@Override
	public long addNewAdmin(Admin a) {
		System.out.println("Service Layer 2 Admin");
		long aId = dao.addNewAdmin(a);
		return aId;
	}
	
}