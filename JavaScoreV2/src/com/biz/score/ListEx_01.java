package com.biz.score;

import java.util.ArrayList;
import java.util.List;

public class ListEx_01 {

	public static void main(String[] args) {

		// 객체(인스턴스)들의 묶음 객체
		// List<제네릭:Generic> 리스트에 포함된 객체가 무엇인가를 명시
		List<String> strList; // String 객체(문자열)이 요소로 포함된 리스트다

		strList = new ArrayList<String>();

		System.out.println("1.");
		strList.add("Korea");
		strList.add("대한민국");
		strList.add("우리나라 만세");

		int size = strList.size();
		for (int i = 0; i < size; i++) {
			String str = strList.get(i);
			System.out.println(str);
		}
		System.out.println();
		strList.add("농농이");
		strList.add("빙빙이");
		strList.add("쩔쩔이");
		
		System.out.println("2.");
		size = strList.size(); // 미리 사이즈를 재는 이유는 for문 반복조건에 넣었다가는 매 반복마다 다시 계산하여 불필요한 연산으로 느려지기 때문
		// 이렇게 하면 개수를 1번만 조회하고 반복문을 수행한다
		// 하지만 개수를 조회하는 코드를 생략하면
		// 리스트 개수가 변경되었을 때
		// 반복문 연산 수행에 문제가 될 수 있다.
		for(int i =0;i<size;i++) {
			System.out.println(strList.get(i));
		}
		
		// List 전체에 대해서 for 반복문을 수행할 경우
		// 사용할 수 있는 향상된 for, forEach 라고 한다.
		// 1. strList 개수만큼 알아서 for가 반복된다.
		// 2. for가 반복되면서 strList.get(현재) 를 str 변수에 할당
		// 3. for 반복문 내에서 str변수 값을 읽어서 사용할 수 있다.
		for(String str : strList) {
			
		}
		
		// 배열도 향상된 for를 사용하여 반복문을 수행할수 있다.
		int[] intArray = new int[100];
		for(int i : intArray) {
			System.out.println(i);
		}

		
	}
}
