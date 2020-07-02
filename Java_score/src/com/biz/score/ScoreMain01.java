package com.biz.score;

import com.biz.score.service.ScoreService01;

public class ScoreMain01 {
	public static void main(String[] args) {

		ScoreService01 scr = new ScoreService01();

		while (true) {

			if (!scr.inputScore()) {
				break;
			}

		}
		scr.scoreList();
		System.out.println("\n\n\n종료되지롱");

	}
}
