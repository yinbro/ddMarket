package com.dingdong.dao;

import java.awt.List;

import com.dingdong.pojo.Comment;
import com.dingdong.pojo.Item;

public interface CommentMapper {
	public boolean addComment(Comment comment);
	

	public boolean updateComment(Comment comment);
	//花式查询
	public Item findCommentByID(String id);
	
	public List findCommentsByItemID(String itemID);
	
	public List findItemsByUserID(String userID);
}