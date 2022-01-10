package com.lti.OnlineBanking.dao;

import javax.transaction.Transaction;

public interface TransactionDao {
	public abstract String addNewTransaction(Transaction t);
}
