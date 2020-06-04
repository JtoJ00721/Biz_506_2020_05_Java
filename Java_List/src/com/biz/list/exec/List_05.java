package com.biz.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List_05 {

	public static void main(String[] args) {
		int num = 0;
		Random rnd = new Random();
		List<Integer> intList = new ArrayList<Integer>();

		for (int i = 0; i < 100; i++) {
			intList.add(rnd.nextInt(100) + 1);

		}
		
		/*
		 * 검색 알고리즘(Serch algorithme)
		 * 리스트의 처음부터 순차적으로 하나씩 비교하면서
		 * 값을 찾다가 값이 있으면 위치를 알려주고 
		 * 검색을 중단하는 방식
		 * 리스트의 데이터가 무작위(순서없이)로 저장되어 있을 때
		 * 비교적 쉽게 찾을 수 있는 방식
		 * 하지만 찾고자 하는 값이 제일 마지막 위치에 있을때는
		 * 전체 리스트를 모두 비교해야 하기 때문에 최악의 효율을 보인다
		 * 값이 제일 처음에 있을때는 최고의 효율을 보인다.
		 */
		for (int i = 0; i < 100; i++) {
			num = intList.get(i);
			if (num == 55) {
				System.out.printf("55가 %d번째자리에 나타났다 무섭지!!!\t\n", i);
				break;
			}

		}

	}

}
