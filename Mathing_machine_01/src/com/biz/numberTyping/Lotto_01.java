package com.biz.numberTyping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// 콘솔에 1~30 까지의 무작위 숫자를 5개 출력하는 프로그램이다

public class Lotto_01{
	
	public static void main(String []args) {
		
		List<Integer> lst = new ArrayList<Integer>(); // List 함수 쓰도록 세팅
		
		Random rnd = new Random(); // Random 함수 쓰도록 세팅
		
		for(int i =0;i<6;i++) {
			lst.add(rnd.nextInt(30)+1); // for 문으로 값이 6가지 들어있는 List 만들기
		}
		
		for(int i =0;i<6;i++) {
			System.out.printf("%d\t",lst.get(i)); // 가로로 읽기
		}
		System.out.println();
		
		for(int i =0;i<6;i++) {
			System.out.println(lst.get(i)); // 세로로 읽기
		}
		
		
		// 대략 짧지만 이걸 객체써서 만들어 볼까 말까.... 
		
		
	}
	
}