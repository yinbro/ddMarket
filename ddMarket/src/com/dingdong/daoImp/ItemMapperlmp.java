package com.dingdong.daoImp;

import java.util.List;

import com.dingdong.dao.ItemMapper;
import com.dingdong.pojo.Item;

public class ItemMapperlmp implements ItemMapper{

	@Override
	public boolean addItem(Item item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateItem(Item item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteItem(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Item findItemByID(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List findItemsByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List findItemsByClassifyID(String classifyID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List findItemsByName(String name, String orderMethod) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
