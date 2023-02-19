package com.tns.Adminservice;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Admin_Service_Controller {
	
	@Autowired(required=true)
	private Admin_Service service;
	
	@GetMapping("/adminservice")
	public java.util.List<Admin> list()
	{
		return service.listAll();
	}
	
	@GetMapping("/adminservice/{admin_id}")
	public ResponseEntity<Admin> get(@PathVariable Integer admin_id)
	{
		try
		{
			Admin admn  =service.get(admin_id);
			return new ResponseEntity<Admin>(admn,HttpStatus.OK);
		}
		catch(NoResultException e)
		{
			return new ResponseEntity<Admin>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/adminservice")
	public void add(@RequestBody Admin admn)
	{
		service.save(admn);
	}
	
	@PutMapping("/adminservice/{admin_id}")
	public ResponseEntity<?> update(@RequestBody Admin admn, @PathVariable Integer admin_id)
	{
		Admin existstud=service.get(admin_id);
		service.save(existstud);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping("/adminservice/{admin_id}")
	public void delete(@PathVariable Integer admin_id)
	{
		service.delete(admin_id);
	}
	
	
}
