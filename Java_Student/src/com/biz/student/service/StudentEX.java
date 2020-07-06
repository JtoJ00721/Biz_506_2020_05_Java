package com.biz.student.service;

public class StudentEX {
	public static void main(String[] args) {
		StudentServiceImplV1 sServ = new StudentServiceImplV1();
		while (true) {
			if(!sServ.inputStudent()) {
				System.out.println("\n\n종료지롱 ><\n");
				break;
			}
		}
		sServ.studentList();
		
	}
}
