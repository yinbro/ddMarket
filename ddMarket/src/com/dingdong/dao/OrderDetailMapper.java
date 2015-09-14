package com.dingdong.dao;

import java.util.Date;
import java.util.List;

import com.dingdong.pojo.OrderDetail;

public interface OrderDetailMapper {
	public boolean createOrderDetail(OrderDetail OrderDetail);
	

	public boolean updateOrderDetail(OrderDetail OrderDetail);
	
	
	//花式查询
	public OrderDetail findOrderDetailByID(String id);

	public List findOrderDetailsByOrderID(String orderID);
	

	public int findSalesByItemID(String itemID,Date startDate);
}