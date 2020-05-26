package com.biz.Ggade;

import java.util.Random;

public class GRade_10 {

	public static void main(String[] args) {

		Random rnd = new Random();

		int[] intKor = new int[10];
		int[] intEng = new int[10];
		int[] intMath = new int[10];

		int intSum_1 = 0;
		int intSum_2 = 0;
		int intSum_3 = 0;

		System.out.println("너네 뻘짓이 이루어낸 일");
		System.out.println("=====================");
		System.out.println();
		System.out.println("국어점수");
		for (int i = 0; i < 10; i++) {
			intKor[i] = rnd.nextInt(50) + 51;
			System.out.println(i+"번째 학생 : "+intKor[i]);
			intSum_1 += intKor[i];
		}
		System.out.println("국어점수 합 : " + intSum_1);
		System.out.println("국어점수 평균 : " + intSum_1 / 10);
		
		System.out.println();
		System.out.println("=====================");
		System.out.println();
		

		System.out.println("영어점수");
		for (int i = 0; i < 10; i++) {
			intEng[i] = rnd.nextInt(50) + 51;
			System.out.println(i+"번째 학생 : "+intEng[i]);
			intSum_2 += intEng[i];
		}
		System.out.println("영어점수 합 : " + intSum_2);
		System.out.println("영어점수 평균 : " + intSum_2 / 10);
		
		System.out.println();
		System.out.println("=====================");
		System.out.println();

		System.out.println("수학점수");
		for (int i = 0; i < 10; i++) {
			intMath[i] = rnd.nextInt(50) + 51;
			System.out.println(i+"번째 학생 : "+ intMath[i]);
			intSum_3 += intMath[i];
		}
		System.out.println("수학점수 합 : " + intSum_3);
		System.out.println("수학점수 평균 : " + intSum_3 / 10);
		
		System.out.println();
		System.out.println("=====================");
		
		System.out.println();
		System.out.printf("%d\t%d\t%d\n",intKor[9],intEng[9],intMath[9]);

	}

}
