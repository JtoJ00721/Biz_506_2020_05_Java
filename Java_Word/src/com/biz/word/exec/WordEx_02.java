package com.biz.word.exec;

import com.biz.word.service.WordGameServiceImplV1;

public class WordEx_02 {

	public static void main(String[] args) {
		
		WordGameServiceImplV1 game = new WordGameServiceImplV1();
		
		game.loadWord();
		game.playGame();
		game.gameOver();
		
	}
}
