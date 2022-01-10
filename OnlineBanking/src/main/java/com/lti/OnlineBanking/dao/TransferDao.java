package com.lti.OnlineBanking.dao;


import java.util.List;

import com.lti.OnlineBanking.beans.Account;
import com.lti.OnlineBanking.beans.Transfer;

public interface TransferDao {
	public abstract long addTransfer(Transfer c);
	public abstract List<Transfer> fetchTransfer(); 
//	public abstract Transfer fetchTransferByDate(String dateOfTrans);
	public abstract Transfer fetchTransferByAcc(long fromAccount);
}
