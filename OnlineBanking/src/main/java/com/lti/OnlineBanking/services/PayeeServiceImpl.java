package com.lti.OnlineBanking.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lti.OnlineBanking.beans.Payee;
import com.lti.OnlineBanking.dao.PayeeDao;
@Service("PayeeService")
public class PayeeServiceImpl implements PayeeService {
	
	@Autowired
	PayeeDao Adao;

	@Override
	public List<Payee> fetchPayeeDetails() {
		
		List<Payee> Pay=Adao.fetchPayeeDetails();
		return Pay;
		
	}

	@Override
	public Payee fetchPayeeDetailsById(int accNo) {
		

		Payee e=Adao.fetchPayeeDetailsById(accNo);
		return e;
	
	}

	@Override
	public int addNewPayee(Payee p) {
		System.out.println("Service Layer 2 Payee");
		int payid = Adao.addNewPayee(p);
		
		return payid;
	
	}
	
	@Override
	public String updatePayee(Payee payee) {
		String msg=Adao.updatePayee(payee);
		return msg;
	}

}

