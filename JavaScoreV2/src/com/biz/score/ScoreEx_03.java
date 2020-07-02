package com.biz.score;

import com.biz.score.service.ScoreService;
import com.biz.score.service.ScoreServiceImplV1;
import com.biz.score.service.ScoreServiceImplV2;

public class ScoreEx_03 {
	
	public static void main(String[] args) {
		
		ScoreService sService = new ScoreServiceImplV2();
		while(true) {
			if(!sService.inputScore()) {
				break;
			}
		}
		sService.calcSum();
		sService.calcAvg();
		sService.scoreList();
		
		
	}
}
