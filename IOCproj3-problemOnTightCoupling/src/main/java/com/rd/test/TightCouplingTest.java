package com.rd.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.rd.beans.Flipkart;

public class TightCouplingTest {
	public static void main(String[] args) {
		BeanFactory factory = null;
		Flipkart flipkart = null;
		String billSlip = null;
		// create IOC container
		factory = new XmlBeanFactory(new FileSystemResource("src/main/java/com/rd/cfgs/applicationContext.xml"));
		// get Bean(main bean)
		flipkart = factory.getBean("flipkart", Flipkart.class);
		billSlip = flipkart.shopping(new String[] { "fruits", "dvds", "Bhang" });
		System.out.println(billSlip);
	}// main

}// Class
