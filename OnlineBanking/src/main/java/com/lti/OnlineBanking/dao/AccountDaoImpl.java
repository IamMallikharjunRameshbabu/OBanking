package com.lti.OnlineBanking.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;


import com.lti.OnlineBanking.beans.Account;

@Repository("AccountDao")
public class AccountDaoImpl implements AccountDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Account> fetchAccounts() {
		String sql = "SELECT e FROM Account e";
		Query qry=em.createQuery(sql);
		List<Account> AccList=qry.getResultList();
		System.out.println("on db server"+AccList);
		return AccList;
	}

	@Override
	public Account fetchAccountsById(long accNo) {
		Account e=em.find(Account.class,accNo);
		return e;
	}

	
//	@Transactional
//	@Override
//	public long addAccount(Account c) {
//		System.out.println("dao layer");
//		em.persist(c);
//		return c.getAccNo();
//	}
	
	@Override
	@Transactional
	public long addAccount(Account a) {
		System.out.println("Dao layer 2 Admin");
		em.persist(a);
		return a.getUserId();
	
	}


}