/**
 * 
 */
package com.tango.test.mybatis;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

/**
 * @author tango
 *
 */
public class MybatisDmo {
	@Test
	public void testMybatisFirst() throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		
		//构建sessionfactory
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		//获取sqlsession
		SqlSession sqlSession = sessionFactory.openSession();
		
	}
}
