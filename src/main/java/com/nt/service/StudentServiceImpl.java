package com.nt.service;

import org.springframework.beans.BeanUtils;

import com.nt.bo.StudentBo;
import com.nt.dao.StudentDaoImpl;
import com.nt.dto.StudentDto;

public class StudentServiceImpl implements StudentService {

	private StudentDaoImpl dao=null;
	
	
	public StudentServiceImpl(StudentDaoImpl dao) {
		
		this.dao = dao;
	}


	@Override
	public String Register(StudentDto dto) {
		// TODO Auto-generated method stub
		String s=null;
		StudentBo bo=null;
		
		bo=new StudentBo();
		
		BeanUtils.copyProperties(dto, bo);
		
		int count=dao.insert(bo);
		
		if(count==0) {
			s="records are not inserted";
		}
		else {
			s="records are inserted";
		}
		
		return s;
	}

}
