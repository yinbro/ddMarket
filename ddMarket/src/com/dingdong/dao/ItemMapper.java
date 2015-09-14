package com.dingdong.dao;

import java.util.List;

import com.dingdong.pojo.Item;

public interface ItemMapper {
	public boolean addItem(Item item);
	

	public boolean updateItem(Item item);
	
	
	public boolean deleteItem(String id);
	
	
	//花式查询
	public Item findItemByID(String id);
	
	public List findItemsByName(String name);
	
	public List findItemsByClassifyID(String classifyID);
	
	
	/**
	 * 
	 * @param name
	 * @param order 排序方法
	 * @return
	 */
	public List findItemsByName(String name,String orderMethod);
}