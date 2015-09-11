package com.dingdong.mybatis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.dingdong.dao.UserMapper;
import com.dingdong.pojo.User;

public class MybatisUtil {
	
	
	public SqlSession getSession() throws IOException {
		//mybatis的配置文件
	    InputStream is =  this.getClass().getClassLoader().getSystemResourceAsStream("com/dingdong/mybatis/mybatis-config.xml");
	    //使用类加载器加载mybatis的配置文件（它也加载关联的映射文件）
	    //构建sqlSession的工厂
	    
	    /*测试读取是xml是否正常
	    InputStreamReader isr = new InputStreamReader(is);
	    BufferedReader buffReader = new BufferedReader(isr);

	    StringBuffer sb = new StringBuffer();
	    while (buffReader.read() != -1) {
			sb.append(buffReader.readLine());
		}
	    
	    System.out.println("mybatis-cofig.xml:");
	    System.out.println(sb.toString());
	    */
	    
	    SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
	    
	    SqlSession session = sessionFactory.openSession();
		return session;
	}
	
	
	
	
	private static void main(String[] args) throws Exception {
		MybatisUtil ms = new MybatisUtil();
		SqlSession session = ms.getSession();
		User user = new User();
		user.setName("yinbro");
		user.setEmail("yinbro@foxmail.com");
		user.setPassword("1234");
		user.setCredit(5);
		
		UserMapper userMapper = session.getMapper(UserMapper.class);
		session.commit();
		session.close();
	}
	
	
	
}
