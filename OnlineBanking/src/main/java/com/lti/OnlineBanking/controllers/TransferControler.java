package com.lti.OnlineBanking.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.OnlineBanking.beans.Account;
import com.lti.OnlineBanking.beans.Transfer;
import com.lti.OnlineBanking.services.TransferServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/Bank")
public class TransferControler {

	@Autowired
	TransferServiceImpl tservice;
	// http://localhost:8090/Bank/Transfer

	
	@GetMapping("/Transfer")
	public List<Transfer>fetchTransfer(){
		return tservice.fetchTransfer();		
	}
	
//	@GetMapping("/Transfer/{transactionDate}")
//	public  Transfer fetchTransferByDate(@PathVariable(value="transactionDate")String transactionDate){
//		return tservice.fetchTransferByDate(transactionDate);		
//	}
	
	
	@GetMapping("/Transfer/{fromAccount}")
	public  Transfer fetchTransferByAcc(@PathVariable(value="fromAccount")long fromAccount){
		return tservice.fetchTransferByAcc(fromAccount);		
	}
	
	
	@PostMapping("/addTransfer") 
	public void addTransfer(@RequestBody Transfer t ) //Add new record
	{ 
		tservice.addTransfer(t);
	}

}
