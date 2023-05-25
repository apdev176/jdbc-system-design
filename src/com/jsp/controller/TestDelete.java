package com.jsp.controller;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class TestDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDao studentDao=new StudentDao();
	   System.out.println(studentDao.deleteStudentById(2));

	}

}
