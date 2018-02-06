package com.rd.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.rd.config.BeanConfigurator;
import com.rd.controller.StudentController;

public class ClientApp {

	public static void main(String[] args) {
		ApplicationContext ctx = null;
		String result = null;
		StudentController controller = null;
		// create IOC Container
		ctx = new AnnotationConfigApplicationContext(BeanConfigurator.class);
		// get Bean
		controller = ctx.getBean("stController", StudentController.class);
		try {
			result = controller.processStudentInfo("1657", "bahubali3", "56.45", "45.44", "36.66");
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("Internal Problem:::" + e.getMessage());
		}

	}// main

}// class
