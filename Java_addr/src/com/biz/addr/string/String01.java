package com.biz.addr.string;

public class String01 {
	public static void main(String[] args) {

		/*
		 * 문자열형 변수는 변수가 생성될 때 
		 * 실제 문자열이 담기는 변수영역과 문자열이 담긴 변수 영역의 주소를 갖고 있는 변수영역 
		 * 이렇게 2개가 생성된다 
		 * 한곳은 길제 값이 담기고, 한곳은 주소가 담긴다.
		 * 
		 * 문자열을 == 비교 연산자로 비교를 하면 원칙은 주소로 비교를 하나 
		 * 어떤때는 문자열 값을 하기도 하고 어떨떄는 주소로 비교를 하기도 한다.
		 * 
		 * 똑같은 문자열 임에도 불구하고 결과는 예측이 어렵다
		 * 
		 * 따라서 문자열은 절대 == 비교연산자로 비교하면 안된다
		 * java 에서는 !!!
		 */
		String str1 = "Korea";
		String str2 = "Korea";
		System.out.println(str1 == str2); //true

		String str3 = "Korea";
		String str4 = new String("Korea");
		System.out.println(str3 == str4); // false
		
		/*
		 * 문자열형 변수
		 * 기본형 변수와 같은 방식으로 사용을 하지만 태생은 클래스이다.
		 * 즉 문자열형 변수는 String 클래스의 객체(인스턴스)이다.
		 * 따라서 String 클래스에 정의된 다양한 method들을 사용할수 있다는 것이다
		 * 그중 가장 많이 사용하는 메서드가 바로 문자열변수의 값을 비교하는 equals() method이다
		 * 
		 * equals()
		 * 문자열형 변수의 저장된 실제 문자열이 같은지를 비교하는 method이다
		 * 문자열이 같으면 true, 그렇지 않으면 false를 return하도록 정의되어 있다.
		 */
		
		boolean bYes = str3.equals(str4);
		bYes = str4.equals(str3);
		System.out.println(bYes);
		
		
		// equals()와 사용법이 같으며
		// 영문자일 경우 대소문자 관계없이 문자열을 비교한다.
		bYes = str3.equalsIgnoreCase(str4);
		
		System.out.println("Korea".equals("KOREa")); // false
		System.out.println("Korea".equalsIgnoreCase("KoReA")); // true
		System.out.println("KOREA".equalsIgnoreCase("korea")); // true

	}
}
