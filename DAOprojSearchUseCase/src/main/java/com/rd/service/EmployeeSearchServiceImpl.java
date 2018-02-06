package com.rd.service;

import java.util.List;
import java.util.Map;

import com.rd.dao.EmployeeSerchDAO;

public class EmployeeSearchServiceImpl implements EmployeeSearchService {
	private EmployeeSerchDAO dao;

	public void setDao(EmployeeSerchDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<Map<String, Object>> findEmpsByDesg(String[] desg) {
		List<Map<String, Object>> list = null;
		String cond = null;
		// Convert desg[] into condition as required for the SQL Query
		cond = "(";
		for (int i = 0; i < desg.length; ++i) {
			if (i == desg.length - 1)
				cond = cond + "'" + desg[i] + "')";
			else
				cond = cond + "'" + desg[i] + "',";
		}
		// use DAO class
		list = dao.SearchEmployeeByDesg(cond);
		return list;

	}

}
