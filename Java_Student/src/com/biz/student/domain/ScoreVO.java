package com.biz.student.domain;

/*
 * VO클래스 작성
 * VO 클래스는 프로젝트에서 매우 중됴한 역할을 수행한다.
 * 프로젝트에서 어떤 데이터를 어떻게 취급할것인가를 먼저 팡가하고
 * 클래스를 작성한다.
 * 프로젝트에서 필요한 데이터항목이 누락되거나
 * 불필요한 항목이 추가되지 않도록 잘 설계를 해야 한다.
 */
public class ScoreVO {
	
	private String num;
	private int kor;
	private int eng;
	private int math;
	
	private int sum;
	private float avg;
	
	public String getNum() {
		return num;
	}
	public void setNum(String scores) {
		this.num = scores;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public float getAvg() {
		return avg;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
	
}
