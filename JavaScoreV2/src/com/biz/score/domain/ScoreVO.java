package com.biz.score.domain;

public class ScoreVO {

	private int num;
	private int kor;
	private int eng;
	private int math;

	private int sum;
	private float avg;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getKor() {
		return kor;
	}

	public boolean setKor(int kor) {
		if (kor > 100 || kor < 0) {
			return false;
		}
		this.kor = kor;
		return true;

	}

	public int getEng() {
		return eng;
	}

	public boolean setEng(int eng) {
		if (eng > 100 || eng < 0) {
			return false;
		}
		this.eng = eng;
		return true;
	}

	public int getMath() {
		return math;
	}

	public boolean setMath(int math) {
		if (math > 100 || math < 0) {
			return false;
		}
		this.math = math;
		return true;
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
