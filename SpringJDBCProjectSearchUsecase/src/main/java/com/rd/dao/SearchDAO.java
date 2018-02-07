package com.rd.dao;

import java.util.List;
import java.util.Map;

public interface SearchDAO {
	public List<Map<String, Object>> searchByDesg(String cond);

}
