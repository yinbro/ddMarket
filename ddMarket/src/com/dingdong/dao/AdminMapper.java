package com.dingdong.dao;

import java.util.Map;

import org.apache.ibatis.session.SqlSessionFactory;

import com.dingdong.pojo.Admin;
/**
 * 
 * @author yinbro
 *
 */
public interface AdminMapper {
//	   boolean deleteByAdminID(Integer userId);

//	   boolean register(User record);
//	   	管理员暂不提供注册功能
	   Admin login(Map<String ,  String> map);
	   
	   boolean update(Admin record);
}