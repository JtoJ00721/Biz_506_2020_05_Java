package com.biz.hello;

public class Var_14 {
public static void main(String[] args) {
	
	/*
	 * float
	 * 실수형 변수
	 * 소수점 이하 7자리까지 표현
	 * 숫자 뒤에 f라는 값을 붙여줘야 함
	 */
	float num1 = 10.0f;
	float num2 = 3.0f;
	System.out.println(num1/num2);
	
	/*
	 * double
	 * 실수형 변수 
	 * 소수점이하 17자리까지 표현 
	 */
	double num3 = 10.0;
	double num4 = 3.0;
	System.out.println(num3/num4);
	
	/*
	 * integer(정수)형 변수
	 * 2의 31승 +- 범위의 정수 취급
	 * (32bit 4byte)
	 */
	int num5 = 1000000000;
	int num6 = 300;
	System.out.println(num5*num6);
	
	/*
	 * 정수형변수
	 * 64bit크기의 값 취급
	 * 2의 64승 +-범위의 값 취급
	 */
	long num7 = 100000000000L;
	long num8 = 30000L;
	System.out.println(num7*num8);
	
	}

}
