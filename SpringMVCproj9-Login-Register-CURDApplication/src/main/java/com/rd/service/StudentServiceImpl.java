package com.rd.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rd.bo.StudentLoginBO;
import com.rd.bo.StudentRegisterBO;
import com.rd.dao.StudentDAO;
import com.rd.dto.StudentLoginDTO;
import com.rd.dto.StudentRegisterDTO;

@Service("stdService")
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDAO dao;

	@Override
	public String AuthenticateUser(StudentLoginDTO dto) {
		String result = null;
		int count = 0;
		StudentLoginBO loginBO = null;
		loginBO = new StudentLoginBO();
		BeanUtils.copyProperties(dto, loginBO);
		count = dao.validate(loginBO);
		if (count == 0)
			result = "Student Login Failed ";
		else
			result = "Student Login Successful";
		return result;
	}

	@Override
	public String registerStudent(StudentRegisterDTO dto) {
		String result = null;
		int count = 0;
		StudentRegisterBO registerBO = null;
		registerBO = new StudentRegisterBO();
		BeanUtils.copyProperties(dto, registerBO);
		count = dao.saveStudent(registerBO);
		if (count == 0)
			result = "Student Registration Failed";
		else
			result = "Student Registration Sucessfull";
		return result;
	}

}
