package com.biz.hello;

public class Var_02 {

	public static void main(String[] args) {

		int num = 0;
		for (int i = 1; i <= 100; i++) {
			if(i%3==0) {
				num+=i;
			}
		}
		System.out.println(num);

	}

}
