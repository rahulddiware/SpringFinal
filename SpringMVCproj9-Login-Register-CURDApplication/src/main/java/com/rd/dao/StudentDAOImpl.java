package com.rd.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rd.bo.StudentLoginBO;
import com.rd.bo.StudentRegisterBO;

@Repository("stdDAO")
public class StudentDAOImpl implements StudentDAO {
	private static final String AUTH_USER = "SELECT COUNT(*) FROM STUDENT WHERE USERNAME=? AND PASSWORD=?";
	private static final String SAVE_STUDENT_DATA = "INSERT INTO STUDENT VALUES(?,?,?,?,?,?,?,?)";
	@Autowired
	private JdbcTemplate jt;

	@Override
	public int validate(StudentLoginBO loginBO) {
		int count = 0;
		count = jt.queryForObject(AUTH_USER, Integer.class, loginBO.getUserName(), loginBO.getPassword());
		return count;
	}// Validation

	@Override
	public int saveStudent(StudentRegisterBO bo) {
		int count = 0;
		count = jt.update(SAVE_STUDENT_DATA, bo.getSno(), bo.getFname(), bo.getLname(), bo.getCity(), bo.getEmail(),
				bo.getMno(), bo.getUserName(), bo.getPassword());
		return count;
	}// SaveStudent

}
