package com.dingdong.service;

import com.dingdong.dao.UserMapper;
import com.dingdong.pojo.User;

public class UserService implements UserMapper{

	@Override
	public boolean deleteByUserID(Integer userId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean registe(User record) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
     * 
     * @param userName
     * @param password
     * @return int
     */
	@Override
	public int login(String userName, String password) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean update(User record) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
