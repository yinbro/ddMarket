package com.dingdong;

import com.dingdong.dao.UserMapper;
import com.dingdong.imp.UserImp;
import com.dingdong.pojo.User;

public class test {
	public static void main(String[] args) {
		User u = new User();
		u.setName("MrWang");
		u.setPassword("134");
		
		UserMapper um  = new UserImp();
		int status = um.insert(u);
		System.out.println(status);
	}
}
