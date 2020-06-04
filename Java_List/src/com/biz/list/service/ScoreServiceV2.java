package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.list.model.ScoreVO;

public class ScoreServiceV2 {

	List<ScoreVO> scoreList = new ArrayList<ScoreVO>();

	int sSize = scoreList.size();

	public void stSum(List<ScoreVO> scoreList) {
		this.scoreList = scoreList;

		for (int i = 0; i < sSize; i++) {
			ScoreVO sSum = scoreList.get(i);
			int sum;
			sum = sSum.getKor();
			sum += sSum.getEng();
			sum += sSum.getMath();

			sSum.setStSum(sum);
		}

	}

	
	public void stAvg() {

		
		for (int i = 0; i < sSize; i++) {
			ScoreVO sAvg = scoreList.get(i);
			int avg;
			avg = sAvg.getStSum() / 4;

			sAvg.setStAvg(avg);

		}

	}
	
	public void scoreList() {
		
		System.out.println("==============================================");
		System.out.println("성적리스트");
		System.out.println("==============================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------------------");
		
		int scoreSize = scoreList.size();
		
		for(int i =0;i<scoreSize;i++) {
			ScoreVO sGet = scoreList.get(i);
			System.out.print(sGet.getNum()+"\t");
			System.out.print(sGet.getKor()+"\t");
			System.out.print(sGet.getEng()+"\t");
			System.out.print(sGet.getMath()+"\t");
			System.out.print(sGet.getStSum()+"\t");
			System.out.println(sGet.getStAvg());
			
			
		}
		System.out.println("==============================================");
		
		
	}
	
	
	

}
