package com.biz.addr.exec;

public class Nunber_Ex {
public static void main(String[] args) {
	
	/*
	 * 
	 * 숫자형 wrapper class의 valueOf() method를 사용하면
	 * 숫자형 문자열을 숫자형 데이터로 변환 시킬 수 있다.
	 * 
	 * 오래된 java 버전에서는 아래 두 메서드의 성능차이가 있었으나
	 * java 1.6이상에서는 내부 매커니즘이 같아져 성능차이가 적다.
	 * 
	 */
	
	//Integer.valueOf() : 숫자형 문자열을 정수로 변환시키는 method
	// JAVA 1.5 이후 버전에서 만들어진 메서드 (편안 하고 쌈빡함)(이전 버전에서는 느림)
	Integer.valueOf("34");
	
	Float.valueOf("34.3");
	Double.valueOf("34.3");
	Long.valueOf("333333");
	
	// JAVA 1.5 이전 버전에서 쓰던 메서드(ㄱㅣㄹㄷㅏ)
	Integer.parseInt("34");
	Float.parseFloat("34.3");
	Double.parseDouble("34.3");
	Long.parseLong("333333");
	
	// 아래와 같은 경우는 모두 NumberFormatExeption을 일으키는 코드
	Integer.valueOf("");
	
	Integer.valueOf("34 "); // 숫자 앞, 뒤에 white space문제
	Integer.valueOf("ㅁ34"); // 숫자 앞, 뒤에 숫자형 이외의 문자열이 있는 경우
	Integer.valueOf("3 4"); // 숫자 중간에 space, 숫자형 이외의 문자열이 있는 경우
	Integer.valueOf("3 + 4"); // 하나의 문자열이 연산식 처럼 보일때
	
	
	
	
}
}
