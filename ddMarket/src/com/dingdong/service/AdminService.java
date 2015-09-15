package com.dingdong.service;

import java.util.HashMap;
import java.util.Map;

import com.dingdong.dao.AdminMapper;
import com.dingdong.daoImp.AdminMapperImp;
import com.dingdong.pojo.Admin;

public class AdminService {
	
	public Admin adminLogin(String adminName ,String adminPassword){
		AdminMapper am = new AdminMapperImp();
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", adminName);
		map.put("password", adminPassword);
		return am.login(map);
	}
	
	public boolean adminUpdate(Admin admin){
		boolean isUpdate = false;
		AdminMapper am = new AdminMapperImp();
		isUpdate = am.update(admin);
		return isUpdate;
	}
}
