package com.biz.hello;

import java.util.Random;

public class Var_05 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int num1 = rnd.nextInt(51)+50;
		int num2 = rnd.nextInt(51)+50;
		
		System.out.println(num1);
		System.out.println(num2);
		
	}

}
