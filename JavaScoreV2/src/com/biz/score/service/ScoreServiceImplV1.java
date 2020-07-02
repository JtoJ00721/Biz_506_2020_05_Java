package com.biz.score.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.score.domain.ScoreVO;

/*
 * ScoreService*** 클래스를 정의할때
 * 반드시 ScoreService interface를 참조(implements)하도록 규칙을 정해 놓는다
 * ScoreService interface를 참조하는 클래스는 ScoreService interface에 디자인된
 * method를 모두 implement해서 작성되어야 하는 규칙이 작동하게 된다.
 * 따라서 모든 method의 이름이 통일되는 효과를 얻게 된다.
 * 
 * interface(ScoreService)를 implements하여 작성된 클래스는
 * interface에 정의된 method의 규칙을 그대로 준수하여 작성해야할 의무가 있는 클래스다
 * 
 */
public class ScoreServiceImplV1 implements ScoreService {

	// private 되어 있던 필드변수를 protected로 변경했다!!
	protected List<ScoreVO> scoreList;
	protected Scanner scan;

	public ScoreServiceImplV1() {
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
	}

	@Override
	public boolean inputScore() {
		ScoreVO scoreVO = new ScoreVO();

		System.out.println("정지명령어>>end<<");
		System.out.println();
		System.out.print("학번입력 >>");
		String strNum = scan.nextLine();

		if (strNum.equals("end")) {
			return false;
		}
		int intNum = 0;
		try {
			intNum = Integer.valueOf(strNum);
		} catch (Exception e) {
			System.out.println("숫자만 입력하세요");
			System.out.println("학변이 0번으로 저장됩니다");
		}

		scoreVO.setNum(intNum);

		System.out.print("국어점수입력 >>");
		String strKor = scan.nextLine();
		int intKor = 0;

		try {
			intKor = Integer.valueOf(strKor);
		} catch (Exception e) {
			System.out.println("숫자만 입력해주세요\n국어점수가 0으로 임시저장됩니다.");
		}
		scoreVO.setKor(intKor);

		System.out.print("영어점수입력 >>");
		String strEng = scan.nextLine();
		int intEng = 0;

		try {
			intEng = Integer.valueOf(strEng);
		} catch (Exception e) {
			System.out.println("숫자만 입력해주세요\n영어점수가 0으로 임시저장됩니다.");
		}
		scoreVO.setEng(intEng);

		System.out.print("수학점수입력 >>");
		String strMath = scan.nextLine();
		System.out.println();
		System.out.println();
		int intMath = 0;

		try {
			intMath = Integer.valueOf(strMath);
		} catch (Exception e) {
			System.out.println("숫자만 입력해주세요\n수학점수가 0으로 임시저장됩니다.");
		}
		scoreVO.setMath(intMath);

		scoreList.add(scoreVO);

		return true;
	}

	@Override
	public void calcSum() {
		int size = scoreList.size();
		for (int i = 0; i < size; i++) {
			ScoreVO vo = scoreList.get(i);
			int intSum = vo.getKor();
			intSum += vo.getEng();
			intSum += vo.getMath();
			/*
			 * vo.setSum() method에 총점을 전달하므로써
			 * scoreList에 저장된 요소의 총점 변수에 값을 저장하는 효과를 낸다
			 * 별도로 저장을 해주거나 하는 절차가 필요없다.
			 */
			vo.setSum(intSum);
		}
	}

	@Override
	public void calcAvg() {
		int size = scoreList.size();
		for (int i = 0; i < size; i++) {
			ScoreVO vo = scoreList.get(i);
			float intAvg = ((float) vo.getSum() / 3);
			vo.setAvg(intAvg);
		}
	}

	@Override
	public void scoreList() {

		ScoreVO scoreVO = new ScoreVO();

		System.out.println("================================================================");
		System.out.println("\t\t성적표");
		System.out.println("----------------------------------------------------------------");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------------------------------------");

		int scoreSize = scoreList.size();

		int allKor = 0;
		int allEng = 0;
		int allMath = 0;

		int avgKor = 0;
		int avgEng = 0;
		int avgMath = 0;

		// 개수만큼 반복문을 수행하도록 변경
		for (int i = 0; i < scoreSize; i++) {
			ScoreVO vo = scoreList.get(i);
			allKor += vo.getKor();
			allEng += vo.getEng();
			allMath += vo.getMath();

			System.out.print(vo.getNum() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getSum() + "\t");
			System.out.print(vo.getAvg() + "\t");
			System.out.println();
			System.out.println("---------------------------------------------------------------");
			avgKor = allKor / scoreSize;
			avgEng = allEng / scoreSize;
			avgMath = allMath / scoreSize;
		}
		System.out.println("================================================================");
		System.out.printf("전체학생총점 : 국:%d\t영:%d\t수:%d\n", allKor, allEng, allMath);
		System.out.printf("국어평균 : %d\t영어평균 : %d\t수학평균 : %d", avgKor, avgEng, avgMath);

	}

}
