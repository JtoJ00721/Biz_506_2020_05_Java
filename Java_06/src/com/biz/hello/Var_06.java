package com.biz.hello;

public class Var_06 {

	public static void main(String[] args) {
		// 2부터 100까지 반복
		int j = 2;
		for (int i = 2; i <= 100; i++) {
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					break;
				}
			}
			if (i == j) {
				System.out.println(i + "는 소수");
			}
		}

	}

}