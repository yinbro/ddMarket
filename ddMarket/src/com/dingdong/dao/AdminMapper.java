package com.dingdong.dao;

import com.dingdong.pojo.Admin;
import com.dingdong.pojo.User;
/**
 * 管理员
 * @author yinyao
 *
 */
public interface AdminMapper {
	
//	   boolean deleteByAdminID(Integer userId);

//	   boolean registe(User record);
//	   	管理员暂不提供注册功能
	   int login(String adminName , String password);
	   
	   boolean update(Admin record);
}