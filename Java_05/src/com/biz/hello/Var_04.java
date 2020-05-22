package com.biz.hello;

public class Var_04 {

	public static void main(String[] args) {

		int sum1 = 0;
		int num = 1;
		
		sum1 = sum1 + num;
		sum1 = sum1 + ++num;
		sum1 = sum1 + ++num;
		sum1 = sum1 + ++num;
		sum1 = sum1 + ++num;
		sum1 = sum1 + ++num;
		sum1 = sum1 + ++num;
		sum1 = sum1 + ++num;
		sum1 = sum1 + ++num;
		sum1 = sum1 + ++num;
		sum1 = sum1 + ++num;
		sum1 = sum1 + ++num;
		sum1 = sum1 + ++num;

		System.out.printf("1 부터 %d 까지의 덧셈 : %d\n", num, sum1);

	}

}
