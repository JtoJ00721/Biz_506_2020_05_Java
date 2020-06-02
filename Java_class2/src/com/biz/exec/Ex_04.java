package com.biz.exec;

import java.util.Random;

import com.biz.model.ScoreVO;
import com.biz.service.ScoreServiceV1;

public class Ex_04 {

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
		
		ScoreServiceV1 serv = new ScoreServiceV1();
		
		serv.scoreList(score);
		

	}

}
