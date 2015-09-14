package com.dingdong.service;

import java.util.Date;
import java.util.List;

import com.dingdong.pojo.Order;

public class OrderService {

	
	public boolean createOrder(Order Order){
		return false;
	}
	

	public boolean updateOrder(Order Order){
		return false;
	}
	
	
	public boolean deleteOrder(String id){
		return false;
	}
	
	
	//花式查询
	public Order findOrderByID(String id){
		return null;
	}
	
	public List findOrdersByUserID(String userID){
		return null;
	}
	
	/**
	 * 
	 * @param userID
	 * @param startDate 查看startDate 到今日，该用户的所有订单
	 * @return
	 */
	public List findOrdersByUserID(String userID,Date startDate){
		return null;
	}
	
	//管理员用
	public List findOrdersByDate(Date date){
		return null;
	}
	
	
	
	

}
