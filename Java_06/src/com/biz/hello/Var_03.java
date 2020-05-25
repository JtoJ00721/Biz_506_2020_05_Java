package com.biz.hello;

import java.util.Random;

public class Var_03 {

	public static void main(String[] args) {

		Random rnd = new Random();

		int num = (rnd.nextInt(10)+1) * 100;

		System.out.println("세금빼고" + (int)(num));
		System.out.println("세금까지" + (int)(1.1*num));
		System.out.println("세금 : " + (num - (int)num/1.1));

	}

}
