package com.lti.OnlineBanking.services;

import java.util.List;
import javax.annotation.Resource;

import com.lti.OnlineBanking.beans.Account;


@Resource
public interface AccountService {
	public abstract List<Account> fetchAccounts();
	public abstract Account fetchAccountsById(long accNo);
	public abstract long addAccount(Account c);
}
