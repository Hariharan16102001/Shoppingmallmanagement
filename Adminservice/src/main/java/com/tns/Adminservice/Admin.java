package com.tns.Adminservice;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin {
	private Integer admin_id;
	private String admin_name;
	private Integer admin_password;
	
	
	public Admin() 
	{
		super();
	}
	
	public Admin (Integer admin_id, String admin_name,Integer admin_password)
	{
		super();
		admin_id = admin_id;
		admin_name = admin_name;
		admin_password = admin_password;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getadmin_id() {
		return admin_id;
	}
	public void setadmin_id(Integer admin_id) {
		admin_id = admin_id;
	}
	public String getadmin_name() {
		return admin_name;
	}
	public void setadmin_name(String admin_name)
	{
		admin_name = admin_name;
	}
	public Integer getadmin_password(){
		return admin_password;
	}
	public void setadmin_password(Integer admin_password){
	    admin_password = admin_password ;
	}
	@Override
	public String toString()
	{
		return "Admin[Admin id:"+admin_id+" Admin name"+admin_name+" Admin password"+admin_password;
	}

	    

}
