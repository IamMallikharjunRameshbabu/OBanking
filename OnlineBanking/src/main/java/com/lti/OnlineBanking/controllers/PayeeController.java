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

import com.lti.OnlineBanking.beans.Payee;
import com.lti.OnlineBanking.services.PayeeService;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/Bank")
public class PayeeController {
	
	@Autowired
	PayeeService PayeeServiceImpl;
	
	// http://localhost:8090/Bank/Payee
	
	@GetMapping("/Payee")
	public List<Payee> fetchPayeeDetails(){
		return PayeeServiceImpl.fetchPayeeDetails();
	}
	
	//http://localhost:8090/Bank/Payee/{id}
	
	@GetMapping("/Payee/{id}")
	public  Payee fetchPayeeDetailsById(@PathVariable(value="id")int accNo){
		return PayeeServiceImpl.fetchPayeeDetailsById(accNo);		
	}
	
	//http://localhost:8090/Bank/addPayee
	
		@PostMapping("/addPayee") 
		public void addPayee(@RequestBody Payee payee ) //Add new record
		 { 
			PayeeServiceImpl.addNewPayee(payee);
		 }
	
		//http://localhost:8090/Bank/updatePayee
		
		@PostMapping("/updatePayee")
		public void updatePayee(@RequestBody Payee payee ) {
			PayeeServiceImpl.updatePayee(payee);
		}

}