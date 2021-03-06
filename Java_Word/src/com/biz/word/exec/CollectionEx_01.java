package com.biz.word.exec;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionEx_01 {
	public static void main(String[] args) {
		
		String nation = "KOREA";
		String[] nations = nation.split(""); // 알파벳 단위로 분해
		
		// Arrays.asList(배열) : 배열ㅇ르 List형 데이터로 변환
		List<String> words = Arrays.asList(nations);
		
		// Collections 클래스이 기능을 몇가지 사용하기 위해서
		// 배열을 List형 데이터로 변환했다.
		
		// String, Integer, Long, Float, Chraactor, Boolean 과같은 
		// Wrapper class를 포함하는 List 데이터를
		// 오름차순 정렬하는 매우 간단한 메서드이다.
		// Collections의 sort() method는 내부 알고리즘이 Quick sort 이므로
		// 사용하는데 아무런 제약이 없이 사용해도 된다. (존내 빠름)
		Collections.sort(words);
		System.out.println(words);
		
		// 리스트에 포함된 item들을 마구 섞는 기능을 수행한다.
		Collections.shuffle(words);
		System.out.println(words);
		
		
		
	}
}
