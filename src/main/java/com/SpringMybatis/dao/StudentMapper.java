package com.SpringMybatis.dao;


import com.SpringMybatis.domain.Student;
public interface StudentMapper {
	Student selectById(String sid);

}
