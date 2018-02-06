package com.rd.service;

import java.util.Map;

public interface EmpService {
	public String RegisterEmployee(int empno, String ename, String job, int salary);

	public int findCount();

	public Map<String, Object> listEmployeesByNo(int empno);
}
