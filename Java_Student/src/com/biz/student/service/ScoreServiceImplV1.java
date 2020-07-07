package com.biz.student.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import com.biz.student.config.SplitPos;
import com.biz.student.domain.ScoreVO;
import com.biz.student.domain.StudentVO;

public class ScoreServiceImplV1 implements ScoreService {

	ScoreVO scoreVO;

	protected List<StudentVO> studentList;
	protected List<ScoreVO> scoreList;

	protected PrintStream outPut;

	public ScoreServiceImplV1() {
		scoreVO = new ScoreVO();
		studentList = new ArrayList<StudentVO>();
		scoreList = new ArrayList<ScoreVO>();
	}

	@Override
	public void inputStudent() {
		String studentFile = "src/com/biz/student/exec/students.txt";

		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			// 읽어들일 파일을 열고, 파일에 관련된 정보를 fileReader 객체에 저장
			fileReader = new FileReader(studentFile);

			buffer = new BufferedReader(fileReader);

			String reader = "";

			while (true) {

				reader = buffer.readLine();
				if (reader == null) {
					break;
				}
				// System.out.println(reader);

				// 읽어들인 라인을 분해하여 학생정보로 변환
				String[] students = reader.split(":");

				StudentVO sVO = new StudentVO();
				sVO.setNum(students[  SplitPos.STUDENT.ST_NUM  ]);
				sVO.setName(students[SplitPos.STUDENT.ST_NAME]);
				sVO.setGrade(Integer.valueOf(students[SplitPos.STUDENT.ST_GRADE]));
				sVO.setDept(students[SplitPos.STUDENT.ST_DEPT]);
				studentList.add(sVO);

			}

			// 파일을 읽기 쓰기로 열었으면 모두 닫아서 종료해주어야 한다.
			buffer.close();
			fileReader.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("학번을 숫자화 하는데 문제 발생!!");
		} catch (IOException e) {
			e.printStackTrace();
		} 


	}

	@Override
	public void inputScore() {
		String scoreFile = "src/com/biz/student/exec/score.txt";

		FileReader fileReader = null;

		BufferedReader buffer = null;

		try {
			// 읽어들일 파일을 열고, 파일에 관련된 정보를 fileReader 객체에 저장
			fileReader = new FileReader(scoreFile);

			buffer = new BufferedReader(fileReader);

			String reader = "";

			while (true) {

				reader = buffer.readLine();
				if (reader == null) {
					break;
				}
				// System.out.println(reader);

				// 읽어들인 라인을 분해하여 점수정보로 변환
				String[] scores = reader.split(":");
				
				ScoreVO sVO = new ScoreVO();

				sVO.setNum(scores[SplitPos.SCORE.SC_NUM]);
				sVO.setKor(Integer.valueOf(scores[SplitPos.SCORE.SC_KOR]));
				sVO.setEng(Integer.valueOf(scores[SplitPos.SCORE.SC_ENG]));
				sVO.setMath(Integer.valueOf(scores[SplitPos.SCORE.SC_MATH]));
				scoreList.add(sVO);

			}

			// 파일을 읽기 쓰기로 열었으면 모두 닫아서 종료해주어야 한다.
			buffer.close();
			fileReader.close();

		} catch (FileNotFoundException e) {
			System.out.println(scoreFile + "open중에 오류 발생!!");
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("점수를 숫자로 바꾸는 과정에서 오류 발생");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("버퍼로부터 데이터를 읽는데 문제 발생!!");
		}


	}

	@Override
	public void calcSum() {

		
		for(ScoreVO sVo : scoreList) {
			int sum = sVo.getKor();
			sum += sVo.getEng();
			sum += sVo.getMath();
			sVo.setSum(sum);
		}

	}

	@Override
	public void calcAvg() {

		for(ScoreVO aVo : scoreList) {
			float avg = (float) aVo.getSum() / 3;
			aVo.setAvg(avg);
		}

	}

	@Override
	public void scoreList() {
		System.out.println("==========================================================");
		System.out.println("\t\t\t성적일람표");
		System.out.println("==========================================================");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------------------------------");
		int size = scoreList.size();
		for (ScoreVO sVO : scoreList) {

			System.out.print(sVO.getNum() + "\t");

			// data의 join
			// scoreList, studentList Join해서 데이터를 출력하는 코드
			for(StudentVO stVO : studentList) {
				if(sVO.getNum().equals(stVO.getNum())){
					System.out.println(stVO.getName() + "\t");
					break;
				}
			}
			System.out.print(scoreVO.getKor() + "\t");
			System.out.print(scoreVO.getEng() + "\t");
			System.out.print(scoreVO.getMath() + "\t");
			System.out.print(scoreVO.getSum() + "\t");
			System.out.printf("%5.2f\n",scoreVO.getAvg());

		}
		System.out.println("==========================================================");
		

	}

}
