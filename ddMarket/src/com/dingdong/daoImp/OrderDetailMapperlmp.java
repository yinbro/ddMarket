package com.dingdong.daoImp;

import java.util.Date;
import java.util.List;

import com.dingdong.dao.OrderDetailMapper;
import com.dingdong.pojo.OrderDetail;

public class OrderDetailMapperlmp implements OrderDetailMapper{

	@Override
	public boolean createOrderDetail(OrderDetail OrderDetail) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateOrderDetail(OrderDetail OrderDetail) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public OrderDetail findOrderDetailByID(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List findOrderDetailsByOrderID(String orderID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int findSalesByItemID(String itemID, Date startDate) {
		// TODO Auto-generated method stub
		return 0;
	}

}
