package com.biz.classis;

import com.biz.classis.service.CalcService;

public class ClassEx_06 {

	public static void main(String[] args) {

		CalcService calcService = new CalcService();
		
		
		int intKor = 90;
		int intEng = 80;
		calcService.add(intKor, intEng);
		calcService.add(30, 40);
		
		int sum = calcService.even(1, 100);
		System.out.println(sum);
		sum = calcService.even(100, 1000);
		System.out.println(sum);
		sum = calcService.even(2, 55);
		System.out.println();
		
		sum = calcService.prime(2, 100);
		System.out.println(sum);
		
		sum = calcService.prime(100, 1000);
		System.out.println(sum);
		
		sum = calcService.prime(5, 99);
		System.out.println(sum);
		
		sum = calcService.prime(4, 1000);
		System.out.println(sum);
		
		
	}

}
