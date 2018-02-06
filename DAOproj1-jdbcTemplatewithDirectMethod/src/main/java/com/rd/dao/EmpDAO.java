package com.rd.dao;

import java.util.Map;

public interface EmpDAO {
	public int insert(int empno, String ename, String job, long sal);

	public int getEmployeeCount();

	public Map<String, Object> getEmployeeDetailsByEmpno(int empno);

}
