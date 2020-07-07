package com.biz.word.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.biz.word.domain.WordVO;
import com.biz.word.statics.SplitPosition;

public class WordGameServiceImplV1 implements WordGameService {
	protected List<WordVO> wordList;
	protected int life;
	protected int count;
	protected int game;
	
	public WordGameServiceImplV1() {
		wordList = new ArrayList<WordVO>();
		game = 0;
		count = 0;
		life = 0;
	}

	@Override
	public void loadWord() {
		String wordFile = "src/com/biz/word/exec/word.txt";
		
		FileReader fileReader = null;
		
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(wordFile);
			
			buffer = new BufferedReader(fileReader);
			
			String reader = "";
			while(true) {

				 reader = buffer.readLine();
				 if(reader == null) {
					 break;
				 }

				 String[] words = reader.split(":");
				 WordVO wVO = new WordVO();
				 wVO.setEng(words[ SplitPosition.WORD_ENG ]);
				 wVO.setKor(words[ SplitPosition.WORD_KOR ]);
				 wordList.add(wVO);
				 
			}
			buffer.close();
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			// e.printStackTrace();
			System.out.println("단어장 파일 열기 오류");
			return;
		} catch (IOException e) {
			// e.printStackTrace();
			System.out.println("단어장 읽기 오류");
			return;
		}		
	}

	@Override
	public void playGame() {
		Random rnd = new Random();
		int size = wordList.size();
		Scanner scan = new Scanner(System.in);
		game =0;
		count = 0;
		life = 5;
		
		while(true) {
			if(life <= 0) {
				break;
			}
			int index = rnd.nextInt(size); // 0 ~ (wordList 개수 - 1) 중의 한 수
			System.out.println(" 다음에 해당하는 영어단어는?(END:종료) ");
			System.out.print(wordList.get(index).getKor() + " >> ");
			String strEng = scan.nextLine();
			if(strEng.equals("end")) {
				break;
			}
			game ++;
			if(strEng.equalsIgnoreCase("농농이")) {
				System.out.println("아유 우리 농농이!!! ><");
			} else if(strEng.equalsIgnoreCase("praise the sun")) {
				System.out.println("\n태양 만세!!!\n");
				count ++;
			} else if(strEng.equalsIgnoreCase(wordList.get(index).getEng())){
				System.out.println("\n맞았습니다 축하합니다!!\n");
				count++;
			}
			else {
				life -= 1;
				System.out.println("아쉽네요!!!\n");
				System.out.println("정답 : " + wordList.get(index).getEng() + "\n");
				System.out.printf("남은목숨 %d 개\n\n",life);
			}
		}
	}
	

	@Override
	public void gameOver() {
		System.out.println("\n\n게임 끝났지롱\n\n");
		System.out.printf("%d 게임중 %d 번 정답 맞췃지롱\n",game,count);
		System.out.println("\n꺼졍");
	}

}
