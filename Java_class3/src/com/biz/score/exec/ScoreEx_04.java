package com.biz.score.exec;

import java.util.ArrayList;
import java.util.List;

public class ScoreEx_04 {
	public static void main(String[] args) {
		
		List<String> strList = new ArrayList<String>();
		
		strList.add("대한민국 만세");
		strList.add("우리나라 만세");
		strList.add("Republic of Korea");
		
		String s1 =strList.get(0);
		String s2 =strList.get(1);
		String s3 =strList.get(2);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(900);
		
		int num1 = nums.get(0);
		System.out.println(num1);
		System.out.println(nums.get(0));
		
		
		
		for(int i =0;i<3;i++) {
			System.out.println(strList.get(i));
		}
 		
		
		
	}
}
