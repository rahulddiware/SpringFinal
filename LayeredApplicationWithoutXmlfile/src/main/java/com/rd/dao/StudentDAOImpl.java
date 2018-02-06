package com.rd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rd.bo.StudentBO;

@Repository("stDAO")
public class StudentDAOImpl implements StudentDAO {
	private static final String INSERT_QUERY = "INSERT INTO SPRING_STUDENT VALUES(?,?,?,?,?)";
	@Autowired
	private DataSource ds;

	public int registerStudent(StudentBO bo) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		int count = 0;
		// use data source object to get connection
		con = ds.getConnection();
		// create the prepareStatment
		ps = con.prepareStatement(INSERT_QUERY);
		// set the query param
		ps.setInt(1, bo.getSno());
		ps.setString(2, bo.getSname());
		ps.setInt(3, bo.getTotal());
		ps.setFloat(4, bo.getAvg());
		ps.setString(5, bo.getResult());
		// execute the query
		count = ps.executeUpdate();

		return count;
	}

}
