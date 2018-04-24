package com.rd.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rd.coach.Coach;

public class MyappTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/rd/cfgs/applicationContext.xml");
		// configure the xml file

		// get the bean
		Coach coach = ctx.getBean("myCoach", Coach.class);
		System.out.println(coach.getDailyTask());
		ctx.close();
	}// main

}// class
