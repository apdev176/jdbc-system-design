package com.jsp.controller;

import com.jsp.dao.StudentDao;

public class TestUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDao studentDao=new StudentDao();
		String email="abc@mail.com";
		boolean flag=studentDao.updateStudentById(2,email);
		System.out.println(flag);

	}

}
