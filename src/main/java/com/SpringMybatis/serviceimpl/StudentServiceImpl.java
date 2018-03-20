package com.SpringMybatis.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.SpringMybatis.dao.StudentMapper;
import com.SpringMybatis.domain.Student;
import com.SpringMybatis.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentMapper studentMapper;
	

	public Student getStudentInfo(String sid) {
		// TODO Auto-generated method stub
		Student student = studentMapper.selectById("01");
		
		return student;
	}
	

}
