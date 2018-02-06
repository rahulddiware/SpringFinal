package com.rd.dao;

import java.util.List;
import java.util.Map;

public interface EmployeeSerchDAO {
	public List<Map<String, Object>> SearchEmployeeByDesg(String cond);

}
