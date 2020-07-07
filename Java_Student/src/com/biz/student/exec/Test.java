package com.biz.student.exec;

import com.biz.student.service.ScoreServiceImplV1;

public class Test {

	public static void main(String[] args) {
		
		ScoreServiceImplV1 sServ = new ScoreServiceImplV1();
		
			sServ.inputStudent();
			sServ.inputScore();
			sServ.calcSum();
			sServ.calcAvg();
			sServ.scoreList();
			
	}
	
}
