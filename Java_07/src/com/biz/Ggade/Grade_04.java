package com.biz.Ggade;

import java.util.Random;

public class Grade_04 {

	public static void main(String[] args) {

		Random random = new Random();

		float floatKor = random.nextInt(51) + 50;
		float floatEng = random.nextInt(51) + 50;
		float floatMath = random.nextInt(51) + 50;

		float floatNum = floatKor + floatEng + floatMath;
		
		float floatSum = floatNum/3;
		
		System.out.println("총점 : "+ floatNum);
		System.out.println("평균 : "+ floatSum);

	}

}
