package com.biz.grade;

import java.util.Random;

public class Grade_03 {

	public static void main(String[] args) {

		Random rnd = new Random();

		int intNum = 0;
		intNum = rnd.nextInt();
		int intSum = intNum * 55;

		System.out.println(intSum);

	}

}
