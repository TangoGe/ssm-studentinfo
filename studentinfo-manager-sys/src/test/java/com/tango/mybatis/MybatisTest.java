
package com.tango.mybatis;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.tango.dao.StudentDao;
import com.tango.entity.Student;

/**
 * @author tango
 *
 */
public class MybatisTest {
	private final String resource = "mybatis-config.xml";
	private SqlSessionFactory sessionFactory;
	private SqlSession sqlSession;

	/**
	 * 在所有测试方法执行之前执行
	 * 
	 * @throws IOException
	 */
	@Before
	public void before() throws IOException {
		InputStream inputStream = Resources.getResourceAsStream(resource);
		// 构建sessionfactory
		sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// 获取sqlsession
		sqlSession = sessionFactory.openSession();
	}

	/**
	 * 在所有测试方法执行之后执行
	 */
	@After
	public void after() {
		sqlSession.commit();
		sqlSession.close();
	}

	/**
	 * 测试插入student表一条数据
	 * 
	 * @throws IOException
	 */
	@Test
	public void testInsertOne() throws IOException {
		StudentDao mapper = sqlSession.getMapper(StudentDao.class);
		Student student = new Student();
		student.setStudentNumber("12345");
		student.setName("张三");
		student.setAge(18);
		student.setPhone("8327329");
		student.setAddress("qwewefefefwefwef");
		mapper.insertOne(student);
	}

	/**
	 * 测试查询student所有表数据
	 * 
	 * @throws IOException
	 */
	@Test
	public void testSelectAll() throws IOException {
		StudentDao mapper = sqlSession.getMapper(StudentDao.class);

		List<Student> students = mapper.selectAll();
		for (Student student : students) {
			System.out.println(student.getName());
		}

	}

	@Test
	public void testSelectById() {
		StudentDao mapper = sqlSession.getMapper(StudentDao.class);
		Student student = mapper.selectById(2);
		System.out.println(student.getName());
		System.out.println(student.getAge());
		System.out.println(student.getPhone());
		System.out.println(student.getAddress());
	}

	@Test
	public void testDeleteById() {
		StudentDao mapper = sqlSession.getMapper(StudentDao.class);
		mapper.deleteById(2);
	}

	@Test
	public void testUpdateById() {
		StudentDao mapper = sqlSession.getMapper(StudentDao.class);
		Student student = new Student();
		student.setStudentId(3);
		student.setName("dfsdfs");
		student.setStudentNumber("99999");
		student.setAddress("eeqqwqwqwqwfdsdsd");
		student.setPhone("139111111111");
		mapper.updateById(student);
	}
}
