package com.biz.score.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.score.ScoreVO;

/*
 * 성적을 입력받아서 scoreList 에 저장하고
 * 성적리스트를 출력하는 부분 정의
 */
public class ScoreService02 {

	// 성적리스트를 저장하기 위한 객체
	List<ScoreVO> scoreList;

	// 키보드를 사용해서 값들을 입력받기 위한 객체
	Scanner scan;

	// scoreList, scan 객체를 선언한 사용할수 있도록
	// 생성자에서 두 객체를 초기화 한다.
	// 이 과정을 생략하면 NullpointException이 발생하기 쉽다
	public ScoreService02() {
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
	}

	// 한 학생의 성적을 입력받아서 scoreList에 추가하는 method
	public boolean inputScore() {

		ScoreVO sVO = new ScoreVO();

		System.out.println(">>>프로그램 중단 코드 : end<<<");
		System.out.println();
		System.out.print("학번 >> ");
		String strStuNum = scan.nextLine();
		if (strStuNum.equals("end")) {
			return false;
		}
		int stuNum = 0;
		try {
			stuNum = Integer.valueOf(strStuNum);
		} catch (Exception e) {
			System.out.println("숫자만 입력하세요");
			System.out.println("학변이 0번으로 저장됩니다");
		}

		System.out.print("국어점수 >> ");
		String strKor = scan.nextLine();
		int kor = 0;
		try {
			kor = Integer.valueOf(strKor);
		} catch (Exception e) {
			System.out.println("숫자만 입력하세요");
			System.out.println("잘못 입력하면 빵점으로 기록됩니다");
		}
		if (!sVO.setKor(kor)) {
			System.out.println("점수는 0 ~ 100 까지만 가능합니다");
			System.out.println("잘못 입력하면 빵점으로 기록됩니다");
		}

		System.out.print("영어점수 >> ");
		String strEng = scan.nextLine();
		int eng = 0;
		try {
			eng = Integer.valueOf(strEng);
		} catch (Exception e) {
			System.out.println("숫자만 입력하세요");
			System.out.println("잘못 입력하면 빵점으로 기록됩니다");
		}

		System.out.print("수학점수 >> ");
		String strMath = scan.nextLine();
		int math = 0;
		try {
			math = Integer.valueOf(strMath);
		} catch (Exception e) {
			System.out.println("숫자만 입력하세요");
			System.out.println("잘못 입력하면 빵점으로 기록됩니다");
		}

		int intAll = sVO.getKor();
		intAll += sVO.getEng();
		intAll += sVO.getMath();

		float fAvg = ((float) intAll / 3);

		sVO.setStuNum(stuNum);

		sVO.setEng(eng);
		sVO.setMath(math);
		sVO.setAllScore(intAll);
		sVO.setAvg(fAvg);
		scoreList.add(sVO);

		return true;
	} // inputScore end

	public void scoreList() {
		System.out.println("============================================================");
		System.out.println("\t성적표");
		System.out.println("------------------------------------------------------------");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("------------------------------------------------------------");

		int scoreSize = scoreList.size();

		// 개수만큼 반복문을 수행하도록 변경
		for (int i = 0; i < scoreSize; i++) {
			ScoreVO vo = scoreList.get(i);
			System.out.print(vo.getStuNum() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getAllScore() + "\t");
			System.out.print(vo.getAvg() + "\t");
			System.out.println();
			System.out.println("------------------------------------------------------------");
		}
	}
}
