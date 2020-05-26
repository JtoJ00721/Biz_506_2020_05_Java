package com.biz.Ggade;

import java.util.Random;

public class Grade_11 {

	public static void main(String[] args) {

		int[] intNum = new int[10];

		Random rnd = new Random();

		for (int i = 0; i < 10; i++) {
			intNum[i] = rnd.nextInt(100)+1;
			if(intNum[i] % 2 == 0) {
				System.out.println(intNum[i]+"는 짝수지롱");
			} else {
				System.out.println(intNum[i]+"는 짝수가 아니지롱");
			}
			
		}
		// intNum 배열에 저장된 정수가 짝수인지 판별하여 Console에 표시

	}

}
