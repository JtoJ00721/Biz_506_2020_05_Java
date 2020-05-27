package com.biz.grade;

public class Array_03 {

	/*
	 * 1 ~ 100까지 범위의 수중 짝수의 개수는 몇개인가 1 ~ 100까지 범위의 수중 3의 배수의 개수는 몇개인가
	 */
	public static void main(String[] args) {

		int intSum = 0;
		int intNum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				intSum++;
				intNum += i;

			}
		}
		System.out.println("짝수의 개수 : " + intSum + "개");
		System.out.println("짝수의 합 : " + intNum);

		intSum = 0;
		intNum = 0;

		for (int i = 2; i <= 100; i++) {
			if (i % 3 == 0) {
				intSum++;
				intNum += i;
			}
		}
		System.out.println("3의 배수의 개수 : " + intSum + "개");
		System.out.println("3의 배수의 합 : " + intNum);
		

	}

}
