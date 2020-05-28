package com.biz.grade;

import java.util.Random;

import com.biz.score.Student;

public class Grade_05 {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 0; i < 100000000; i++) {
			sum = 100;
		}
		// 선언되고 초기화된 변수 sum에 for문을 이용하여
		// 기억장체에 sum의 값을 100으로 1억번 할당했다
		// for 반복문을 빠져나가더라도 다시 초기화 하라는 명령이 없으므로 
		// 메모리에 변수 sum의 값에는 100이 남아있다
		// sum의 값은 100 이다.
		for(int i = 0;i < 10; i++) {
			System.out.println(sum);
		}
		System.out.println(sum);
		
		Student student = new Student();

		// Student 클래스에 선언된 make() 메서드를 호출하기
		student.make();
		String strN = student.getName();
		/*
		 * public class Student {
	String strName = "홍길동";
	public void make() {
		strName = "이몽룡";
	}
			?? strName =>이몽룡
			
			public String getName() {
		return strName;
	}
			}
			?? strName =?
		 */
		System.out.println(strN);
		
		Random rnd = new Random();
		rnd.nextInt();

	}
}
