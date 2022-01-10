package com.lti.OnlineBanking.services;

import javax.transaction.Transaction;

public interface TransactionService {
	public abstract String addNewTransaction(Transaction t);
}
