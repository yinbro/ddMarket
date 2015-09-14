package com.dingdong.dao;

import com.dingdong.pojo.User;

public interface UserMapper {
	
	public int login(String name,String psw);
	
	public boolean register(User u);
	
	public boolean update(User u);
}