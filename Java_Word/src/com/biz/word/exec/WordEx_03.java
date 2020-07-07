package com.biz.word.exec;

import com.biz.word.service.WordGameService;
import com.biz.word.service.WordGameServiceV3;

public class WordEx_03 {

	public static void main(String[] args) {
		
		WordGameService game = new WordGameServiceV3();
		
		game.loadWord();
		game.playGame();
		game.gameOver();
		
	}
}
