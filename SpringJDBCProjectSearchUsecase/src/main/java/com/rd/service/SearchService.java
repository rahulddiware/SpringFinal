package com.rd.service;

import java.util.List;
import java.util.Map;

public interface SearchService {
	public List<Map<String, Object>> findEmpsByDesg(String desg[]);

}
