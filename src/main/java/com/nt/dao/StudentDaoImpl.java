package com.nt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.nt.bo.StudentBo;

public class StudentDaoImpl implements StudentDao{
	
	private String INSERT_VALUES="INSERT INTO STUDENTINSERT(SNO,SNAME,ADDR,SRANK) VALUES(?,?,?,?)";
	
	private JdbcTemplate jt;

	public StudentDaoImpl(JdbcTemplate jt) {
		
		this.jt = jt;
	}

	@Override
	public int insert(StudentBo bo) {
		
		int count=jt.update(INSERT_VALUES,bo.getSno(),bo.getSname(),bo.getAddr(),bo.getSrank());
		
		return count;
	}

}
