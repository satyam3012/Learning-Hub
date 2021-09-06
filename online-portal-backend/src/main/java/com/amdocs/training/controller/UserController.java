package com.amdocs.training.controller;

import org.apache.tomcat.jakartaee.bcel.util.ClassPath;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.amdocs.training.model.User;

public class UserController {

	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("users.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		
		User user = (User) beanFactory.getBean("user");
		user.setUsername("superadmin");
		System.out.println(user);
	}

}
