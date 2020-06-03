package com.biz.score.exec;

import java.util.Random;

import com.biz.score.VO.ScoreVO;
import com.biz.score.service.ScoreServiceV1;
import com.biz.score.service.ScoreServiceV2;

public class ScoreEx_01 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		ScoreVO[] scores = new ScoreVO[10];
		for(int i = 0; i<scores.length;i++) {
			
			scores[i] = new ScoreVO();
			scores[i].setNum(""+(i+1));
			scores[i].setIntKor(rnd.nextInt(50)+51);
			scores[i].setIntEng(rnd.nextInt(50)+51);
			scores[i].setIntMath(rnd.nextInt(50)+51);
			scores[i].setIntMusic(rnd.nextInt(50)+51);
		}
		
		ScoreServiceV1 scoreServ = new ScoreServiceV1();
		scoreServ.setScoreList(scores);
		scoreServ.scoreSum();
		scoreServ.scoreAvg();
		scoreServ.ScoreList();
		
		ScoreServiceV2 scoreServ2 = new ScoreServiceV2();
		scoreServ2.scoreSum(scores);
		scoreServ2.scoreAvg();
		scoreServ2.ScoreList();
			
		
		
	}
	
	
	
	
}
