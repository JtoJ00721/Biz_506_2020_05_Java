package com.biz.test;

public class MethodEx {
	
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		Call call = new Call();
		
		/*
		 * add() method는 정수형 매개변수 2개를 받아서
		 * 연산처리를 하도록 만들어져야 한다.
		 * 또한 sum 변수가 int형이기 때문에
		 * 반드시 return type이 void가 아닌 int 형이여야 한다.
		 * 
		 * return 명령문과 return되는 값이 있어야 한다.
		 */
		int sum = call.add(num1, num2);
		System.out.println(sum);
		
		/*
		 * sum() method는 매개변수가 없고
		 * 러턴타입은 무엇이든지 상관 없다.
		 * sum()의 결과를 변수에 담거나 하지 않았기 때문에
		 * return 명령문과 return되는 값도 상관없다.
		 */
		call.sum();
		
	}
	
}
