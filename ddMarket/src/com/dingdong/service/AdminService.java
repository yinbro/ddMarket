package com.dingdong.service;

import java.util.HashMap;
import java.util.Map;

import com.dingdong.dao.AdminMapper;
import com.dingdong.daoImp.AdminMapperImp;
import com.dingdong.pojo.Admin;

public class AdminService {
	
	public Admin adminLogin(String adminName ,String adminPassword){
		AdminMapperImp ami = new AdminMapperImp();
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", adminName);
		map.put("password", adminPassword);
		return ami.login(map);
	}

	

	//test
	public static void main(String[] args) {

		AdminService as = new AdminService();
		Admin admin = as.adminLogin("root", "root");
		System.out.println(admin);
	}

	
}
