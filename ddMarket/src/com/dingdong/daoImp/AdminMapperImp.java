package com.dingdong.daoImp;

import java.util.HashMap;
import java.util.Map;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import com.dingdong.dao.AdminMapper;
import com.dingdong.mybatis.MybatisUtil;
import com.dingdong.pojo.Admin;

public class AdminMapperImp implements AdminMapper {
	
	private SqlSessionFactory sqlSessionFactory =  MybatisUtil.getSessionFactory();
	
	@Override
	public Admin login(Map<String, String> map) {
		SqlSession session =  sqlSessionFactory.openSession();
		AdminMapper adminMapper = session.getMapper(AdminMapper.class);
		Admin admin = adminMapper.login(map);
		session.commit();
		session.close();
		return admin;
	}

	@Override
	public boolean update(Admin record) {
		boolean isUpdate = false;
		SqlSession session =  sqlSessionFactory.openSession();
		AdminMapper adminMapper = session.getMapper(AdminMapper.class);
		isUpdate = adminMapper.update(record);
		session.commit();
		session.close();
		return isUpdate;
	}


}
