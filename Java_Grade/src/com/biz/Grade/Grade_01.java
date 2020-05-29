package com.biz.Grade;

/*
 * 학생20명 과목 5과목의 성적처리
 */

import java.util.Random;

public class Grade_01 {

	public static void main(String[] args) {

		// 임의의 점수를 만들기 위한 도구 생성
		Random rnd = new Random();
		int count = 20;

		// count 만큼의 배열을 생성
		// 과목수 만큼 생성
		int[] kor = new int[count];
		int[] eng = new int[count];
		int[] mat = new int[count];
		int[] mus = new int[count];
		int[] art = new int[count];

		// 학생들의 점수를 임의 생성하여 배열에 저장
		for (int i = 0; i < count; i++) {
			kor[i] = rnd.nextInt(51) + 50;
			eng[i] = rnd.nextInt(51) + 50;
			mat[i] = rnd.nextInt(51) + 50;
			mus[i] = rnd.nextInt(51) + 50;
			art[i] = rnd.nextInt(51) + 50;
		}

		// 학생별 총점, 평균 계산

		// 학생별 총점, 평균을 계산하여 저장할 배열 추가 생성
		int[] sum = new int[count];
		int[] avg = new int[count];

		// 각 학생의 총점, 평균을 계산하여 sum, sum에 저장
		for (int i = 0; i < count; i++) {

			sum[i] += kor[i];
			sum[i] += eng[i];
			sum[i] += mat[i];
			sum[i] += mus[i];
			sum[i] += art[i];

			avg[i] = sum[i] / 5;

		}

		// 과목별 총점, 평균 게산
		int korsum = 0;
		int engsum = 0;
		int matsum = 0;
		int mussum = 0;
		int artsum = 0;

		// 20명 학생의 과목별 총점
		for (int i = 0; i < count; i++) {
			korsum += kor[i];
			engsum += eng[i];
			matsum += mat[i];
			mussum += mus[i];
			artsum += art[i];
		}
		System.out.println("======================================================================================");
		System.out.println("학생 성적 일람표");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("학번\t국어\t영어\t수학\t음악\t미술\t총점\t평균");
		System.out.println("--------------------------------------------------------------------------------------");

		for (int i = 0; i < count; i++) {

			System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\n", (i + 1), kor[i], eng[i], mat[i], mus[i], art[i],
					sum[i], avg[i]);
		}
		// printf에서 format기호
		// %d : (Deciaml) 정수, 십진수 등을 표현하는 기호
		// %s : (String) 문자열을 표현하는 기호
		// %c :(Charactor) 문자를 표현하는 기호
		// \t : tab(8칸) 만큼 빈칸을 만들어라
		// \n : Enter를 누른것처럼 줄바꿈을 하여라
		System.out.println("--------------------------------------------------------------------------------------");
		int total = korsum + engsum + matsum + mussum + artsum;
		int totalsum = total / 20;
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\n", "총점", korsum, engsum, matsum, mussum, artsum);
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\n", "평균", korsum / count, engsum / count, matsum / count,
				mussum / count, artsum / count);
		System.out.println("전과목 총합평균 : "+ totalsum);

	}

}
