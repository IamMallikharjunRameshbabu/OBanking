package com.lti.OnlineBanking.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transaction;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository("TransactionDao")
public class TransactionDaoImpl implements TransactionDao {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public String addNewTransaction(Transaction t) {
		// TODO Auto-generated method stub
		return null;
	}
	
//	@Override
//	@Transactional
//	public String addNewTransaction(Transaction t) {
//		System.out.println("dao 2 layer");
//		em.persist(t);
//		return t.getTxId();
//	}
}
