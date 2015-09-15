package com.dingdong.daoImp;

import java.awt.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.dingdong.dao.CommentMapper;
import com.dingdong.mybatis.MybatisUtil;
import com.dingdong.pojo.Comment;
import com.dingdong.pojo.Item;

public class CommentMapperlmp implements CommentMapper{
	private SqlSessionFactory sqlSessionFactory =  MybatisUtil.getSessionFactory();
	@Override
	public boolean addComment(Comment comment) {
		boolean isAdded = false;
		SqlSession session = sqlSessionFactory.openSession();
		CommentMapper commentMapper= session.getMapper(CommentMapper.class);
		isAdded = commentMapper.addComment(comment);
		session.commit();
		session.close();
		return isAdded;
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
