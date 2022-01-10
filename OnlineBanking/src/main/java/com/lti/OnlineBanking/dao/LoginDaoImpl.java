package com.lti.OnlineBanking.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.OnlineBanking.beans.Account;
import com.lti.OnlineBanking.beans.Login;

@Repository("LoginDao")
public class LoginDaoImpl implements LoginDao{

	
	@PersistenceContext
	private EntityManager em;

	
	@Override
	public List<Login> fetchLoginDetails() {
		String sql = "SELECT e FROM Login e";
		Query qry=em.createQuery(sql);
		List<Login> LoginList=qry.getResultList();
		System.out.println("on db server"+LoginList);
		return LoginList;
	}
	
	@Override
	public Login fetchLoginDetailsById(long id) {
		Login e=em.find(Login.class,id);
		return e;
	}

		@Override
		@Transactional
		public long addNewLogins(Login a) {
		    System.out.println("Dao layer 2 Logins");
			em.persist(a);
			return a.getUserId();
			}

}
