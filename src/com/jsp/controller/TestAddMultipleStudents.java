package com.jsp.controller;

import java.util.ArrayList;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class TestAddMultipleStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentDao studentDao=new StudentDao();
		ArrayList<Student> al=new ArrayList<Student>();
		
		Student s1=new Student();
		s1.setId(3);
		s1.setName("jsp");
		s1.setEmail("jsp1@mail.com");
		
		Student s2=new Student();
		s2.setId(4);
		s2.setName("react");
		s2.setEmail("react@mail.com");
		
		Student s3=new Student();
		s3.setId(5);
		s3.setName("js");
		s3.setEmail("js@mail.com");
		
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		studentDao.addMultipleStudents(al);

	}

}
