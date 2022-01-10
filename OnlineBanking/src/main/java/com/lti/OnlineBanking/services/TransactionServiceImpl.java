package com.lti.OnlineBanking.services;

import javax.transaction.Transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.lti.OnlineBanking.dao.TransactionDao;

@Service("TransactionService")
public class TransactionServiceImpl implements TransactionService{
 
	@Autowired
	TransactionDao Tdao;

	@Override
	public String addNewTransaction(Transaction t) {

		System.out.println("service layer");
		String txId=Tdao.addNewTransaction(t);
		return txId;
	}
}
