package com.biz.score;

import com.biz.score.service.ScoreServiceImplV1;

public class ScoreMain {
	
	public static void main(String[] args) {
		
		ScoreServiceImplV1 sServ = new ScoreServiceImplV1();
		
		sServ.inputScore();
		
		sServ.calcSum();
		
		sServ.calcAvg();
		
		sServ.scoreList();
		
	}
}
