package com.biz.test;

import java.util.Random;

public class RandomEx {

	public static void main(String args[]) {

		Random rnd = null;
		rnd = new Random();

		// 1 ~ 100 까지 범위의 임의의 정수
		// rnd.nextInt() : 0 ~ 1 미만의 임의의 수를 생성
		// 이 결과에 * 100을 하게 되면 0 ~ 99.999999 까지의 임의의 수를 생성
		// 이 결과에 다시 + 1을 하게 되면 1 ~ 100.999999 까지의 임의 수를 생성하게 된다
		// 이 결과를 정수형 변수에 담으면 1 ~ 100까지의 임의 수를 만들어 낼수 있다.
		for (int i = 0; i < 10; i++) {

			// int num = rnd.nextInt() * 100 + 1;
			int num = rnd.nextInt(100) + 1;
			// 생성된 임의의 수가 짝수인가 홀수인가를 판별하기
			if (num % 2 == 0) {
				System.out.println(num + " 는 짝수");
			} else {
				System.out.println(num + " 는 홀수");
			}

		}

	}
}
