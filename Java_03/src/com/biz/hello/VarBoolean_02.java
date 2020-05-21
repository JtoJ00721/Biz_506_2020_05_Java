package com.biz.hello;

public class VarBoolean_02 {

	public static void main(String[] args) {

		int num1;
		int num2;

		num1 = 7;
		num2 = 6974;

		boolean bbong = ((num1 + num2) % 2 == 0);

		if (bbong) {
			System.out.println("num1 + num2 = 짝수");
		}
		if (!bbong) {
			System.out.println("num1 + num2 = 홀수");
		}

		boolean bbong2 = ((num1 - num2) % 2 == 0);

		if (bbong2) {
			System.out.println("num1 - num2 = 짝수");
		}
		if (!bbong2) {
			System.out.println("num1 - num2 = 홀수");
		}

		boolean bbong3 = ((num1 * num2) % 2 == 0);

		if (bbong3) {
			System.out.println("num1 * num2 = 짝수");
		}
		if (!bbong3) {
			System.out.println("num1 * num2 = 홀수");
		}

		boolean bbong4 = ((num1 / num2) % 2 == 0);

		if (bbong4) {
			System.out.println("num1 / num2 = 짝수");
		}
		if (!bbong4) {
			System.out.println("num1 / num2 = 홀수");
		}

	}

}
