package com.biz.list.exec;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List_01 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		List<Integer> intList = new ArrayList<Integer>();
		
		int sum = 0;
		
		for (int i = 0; i < 100; i++) {
			intList.add(rnd.nextInt(100) + 1);
			sum += intList.get(i);
		}//값 더하기도 떡으로 만들지 마라
		System.out.println(sum);

	}

}
