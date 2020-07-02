package com.biz.score;

/*
 * 성적처리 과정에서 1학생의 성적을 담든
 * Object변수
 * Value Object 클래스 라고한다.
 * VO, DTO 클래스들을 domain 클래스라고 한다.
 * 
 * 필드변수를 private로 설정하고
 * 필드변수에 접근(값을 저장, 읽기) getter, setter를 선언
 * 
 * 이런 방식으로 클래스를 정의하는 것을 정보은닉, 캡슐화 라고한다.
 */
public class ScoreVO {
	private int stuNum;
	private int kor;
	private int eng;
	private int math;
	private int allScore;
	private float avg;

	public int getStuNum() {
		return stuNum;
	}

	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}

	public int getKor() {
		return kor;
	}

	// 정보의 유효성검사
	// 현재 국어점수 필드에 저장하려고 하는 값이 유효한 값인가를 검사
	// 성적은 0~100까지가 기본값인데
	// 만약에 성적을 0 미만, 100 초과 된 값을 저장하려고 하면
	// 거부하도록 setKor() 변경
	public boolean setKor(int kor) {

		if (kor < 0 || kor > 100) {
			return false;
		}

		this.kor = kor;
		return true;
	}

	public int getEng() {
		return eng;
	}

	public boolean setEng(int eng) {

		if (eng < 0 || eng > 100) {
			return false;
		}

		this.eng = eng;
		return true;
	}

	public int getMath() {
		return math;
	}

	public boolean setMath(int math) {

		if (math < 0 || math > 100) {
			return false;
		}
		this.math = math;
		return true;
	}

	public int getAllScore() {
		return allScore;
	}

	public void setAllScore(int allScore) {
		this.allScore = allScore;
	}

	public float getAvg() {
		return avg;
	}

	public void setAvg(float avg) {
		this.avg = avg;
	}

}
