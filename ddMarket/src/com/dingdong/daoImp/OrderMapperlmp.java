package com.dingdong.daoImp;

import java.util.Date;
import java.util.List;

import com.dingdong.dao.OrderMapper;
import com.dingdong.pojo.Order;

public class OrderMapperlmp implements OrderMapper{

	@Override
	public boolean createOrder(Order Order) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateOrder(Order Order) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteOrder(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Order findOrderByID(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List findOrdersByUserID(String userID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List findOrdersByUserID(String userID, Date startDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List findOrdersByDate(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

}
