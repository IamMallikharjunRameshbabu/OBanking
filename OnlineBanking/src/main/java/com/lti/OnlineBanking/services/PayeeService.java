package com.lti.OnlineBanking.services;

import java.util.List;

import com.lti.OnlineBanking.beans.Payee;

public interface PayeeService {
	
	public abstract List<Payee> fetchPayeeDetails( );
	public abstract Payee fetchPayeeDetailsById(int accNo);
	public abstract int addNewPayee(Payee p);
	public String updatePayee(Payee payee);
}
