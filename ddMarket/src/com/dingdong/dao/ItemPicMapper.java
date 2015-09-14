package com.dingdong.dao;

import java.util.List;

import com.dingdong.pojo.ItemPic;

public interface ItemPicMapper {
	public boolean addItemPic(ItemPic itemPic);
	

	public boolean updateOrderDetail(ItemPic itemPic);
	
	//花式查询
	public List findItemPicsByItemID(String id);

}