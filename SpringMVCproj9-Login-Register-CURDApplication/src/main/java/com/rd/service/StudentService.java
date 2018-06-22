package com.rd.service;

import com.rd.dto.StudentLoginDTO;
import com.rd.dto.StudentRegisterDTO;

public interface StudentService {
	public String AuthenticateUser(StudentLoginDTO dto);

	public String registerStudent(StudentRegisterDTO dto);
}
