package com.lti.OnlineBanking.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.OnlineBanking.beans.Payee;

@Repository("PayeeDao")
public class PayeeDaoImpl implements PayeeDao{

	
	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public List<Payee> fetchPayeeDetails() {
		String sql = "SELECT e FROM Payee e";
		Query qry=em.createQuery(sql);
		List<Payee> PayeeList=qry.getResultList();
		System.out.println("on db server"+PayeeList);
		return PayeeList;
	}

	@Override
	public Payee fetchPayeeDetailsById(int accNo) {
		Payee e=em.find(Payee.class,accNo);
		return e;
	}

	@Override
	@Transactional
	public int addNewPayee(Payee p) {
		System.out.println("Dao layer 2 Admin");
		em.persist(p);
		return p.getPayid();
	}
	
	@Override
	@Transactional
	public String updatePayee(Payee payee) {
		em.merge(payee);
		return"Record Updated";
	}

}

