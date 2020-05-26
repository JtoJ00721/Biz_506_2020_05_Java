package com.biz.Ggade;

import java.util.Random;

public class Grade_13 {

	public static void main(String[] args) {

		Random rnd = new Random();

		int dut = 0;
		int dut_2 = 0;

		int[] intNum = new int[100];
		
		System.out.println("랜덤수를 뽑아서");
		
		for (int i = 0; i < 100; i++) {
			intNum[i] = rnd.nextInt(100) + 1;
			if (intNum[i] % 3 == 0) {
				dut += intNum[i];
				if (intNum[i] % 5 == 0) {
					dut_2 += intNum[i];
				}
			}
		}
		System.out.println("3의 배수 의 합 : "+ dut);
		System.out.println("5의 배수 의 합 : "+ dut_2);
		System.out.println();
		System.out.println("또 랜덤하게");
		
		int[] nong = new int [100];
		int bbong = 0;
		for(int i =0; i<100; i++) {
			nong[i] = rnd.nextInt(100)+1;
		}
		for(int i = 0; i<100; i++) {
			if(nong[i]%3 ==0 || nong[i]% 5 ==0) {
				bbong += nong[i];
			}
		}
		
		System.out.println("3 또는 5의 배수의 합 : "+ bbong);
		
		

	}

}
