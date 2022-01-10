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
import com.lti.OnlineBanking.services.AccountServiceImpl;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/Bank")
public class AccountController {


	@Autowired
	AccountServiceImpl AccountService;

	// http://localhost:8090/Bank/Accounts
	@GetMapping("/Accounts")
	public List<Account> fetchAccounts(){
		return AccountService.fetchAccounts();		
	}
	
	@GetMapping("/Accounts/{id}")
	public  Account fetchAccountsById(@PathVariable(value="id")long id){
		return AccountService.fetchAccountsById(id);		
	}

	//http://localhost:8090/cust/addnewaccount
	@PostMapping("/addnewAccounts") 
	public void addAccount(@RequestBody Account c) 
	{ 
		AccountService.addAccount(c);
	}


}

