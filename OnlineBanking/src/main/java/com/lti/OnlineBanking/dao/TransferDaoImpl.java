package com.lti.OnlineBanking.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.OnlineBanking.beans.Account;
import com.lti.OnlineBanking.beans.Transfer;

@Repository("TransferDao")
public class TransferDaoImpl implements TransferDao {

	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public long addTransfer(Transfer a) {
		System.out.println("Dao layer 2 Admin");
		em.persist(a);
		return a.getAmount();
	}


	@Override
	public List<Transfer> fetchTransfer() {
		String sql = "SELECT e FROM Transfer e";
		Query qry=em.createQuery(sql);
		List<Transfer> TransferList=qry.getResultList();
		System.out.println("on db server"+TransferList);
		return TransferList;
	}


//	@Override
//	public Transfer fetchTransferByDate(String dateOfTrans) {
//		Transfer e=em.find(Transfer.class,dateOfTrans);
//		return e;
//	}
	
	@Override
	public Transfer fetchTransferByAcc(long fromAccount) {
		Transfer e=em.find(Transfer.class,fromAccount);
		System.out.println("HIIIIIIIIIIIIIIIIIIIIIIIII");
		System.out.println(e);
		return e;
	}

}
