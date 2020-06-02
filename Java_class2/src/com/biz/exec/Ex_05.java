package com.biz.exec;

import java.util.Random;

import com.biz.model.ScoreVO;
import com.biz.service.ScoreServiceV1;
import com.biz.service.ScoreserviceV2;

public class Ex_05 {

	public static void main(String[] args) {

		Random rnd = new Random();
		ScoreVO[] score = new ScoreVO[20];

		for (int i = 0; i < 20; i++) {
			score[i] = new ScoreVO();
			score[i].setName("" + (i+1));
			score[i].setKor(rnd.nextInt(50) + 51);
			score[i].setEng(rnd.nextInt(50) + 51);
			score[i].setMath(rnd.nextInt(50) + 51);
		}
		
		
		ScoreserviceV2 scoreService = new ScoreserviceV2();
		scoreService.setScoreList(score);
		scoreService.scoreSum();
		scoreService.scoreList();
		

	}

}
