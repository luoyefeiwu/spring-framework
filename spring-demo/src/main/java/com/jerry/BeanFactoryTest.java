package com.jerry;

import com.jerry.model.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryTest {

	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring-config.xml"));
		User user = (User) beanFactory.getBean("user");
		System.out.println(user.getName());
	}
}
