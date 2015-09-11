package com.dingdong.dao;

import com.dingdong.pojo.User;

public interface UserMapper {
	
    boolean deleteByUserID(Integer userId);

    boolean registe(User record);

    int login(String userName , String password);
    
    boolean update(User record);
}