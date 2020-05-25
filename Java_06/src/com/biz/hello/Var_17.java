package com.biz.hello;

import java.util.Random;

public class Var_17 {

	public static void main(String[] args) {

		/*
		 * 변수 이름짓기
		 * 변수 이름 첫글자는 영소문자
		 * 변수 이름은 이름만을 하는일을 유추할수 있도록 짓는것이 유리
		 * 변수 접두사 변수의 TYPE 명칭을 추가하여 작성
		 */
		int intKor;
		int intEng;
		int intMath;
		
		Random rnd = new Random();
		
		intKor = rnd.nextInt(50)+51;
		intEng = rnd.nextInt(50)+51;
		intMath = rnd.nextInt(50)+51;
		
		int intsum;
		int intAvg;
		
		intsum = intKor;
		intsum+=intEng;
		intsum += intMath;
		
		intAvg = intsum/3;
		
		System.out.println("총점 : "+intsum);
		System.out.println("평균 : "+intAvg);
	}

}
