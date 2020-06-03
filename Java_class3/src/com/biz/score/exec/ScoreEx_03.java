package com.biz.score.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.score.VO.ScoreVO;

public class ScoreEx_03 {
	
	public static void main(String[] args) {
		
		int[] num = new int [3];
		
		List<String> str1 = new ArrayList<String>();
		
		str1.add("대한민국");
		str1.add("우리나라");
		str1.add("Republic of Korea");
		str1.add(""+90);
		
		List<Integer> int1 = new ArrayList<Integer>();
		int1.add(90);
		int1.add(100);
		int1.add(200);
		
		List<Character> char1 = new ArrayList<Character>();
		char1.add('A');
		char1.add('가');
		char1.add('1');
		
		List<Boolean> b1 = new ArrayList<Boolean>();
		
		List<Float> f1 = new ArrayList<Float>();
		
		List<Double> d1 = new ArrayList<Double>();
		
		List<Long> l1 = new ArrayList<Long>();
		
		//1.8버전 이후는
		//초기화코들에는 제네릭을 생략할 수 있다.
		List<ScoreVO> score18 = new ArrayList<>();
		
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		
		//jdk에서 제공되는 랜덤 클래스 타입의 인스턴스를 
		//포함할 수 있는 리스트
		List<Random> rndList = new ArrayList<Random>();
		
		
		
		
	}
	
	
}
