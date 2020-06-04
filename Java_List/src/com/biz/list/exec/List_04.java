package com.biz.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List_04 {

	public static void main(String[] args) {
		int num = 0;
		Random rnd = new Random();
		List<Integer> intList = new ArrayList<Integer>();

		for (int i = 0; i < 100; i++) {
			intList.add(rnd.nextInt(100) + 1);
		}

		for (int i = 0; i < 100; i++) {
			num = intList.get(i);
			if (num == 55) {
				System.out.printf("%d\t", num);
			}

		}

	}

}
