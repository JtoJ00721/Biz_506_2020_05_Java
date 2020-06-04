package com.biz.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListEx_06 {
	
	public static void main(String[] args) {
		
		List<Character> charList = new ArrayList<Character>();
		
		Random rnd = new Random();
		char char1;
		char fFind;
		//알파벳 개수 : 26
		 // A의 char 코드값은 96
		for(int i =0;i<100;i++) {
			
			//0~25ㄲ지 정수를 만들고
			//여기에 영문자 A의 char 아스키 코드값을 더하여
			// A ~ Z 중에서 임의 문자 1개를 생성하는 코드
			char1 = (char)(rnd.nextInt(26) + 'A');
			charList.add(char1);
		}
		
		//배열을 만들었을때
		//배열의 개수를 알고싶으면 배열.length 를 읽어보면 된다.
		//리스트에서는 리스트.size() 메서드를 호출하면 
		// 리스트의 개수를 알수 있다.
		for(int i =0;i<charList.size();i++) {
			fFind = charList.get(i);
			
			if(fFind == 'F') {
				System.out.println(i+"번 자리에서 야생의 F가 나타났다!");
				break;
			}
			
			
		}
		
		
		int charSize = charList.size()
;
		for(int i = 0;i<charSize;i++) {
			char charGet = charList.get(i);
			if(charGet == 'F') {
				System.out.println(i+"번이지롱");
				break;
			}
		}
		
		
	}
	
}
