package com.dingdong.daoImp;

import java.awt.List;

import com.dingdong.dao.CommentMapper;
import com.dingdong.pojo.Comment;
import com.dingdong.pojo.Item;

public class CommentMapperlmp implements CommentMapper{

	@Override
	public boolean addComment(Comment comment) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateComment(Comment comment) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Item findCommentByID(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List findCommentsByItemID(String itemID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List findItemsByUserID(String userID) {
		// TODO Auto-generated method stub
		return null;
	}

}
