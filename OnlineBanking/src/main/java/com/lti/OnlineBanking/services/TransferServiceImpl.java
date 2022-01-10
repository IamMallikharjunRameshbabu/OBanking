package com.lti.OnlineBanking.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.lti.OnlineBanking.beans.Transfer;
import com.lti.OnlineBanking.dao.TransferDao;

@Service("TransferService")
public class TransferServiceImpl implements TransferService {

	@Autowired
	TransferDao tdao;
	
	@Transactional
	@Override
	public long addTransfer(Transfer c) {
		System.out.println("Service Layer 2 Payee");
		long Amount = tdao.addTransfer(c);
		return Amount;
		
	}

	@Override
	public List<Transfer> fetchTransfer() {
		List<Transfer> transfer=tdao.fetchTransfer();
		return transfer;
	}

//	@Override
//	public Transfer fetchTransferByDate(String dateOfTrans) {
//		Transfer e=tdao.fetchTransferByDate(dateOfTrans);
//		return e;
//	}
	
	@Override
	public Transfer fetchTransferByAcc(long fromAccount) {
		Transfer e=tdao.fetchTransferByAcc(fromAccount);
		return e;
	}


}
