package com.dingdong.service;

import java.util.List;

import com.dingdong.pojo.Item;

public class ItemService {
	
	
	
	public boolean addItem(Item item){
		return false;
	}
	

	public boolean updateItem(Item item){
		return false;
	}
	
	
	public boolean deleteItem(String id){
		return false;
	}
	
	
	//花式查询
	public Item findItemByID(String id){
		return null;
	}
	
	public List findItemsByName(String name){
		return null;
	}
	
	public List findItemsByClassifyID(String classifyID){
		return null;
	}
	
	
	/**
	 * 
	 * @param name
	 * @param order 排序方法
	 * @return
	 */
	public List findItemsByName(String name,String orderMethod){
		return null;
	}
	
}
