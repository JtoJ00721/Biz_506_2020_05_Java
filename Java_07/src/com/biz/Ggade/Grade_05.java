package com.biz.Ggade;

import java.util.Random;

public class Grade_05 {

	public static void main(String[] args) {

		Random random = new Random();

		int intKor1 = random.nextInt(51) + 50;
		int intKor2 = random.nextInt(51) + 50;
		int intKor3 = random.nextInt(51) + 50;
		int intKor4 = random.nextInt(51) + 50;
		int intKor5 = random.nextInt(51) + 50;
		int intKor6 = random.nextInt(51) + 50;
		int intKor7 = random.nextInt(51) + 50;
		int intKor8 = random.nextInt(51) + 50;
		int intKor9 = random.nextInt(51) + 50;
		int intKor10 = random.nextInt(51) + 50;

		System.out.println("============");

		System.out.println(intKor1);
		System.out.println(intKor2);
		System.out.println(intKor3);
		System.out.println(intKor4);
		System.out.println(intKor5);
		System.out.println(intKor6);
		System.out.println(intKor7);
		System.out.println(intKor8);
		System.out.println(intKor9);
		System.out.println(intKor10);
		
		System.out.println("============");

		int num = intKor1 + intKor2 + intKor3 + intKor4 + intKor5 + intKor6 + intKor7 + intKor8 + intKor9 + intKor10;

		System.out.println("총점" + num);
		System.out.println("평균 : " + num / 10);

	}

}
