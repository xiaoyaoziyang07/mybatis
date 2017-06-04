package com.chezhibao.liyang;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import com.chezhibao.liyang.dao.UserDao;
import com.chezhibao.liyang.model.User;

public class BaseTest {
	
	private static SqlSessionFactory factory;
	
	private static SqlSession session;

	@BeforeClass
	public static void testSessionFactory() throws IOException{
		InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactoryBuilder factoryBuilder = new SqlSessionFactoryBuilder();
		factory = factoryBuilder.build(config);
		session = factory.openSession();
	}
	
	@Test
	public void testMapper(){
		UserDao userDao = session.getMapper(UserDao.class);
		User user = userDao.getUser(2L);
		System.out.println(user);
	}
	
}
