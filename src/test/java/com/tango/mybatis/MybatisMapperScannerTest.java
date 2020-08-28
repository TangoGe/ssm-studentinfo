//package com.tango.mybatis;
//
//import java.util.List;
//
//import org.junit.Test;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//import com.tango.dao.StudentDao;
//import com.tango.entity.Student;
//
///**
// * mapper 接口扫描配置方式，Mybatis方法测试类
// * @author tango
// *
// */
//public class MybatisMapperScannerTest {
//	@Test
//	public void test() {
//		//1.加载spring上下文
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
//		
//		//2.从上下文容器中获取mapper对象
//		StudentDao studentDao =  (StudentDao)applicationContext.getBean("studentDao");
//		
//		//3.调用方法
//		List<Student> students = studentDao.selectAll();
//		for (Student student : students) {
//			System.out.println(student.getName());
//		}
//	}
//}
