package com.rd.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeSearchDAOImpl implements EmployeeSerchDAO {

	private JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public List<Map<String, Object>> SearchEmployeeByDesg(String cond) {
		List<Map<String, Object>> list;
		list=jt.queryForList("SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE JOB IN "+cond+" ORDER BY JOB");
		return list;
	}

}
