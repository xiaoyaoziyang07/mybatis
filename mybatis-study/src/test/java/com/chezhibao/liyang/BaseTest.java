package com.chezhibao.liyang;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BaseTest {
	
	private SqlSessionFactory factory;
	
	private SqlSession session;

	@BeforeClass
	public void testSessionFactory() throws IOException{
		InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactoryBuilder factoryBuilder = new SqlSessionFactoryBuilder();
		factory = factoryBuilder.build(config);
	}
	
	@Before
	public void testSession(){
		SqlSession session = factory.openSession();
		Assert.assertNotNull(session);
	}
	
	@Test
	public void testMapper(){
		Object selectOne = session.selectOne("org.mybatis.example.BlogMapper.selectBlog", 101);
	}
	
	@After
	public void closeSession(){
		session.close();
	}
}
