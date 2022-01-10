package com.lti.OnlineBanking.services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lti.OnlineBanking.beans.Account;
import com.lti.OnlineBanking.dao.AccountDao;

@Service("AccountService")
public class AccountServiceImpl implements AccountService {

	@Autowired
	AccountDao Adao;

	@Override
	public List<Account> fetchAccounts() {
		List<Account> Acc=Adao.fetchAccounts();
		return Acc;
	}

	@Override
	public Account fetchAccountsById(long accNo) {
		Account e=Adao.fetchAccountsById(accNo);
		return e;
	}

	@Override
	public long addAccount(Account c) {
		long AccNo=Adao.addAccount(c);
		return AccNo;
	}


}
