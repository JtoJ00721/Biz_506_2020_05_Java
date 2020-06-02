package com.biz.service;

import com.biz.model.ScoreVO;

public class ScoreServiceV1 {

	public void scoreList(ScoreVO[] score) {
		
		int stSum;
		
		LineService line = new LineService();
		System.out.println(line.do_line(70));
			System.out.println("번호\t국어\t영어\t수학");
			System.out.println(line.single(70));
			for(int i = 0;i<20;i++) {
			int[i] stSum = scoreList.getKor();
			int[i] stSum += scoreList.getEng();
			int[i] stSum += scoreList.getMath();

			}
		
	}

}
