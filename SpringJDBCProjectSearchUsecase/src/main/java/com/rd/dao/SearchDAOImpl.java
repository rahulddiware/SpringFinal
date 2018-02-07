package com.rd.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("searchDAO")
public class SearchDAOImpl implements SearchDAO {
	@Autowired
	private JdbcTemplate jt;

	@Override
	public List<Map<String, Object>> searchByDesg(String cond) {
		List<Map<String, Object>> list = null;
		list = jt.queryForList("SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE JOB IN " + cond + " ORDER BY JOB");
		return list;
	}// searchByDesg

}
