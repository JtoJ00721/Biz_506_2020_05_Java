package com.biz.student.exec;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

/*
 * 학번, 국어, 영어, 수학, 총점, 평균 데이터를 생성하여
 * score.txt 파일로 저장
 */
public class ScoreEx_03 {
	
	// 데이터를 엑셀로 열어볼수 있는 코드

	public static void main(String[] args) {

		PrintWriter outPut = null; // = System.out;
		String outFile = "src/com/biz/student/exec/score.txt";

		// 지금부터 outFile 변수에 저장된 파일이름으로
		// text를 기록하기 위해 파일을 만들어라
		try {
			outPut = new PrintWriter(outFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		Random rnd = new Random();

		for (int i = 0; i < 30; i++) {

			int intKor = rnd.nextInt(50) + 51;
			int intEng = rnd.nextInt(50) + 51;
			int intMath = rnd.nextInt(50) + 51;

			int intSum = intKor + intEng + intMath;
			float floatAvg = (float)intSum / 3;

			// System.out.printf();
			String score = String.format("%05d:%d:%d:%d:%d:%06.2f\n",
					i + 1, intKor, intEng, intMath, intSum, floatAvg);
			outPut.print(score);

		}
		outPut.close();
		System.out.println("완료지롱");

	}
}
