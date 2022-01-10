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
import com.lti.OnlineBanking.beans.Login;
import com.lti.OnlineBanking.services.LoginService;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/Bank")
public class LoginController {

	@Autowired
	LoginService LoginServiceImpl;

	// http://localhost:8090/Bank/Logins
	
	@GetMapping("/Logins")
	public List<Login> fetchLoginDetails(){
		return LoginServiceImpl.fetchLoginDetails();		
	}
	
	@GetMapping("/Logins/{id}")
	public  Login fetchLoginDetailsById(@PathVariable(value="id")long id){
		return LoginServiceImpl.fetchLoginDetailsById(id);		
	}
	
	@PostMapping("/addLogins") 
	 public void addLogins(@RequestBody Login logins ) //Add new record
		 { 
		LoginServiceImpl.addNewLogins(logins);
		 }
}
