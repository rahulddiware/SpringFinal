package com.rd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rd.bo.StudentBO;
import com.rd.dao.StudentDAO;
import com.rd.dto.StudentDTO;

@Component("stService")
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDAO dao;

	public String calculateResult(StudentDTO dto) throws Exception {
		int total = 0;
		float avg = 0.0f;
		String result = null;
		StudentBO bo = null;
		int count = 0;
		// calculate total
		total = dto.getM1() + dto.getM2() + dto.getM3();
		// calculate avg
		avg = total / 3.0f;
		// calculate result
		if (avg < 35)
			result = dto.getSno() + "Studnet get failed";
		else
			result = dto.getSno() + "Student Get passed";
		// prepare bo
		bo = new StudentBO();
		bo.setSno(dto.getSno());
		bo.setSname(dto.getSname());
		bo.setTotal(total);
		bo.setAvg(avg);
		// use DAO
		count = dao.registerStudent(bo);
		if (count == 0)
			return result + "---->registration failed";
		else
			return result + "---->registraion succeded";

	}

}
