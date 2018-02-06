package com.rd.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = { "com.rd.dao", "com.rd.service", "com.rd.controller" })
@PropertySource(value = "classpath:com/rd/commons/jdbc.properties")
public class BeanConfigurator {
	@Autowired
	private Environment env;

	@Bean(name = "drds")
	public DataSource createDataSource() {
		DriverManagerDataSource ds = null;
		ds = new DriverManagerDataSource();
		ds.setDriverClassName(env.getRequiredProperty("jdbc.driver"));
		ds.setUrl(env.getProperty("jdbc.url"));
		ds.setUsername(env.getProperty("jdbc.user"));
		ds.setPassword(env.getProperty("jdbc.pwd"));
		return ds;
	}
}
