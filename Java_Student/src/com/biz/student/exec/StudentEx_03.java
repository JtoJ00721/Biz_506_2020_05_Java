package com.biz.student.exec;

import com.biz.student.service.StudentService;
import com.biz.student.service.StudentServiceImplV5;

public class StudentEx_03 {

	public static void main(String[] args) {
		
		StudentService sService = new StudentServiceImplV5();
		
		sService.inputStudent();
		sService.studentList();
		
	}
}
