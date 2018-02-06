package com.rd.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.rd.service.EmpService;
import com.rd.service.EmpServiceImpl;

public class JdbcTemplateTest {
	public static void main(String[] args) {
		ApplicationContext ctx = null;
		EmpService service = null;
		// read the both xml files
		ctx = new FileSystemXmlApplicationContext("src/main/java/com/rd/cfgs/applicationContextx.xml");
		service = ctx.getBean("empService", EmpService.class);
		try {
			// System.out.println(service.RegisterEmployee(1245, "Raja", "clark", 12500));
			// System.out.println(service.findCount());
			System.out.println(service.listEmployeesByNo(7698));
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		// close container
		((AbstractApplicationContext) ctx).close();
	}// main

}// class
