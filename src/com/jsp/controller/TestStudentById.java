package com.jsp.controller;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class TestStudentById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     StudentDao studentDao=new StudentDao();
     Student s=studentDao.getStudentById(2);
     System.out.println(s.getId());
     System.out.println(s.getName());
     System.out.println(s.getEmail());
	}

}
