package com.biz.Grade;

import java.util.Random;

/*
 * 학생 20명 과목 5과목의 성적처리
 */
public class Grade_02 {
	public static void main(String[] args) {

		int count = 20;// 학생인원수
		int subcount = 5+2;// 과목 5개와 총점, 평균을 저장할 배열
		
		/*
		 * 배열을 정해진 개수만큰 선언하고
		 * String[] subtitle = new String[subcount];
		
		정해진 개수만큼 값을 채워넣는 방식
		subtitle[0] = "국어";
		subtitle[0] = "영어";
		subtitle[0] = "수학";
		subtitle[0] = "음악";
		subtitle[0] = "미술";
		*/
		/*
		 * 배열을 선언할때 보관할 값의 개수가 얼마인지 확실치 않을 때
		 * 배열을 빈(Blank) 크기만큼만 선언하고
		 * {}; 를 사용하여, 값을 미리 저장하는 방법
		 * 이 방법을 사용하면, 배열의 개수가 변동될 때
		 * 배열에 저장되는 값을 추가, 삭제하므로써 자동으로 배열이 생성된다.
		 * 
		 * 배열을 선언할때 값으로 크기를 지정하는 방법이다.
		 */
		
		String []subtitle = new String[] {
				"학번",
				"국어",
				"영어",
				"수학",
				"음악",
				"미술",
				"총점",
				"평균"
		};
		// score
		// int[][] score : score 배열을 가로세로 방향으로 선언하겠다
		// 2차원 배열, Table Array
		// 20 x 5 개의 공간을 갖는 2차원 배열로 선언
		int[][] score = new int[count][subcount];

		// score[0] = new int[subcount];
		// score[1] = new int[subcount];
		// score[3] = new int[subcount];

		// 세로방향으로 5번, 가로방향으로 2번 위치에 값 90을 저장하라
		score[5][2] = 90;

		Random rnd = new Random();

		// index를 줄여서 임시로 사용하기 위한 변수명
		for (int i = 0; i < count; i++) {

			for (int j = 0; j < subcount; j++) {
				// 0,0 ~ 0,4
				// 1,0 ~ 1,4
				// 19,0 ~ 19,4
				score[i][j] = rnd.nextInt(51) + 50;
			}
		}
		System.out.println("=============================================");
		System.out.println("성적일람표");
		System.out.println("\n---------------------------------------------");
		
		/*
		 * 배열.length : 배열의 개수가 몇개인지 알려주는 
		 * 키워드변수, 필드변수, 맴버변수
		 * 벼열의 개수가 궁금할때 일일이 세어보지 않아도 알수 있게 해주는 키워드 변수이다.
		 */
		for(int i =0;i<subtitle.length;i++) {
			System.out.printf("%s\t",subtitle[i]);
		}
		System.out.println();
		for(int i = 0; i<count;i++) {
			
			System.out.printf("%d\t",(i+1));
			for(int j =0;j<subcount;j++) {
				System.out.printf("%d\t",score[i][j]);
			}
			System.out.println();
		}
		

	}

}
