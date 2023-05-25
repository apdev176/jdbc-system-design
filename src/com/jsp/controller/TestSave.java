package com.jsp.controller;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class TestSave {
 public static void main(String[] args) {
	Student student=new Student();
	student.setId(2);
	student.setName("XYZ");
	student.setEmail("xyz@mail.com");
	
	StudentDao studentDao=new StudentDao();
	Student s=studentDao.saveStudent(student);
	System.out.println(s.getName()+" saved successfully");
}
}
