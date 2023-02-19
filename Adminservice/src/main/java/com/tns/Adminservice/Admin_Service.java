package com.tns.Adminservice;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional

public class Admin_Service {
	@Autowired
	private Admin_Service_Repository repo;
	
	public List<Admin> listAll()
	{
		return repo.findAll();
	}
	
	public void save(Admin admin)
	{
		repo.save(admin);
	}
	
	public Admin get(Integer admin_id)
	{
		return repo.findById(admin_id).get();
	}
	public void delete(Integer admin_id)
	{
		repo.deleteById(admin_id);
	}
	

}
