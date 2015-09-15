package com.dingdong.daoImp;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.dingdong.dao.ClassifyMapper;
import com.dingdong.mybatis.MybatisUtil;
import com.dingdong.pojo.Classify;

public class ClassifyMapperlmp implements ClassifyMapper{
	
	private SqlSessionFactory sqlSessionFactory =  MybatisUtil.getSessionFactory();
	
	@Override
	public boolean addClassify(Classify classsify) {
		boolean isAdded = false;
		SqlSession session =  sqlSessionFactory.openSession();
		ClassifyMapper classifyMapper = session.getMapper(ClassifyMapper.class);
		isAdded =  classifyMapper.addClassify(classsify);
		session.commit();
		session.close();
		return isAdded;
	}

	@Override
	public Classify findClassifyByID(int id) {
		Classify classsify = null;
		SqlSession session =  sqlSessionFactory.openSession();
		ClassifyMapper classifyMapper = session.getMapper(ClassifyMapper.class);
		classifyMapper.findClassifyByID(id);
		session.commit();
		session.close();
		return classsify;
	}
}
