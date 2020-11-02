package com.biz.test;

import java.util.Random;

public class GuguEx {

	public static void main(String[] args) {

		Random rnd = new Random();
		int i = rnd.nextInt(9) + 1;
		System.out.println("===============");
		System.out.println("---------------");
		System.out.printf("구구단 %s단 시 ~ 작! ><\n\n", i);
		for (int j = 1; j < 10; j++) {
			System.out.printf("%s X %s = %s\n", i, j, i * j);
		}
		System.out.println("---------------");
		System.out.println("===============\n\n");
	}

}
