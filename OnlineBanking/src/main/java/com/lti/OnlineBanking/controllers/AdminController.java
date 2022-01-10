package com.lti.OnlineBanking.controllers;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lti.OnlineBanking.beans.Admin;
import com.lti.OnlineBanking.services.AdminServiceImpl;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/Bank")
public class AdminController {
	@Autowired
	AdminServiceImpl AdminService;
	
	//http://localhost:8090/Bank/admin
	
	@GetMapping("/admin")
	public List<Admin> listAllAdmin()
	{
		return AdminService.listAllAdmin();
		
	}
	
	//http://localhost:8090/adm/admin/{id}
	
	@GetMapping("admin/{id}")
	public Admin findAdminById(@PathVariable(value="id") int adminId)
	{
	return AdminService.findAdminById(adminId);
	}
	
	//http://localhost:8090/adm/addadmin
	@Transactional
	@PostMapping("/addadmin") 
	public void addAdmin(@RequestBody Admin admin ) //Add new record
	 { 
		AdminService.addNewAdmin(admin);
	 }
	
}
