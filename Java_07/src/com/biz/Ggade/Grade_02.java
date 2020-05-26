package com.biz.Ggade;

import java.util.Random;

public class Grade_02 {

	public static void main(String[] args) {

		// 어떠한 변수를 선언만 하면 사용을 바로 할 수 없다.
		//모든 변수는 선언을 하고 초기화를 수행해야 한다.
		// 클래스         클래스로 만든 변수      초기화(생성)코드
		Random                 random =             new Random();

		//String도 실재로는 클래스 키워드라고 한다.
		String strName = "홍길동";
		
		//따라서 String형 변수도 원래는 new String() 초기화 코드를 사용하여 
		//변수를 초기화 해주어야 한다.
		//다만 String형 변수는 워낙 사용용도가 많으므로
		//굳이 new String() 초기화 코드를 사용하지 않아도 
		//되도록 만들어져 있다.
		String strNation = new String();
		
		/*
		 * 0~99까지의 임의수(random한 수)를 10개 생성하고
		 * intSum 변수에 누적하기
		 */
		int intSum = 0;
		for(int i = 0; i < 10; i++) {
			
			int intNum = random.nextInt(100);
			intSum += intNum;
		}
		
		System.out.println(intSum);
		
		
	}

}
