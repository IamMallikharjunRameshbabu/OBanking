package com.lti.OnlineBanking.dao;

import java.util.List;
import com.lti.OnlineBanking.beans.Account;

public interface AccountDao {
	public abstract List<Account> fetchAccounts(); 	
	public abstract Account fetchAccountsById(long accNo);
	public abstract long addAccount(Account c);
}

