package com.biz.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List_02 {
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		Random rnd = new Random();

		int sum = 0;

		int num = rnd.nextInt();
		for (int i = 0; i < 100; i++) {
			int num1 = rnd.nextInt(100) + 1;
			intList.add(num1);
		}

		for (int i = 0; i < 100; i++) {
			sum += intList.get(i);
		}
		System.out.println("합계 : "+sum);

	}

}
