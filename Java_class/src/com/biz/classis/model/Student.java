package com.biz.classis.model;

/*
 * 클래스에느 변수, method 가 존재한다.
 */
public class Student {
	// 클래스 내의 method밖에 선언된 변수들 
	// 맴버변수, 필드변수, 속성(Property)
	public String name;
	private int age;
	public String tel;
	private String addr;
	public int grade;
	
	String rem;

	// 임의로 생성한method
	// setName() method라고 칭한다.
	//현재는 하는일이 정해지지 않은 이름만 있는 상태
	//public : 접근제한다하고 한다.
	// 누구나 접슨할수 있는 상태
	//private : 접근제한자라고 한다.
	// public 과 반대되는 개념
	//나 이외는 접근금지
	public void setName() {
		
	}

}
