package com.SpringMybatis.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.SpringMybatis.domain.Student;
import com.SpringMybatis.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
/**
 * 
 * @author zcm
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:ApplicationContext.xml" })
public class SpringTest {
	 	@Autowired
	    private StudentService studentService;
	    @Test
	    public void test1() {

	    	Student student = studentService.getStudentInfo("01");
	        System.out.println(student.getSname());
	        //System.out.println("dfsd");

	    }
}
