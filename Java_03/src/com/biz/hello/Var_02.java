package com.biz.hello;

import java.util.Random;

public class Var_02 {

	public static void main(String[] args) {

		Random rnd1 = new Random();

		int num1 = rnd1.nextInt(100) + 1;
		int num2 = rnd1.nextInt(100) + 1;

		boolean Var1 = ((num1 + num2) % 2 == 0);
		boolean Var2 = ((num1 - num2) % 2 == 0);
		boolean Var3 = ((num1 * num2) % 2 == 0);
		boolean Var4 = ((num1 / num2) % 2 == 0);

		if (Var1) {
			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2) + "=" + "짝수");
		} else {
			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2) + "=" + "짝수가 아니다");
		}
		if (Var2) {
			System.out.println(num1 + "-" + num2 + "=" + (num1 - num2) + "=" + "짝수");
		} else {
			System.out.println(num1 + "-" + num2 + "=" + (num1 - num2) + "=" + "짝수가 아니다");
		}
		if (Var3) {
			System.out.println(num1 + "x" + num2 + "=" + (num1 * num2) + "=" + "짝수");
		} else {
			System.out.println(num1 + "x" + num2 + "=" + (num1 * num2) + "=" + "짝수가 아니다");
		}
		if (Var4) {
			System.out.println(num1 + "/" + num2 + "=" + (num1 / num2) + "=" + "짝수");
		} else {
			System.out.println(num1 + "/" + num2 + "=" + (num1 / num2) + "=" + "짝수가 아니다");
		}

	}

}
