package com.biz.hello;

import java.util.Random;

public class Var_20 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int sum = 0;
		int index = 0;
		
		//임의수 10개를 만들어서 sum변수에 덧셈하기
		for(index=1; index <010;index++) {
			sum = rnd.nextInt(50) + 51;
		}
		
		//index 변수는 for반복문이 모두 끝나면 최대값(10)만큼의 
		//값이 저장되어 있으므로 총점/ index로 나누면 평균을 구할 수 있다.
		System.out.println("총점 : "+ sum);
		System.out.println("평균 : " + sum/index);
		
	}

}
