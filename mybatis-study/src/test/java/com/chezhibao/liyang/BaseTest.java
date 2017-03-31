package com.chezhibao.liyang;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Assert;
import org.junit.Test;

public class BaseTest {

	@Test
	public void testSessionFactory() throws IOException{
		InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactoryBuilder factoryBuilder = new SqlSessionFactoryBuilder();
		SqlSessionFactory factory = factoryBuilder.build(config);
		SqlSession session = factory.openSession();
		Assert.assertNotNull(session);
	}
}
