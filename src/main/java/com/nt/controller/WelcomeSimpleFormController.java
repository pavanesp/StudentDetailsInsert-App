package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.command.StudentCommand;
import com.nt.dto.StudentDto;
import com.nt.service.StudentService;

public class WelcomeSimpleFormController extends SimpleFormController{
	
	private StudentService service=null;
	
	public WelcomeSimpleFormController(StudentService service) {
		this.service = service;
	}

	@Override
	protected ModelAndView handleInvalidSubmit(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		
		return new ModelAndView("dbposting","name",request.getParameter("sname"));
	}
	
	@Override
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		// TODO Auto-generated method stub
		
		StudentCommand cmd=null;
		cmd=(StudentCommand)command;
		StudentDto dto=null;
		
		dto=new StudentDto();
		
		BeanUtils.copyProperties(cmd, dto);
		
		System.out.println(dto.getAddr()+" "+dto.getSname());
		
		String msg=service.Register(dto);
		System.out.println(msg);
		
		
		return new ModelAndView(getSuccessView(),"getMessage",msg);
		
	}
	

}
