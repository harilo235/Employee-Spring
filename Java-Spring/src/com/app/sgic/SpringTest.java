package com.app.sgic;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class SpringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		Spring spring = (Spring) context.getBean("Springbean");
		spring.printSome();
		
		Resource resource = new ClassPathResource("SpringConfigFactory.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Student stu = (Student)factory.getBean("Studentbean");
		stu.displayInfo();
		
		

	}

}
