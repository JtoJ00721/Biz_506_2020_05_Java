package com.biz.Ggade;

import java.util.Random;

public class Grade_12 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int[] intNum = new int[10];
		int intSum = 0;

		for (int i = 0; i < 10; i++) {
			intNum[i] = rnd.nextInt(50) + 51;
			if (intNum[i] % 2 == 0) {
				intSum += intNum[i];
			}
		}
		System.out.println("짝수의 합 : "+intSum);
		
		int[] poo = new int[10];
		
		for(int i = 0; i<10; i++) {
			poo[i] = rnd.nextInt(50) + 51;
		}
		int bbong = 0;
		
		for(int i = 0; i<10; i++) {
			if(poo[i]%2==0) {
				bbong += poo[i];
			}
		}
		System.out.println("농농이!"+bbong);
		
		
		
	}

}
