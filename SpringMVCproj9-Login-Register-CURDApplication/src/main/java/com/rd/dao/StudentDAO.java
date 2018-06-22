package com.rd.dao;

import com.rd.bo.StudentLoginBO;
import com.rd.bo.StudentRegisterBO;

public interface StudentDAO {
	public int validate(StudentLoginBO loginBO);

	public int saveStudent(StudentRegisterBO bo);
}
