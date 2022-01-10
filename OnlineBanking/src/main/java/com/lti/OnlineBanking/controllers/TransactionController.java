package com.lti.OnlineBanking.controllers;

import javax.transaction.Transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.OnlineBanking.services.PayeeService;
import com.lti.OnlineBanking.services.TransactionService;


@RestController
@CrossOrigin(origins="*")
@RequestMapping("/Bank")
public class TransactionController {
	//http://localhost:8090/Bank/addtransaction

	@Autowired
	TransactionService tService;

	@PostMapping("/addtransaction")
	public void addTransaction(@RequestBody Transaction transaction ) {
		tService.addNewTransaction(transaction);
	}
}
