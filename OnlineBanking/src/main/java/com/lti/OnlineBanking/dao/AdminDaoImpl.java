package com.lti.OnlineBanking.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.OnlineBanking.beans.Admin;

@Repository
public class AdminDaoImpl implements AdminDao {
	@PersistenceContext
	private EntityManager em;

	@Override
	public Admin findAdminById(int adm_id) {
		// TODO Auto-generated method stub
		Admin a =em.find(Admin.class,adm_id);
		return a;
	}

	@Override
	public List<Admin> listAllAdmin() {
		String sql="Select a from Admin a";
		Query qry=em.createQuery(sql);
		List<Admin> empList=qry.getResultList();
		System.out.println(empList);
		return empList;
	}

	@Override
	@Transactional
	public long addNewAdmin(Admin a) {
		System.out.println("Dao layer 2 Admin");
		em.persist(a);
		return a.getAdminId();
	}


}