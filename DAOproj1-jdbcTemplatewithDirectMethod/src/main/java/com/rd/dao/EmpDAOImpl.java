package com.rd.dao;

import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmpDAOImpl implements EmpDAO {
	private static final String REGISTER_EMPLOYEE = "INSERT INTO EMP(EMPNO,ENAME,JOB,SAL)VALUES(?,?,?,?)";
	private static final String GET_EMP_COUNT = "SELECT COUNT(*) FROM EMP";
	private static final String GET_EMP_DETAILS_BY_NO = "SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE EMPNO=?";
	private JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}// set

	public int insert(int empno, String ename, String job, long sal) {
		int count = 0;
		count = jt.update(REGISTER_EMPLOYEE, empno, ename, job, sal);
		return count;
	}// iinsert

	public int getEmployeeCount() {
		int count = 0;
		count = jt.queryForObject(GET_EMP_COUNT, Integer.class);
		return count;

	}// getEmployeeCOunt

	public Map<String, Object> getEmployeeDetailsByEmpno(int empno) {
		Map<String, Object> map = null;
		map = jt.queryForMap(GET_EMP_DETAILS_BY_NO, empno);
		return map;
	}// getEmployeeBYId
	
}// class
