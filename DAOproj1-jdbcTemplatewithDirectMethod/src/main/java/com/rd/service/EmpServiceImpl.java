package com.rd.service;

import java.util.Map;

import com.rd.dao.EmpDAO;

public class EmpServiceImpl implements EmpService {
	private EmpDAO dao;

	public void setDao(EmpDAO dao) {
		this.dao = dao;
	}

	public String RegisterEmployee(int empno, String ename, String job, int sal) {
		int count = 0;
		count = dao.insert(empno, ename, job, sal);
		if (count == 0)
			return "registeration failed" + empno;
		else
			return "registeration successfull" + empno;

	}// register student

	public int findCount() {
		int count = 0;
		count = dao.getEmployeeCount();
		return count;
	}

	public Map<String, Object> listEmployeesByNo(int empno) {
		Map<String, Object> map = null;
		map = dao.getEmployeeDetailsByEmpno(empno);
		return map;
	}

}// class
