package com.biz.classis;

import com.biz.classis.model.ScoreVO;

public class ClassEx_05 {

	public static void main(String[] args) {

		//Score클래스를 사용하여 Score1,2,3 인스턴스 생성
		ScoreVO score1 = new ScoreVO();
		ScoreVO score2 = new ScoreVO();
		ScoreVO score3 = new ScoreVO();
		
		score1.setNum("01");
		score2.setNum("02");
		score3.setNum("03");
		
		score2.setName("이몽룡");
		score1.setName("홍길동");
		score3.setName("성춘향");
		
		score1.setIntKor(90);
		score2.setIntKor(88);
		score3.setIntKor(77);
		
		
		
	}

}
