package com.biz.score.service;

import com.biz.score.VO.ScoreVO;

public class ScoreServiceV1 {
	
	private ScoreVO[] scores;
	
	public void setScoreList(ScoreVO[] scores) {
		this.scores = scores;
	}
	
	public void scoreSum() {
		for (int i = 0; i < scores.length; i++) {
			int sum = this.scores[i].getIntKor();
			sum += this.scores[i].getIntEng();
			sum += this.scores[i].getIntMath();
			sum += this.scores[i].getIntMusic();
			
			this.scores[i].setStSum(sum);
			
		}
		
	}

	public void scoreAvg() {
		for (int i = 0; i < scores.length; i++) {
			int sum = this.scores[i].getStSum();
			this.scores[i].setStAvg(sum/4);
		}

	}

	public void ScoreList() {
		System.out.println("================================================================");
		System.out.println("성적리스트");
		System.out.println("================================================================");
		System.out.println("학번\t국어\t영어\t수학\t음악\t총점\t평균");
		System.out.println("----------------------------------------------------------------");
		
		int KorSum = 0;
		int EngSum = 0;
		int MathSum = 0;
		int MusicSum = 0;
		int SumSum = 0;
		int AvgSum = 0;
		for (int i = 0; i < scores.length; i++) {
			
			KorSum += scores[i].getIntKor();
			EngSum += scores[i].getIntEng();
			MathSum+= scores[i].getIntMath();
			MusicSum += scores[i].getIntMusic();
			SumSum += scores[i].getIntSum();
			AvgSum += scores[i].getIntAvg();
			
			System.out.printf(
					"%s\t%d\t%d\t%d\t%d\t%d\t%d\n",
					scores[i].getNum(),
					scores[i].getIntKor(),
					scores[i].getIntEng(),
					scores[i].getIntMath(),
					scores[i].getIntMusic(),
					scores[i].getStSum(),
					scores[i].getStAvg()
					
					);
		}
		System.out.println("----------------------------------------------------------------");
		
		System.out.println("================================================================");

	}

}
