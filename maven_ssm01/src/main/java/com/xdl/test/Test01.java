package com.xdl.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xdl.service.AdminService;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext  app  = new ClassPathXmlApplicationContext("applicationContext.xml");
	        AdminService adminService =  app.getBean("adminService",
	        	AdminService.class);
	        System.out.println(adminService.login("abc", "123"));
		
	}

}
