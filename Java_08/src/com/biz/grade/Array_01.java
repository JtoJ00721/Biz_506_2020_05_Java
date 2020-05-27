package com.biz.grade;

import java.util.Random;

public class Array_01 {

	public static void main(String[] args) {

		
		//20개의 저장공간을 가진 변수를 선언
		//integer 형 배열 20개씩을 선언 : 20개의 저장공간을 가진 변수
		// intKor이라는 배열을 20(개의 저장 공간)갖는 integer형 배열을 생성
		int[] intKor = new int[20];
		int[] intEng = new int[20];
		int[] intMath = new int[20];
		int[] intMusic = new int[20];

		//과목별로 총점을 계산하여 보관할 변수를 선언
		int intSum_01 = 0;
		int intSum_02 = 0;
		int intNum_01 = 0;
		int intNum_02 = 0;
		int intNum_03 = 0;
		int intNum_04 = 0;

		//임의 숫자를 사용하기 위한 도구를 선언하기
		//Random 클래스를 이용해서 rnd 라는 변수(도구)를 선언하고
		// new Random() 초기화 코드를 사용해서 사용준비
		Random rnd = new Random();
		
		//이 명령코드가 실행될때마다 0~99 임의 정수를 만든다.
		// rnd.nextInt(100);
		
		/*
		 * 위에서 생성한 4개의 배열에 각각 20개의 점수를 할당하기 위해
		 * 배열의 개수만큼 반복문을 실행하고
		 * 반복문이 실행되면서 만들어지는 i변수의 값을 각 배열의 index로 주입하여
		 * 배열[0] ~ 배열[19]까지의 저장공간에 값을 할당하기 위해 시작하는 반복문코드
		 * intKor[0] ~ intKor[19], intEng[0] ~ intEng[19] .....
		 * 이러한 위치가 지정된 변수에 임의 정수값을 생성하여 할당한다
		 * 성적처리를 테스트하기 위한 임의 점수를 만들어서 배열에 저장하는 코드
		 */
		for (int i = 0; i < 20; i++) {
		intKor[i] = rnd.nextInt(50)+ 51;
		intEng[i] = rnd.nextInt(50)+ 51;
		intMath[i] = rnd.nextInt(50)+ 51;
		intMusic[i] = rnd.nextInt(50)+ 51;
		
		intSum_01 = intKor[i]+intEng[i]+intMath[i]+intMusic[i];
		
		intSum_02 = intSum_01/4;
		
		intNum_01 += intKor[i];
		intNum_02 += intEng[i];
		intNum_03 += intMath[i];
		intNum_04 += intMusic[i];
		
		System.out.println(i+"번 학생 점수총점 : "+intSum_01);
		System.out.println(i+"번 학생 점수평균 : "+intSum_02);
		System.out.println();
		System.out.println("-------------------------------");
		
		}
		
		//과목별로 총점을 계산하여 보관할 변수를 선언
		System.out.println();
		System.out.println("==============================");
		System.out.println();
		System.out.println("국어총점 : "+intNum_01);
		System.out.println("영어총점 : "+intNum_02);
		System.out.println("수학총점 : "+intNum_03);
		System.out.println("음악총점 : "+intNum_04);
		
		
		System.out.println();
		System.out.println("==============================");
		System.out.println();
		
		System.out.println("국어평균 : "+intNum_01/20);
		System.out.println("영어평균 : "+intNum_02/20);
		System.out.println("수학평균 : "+intNum_03/20);
		System.out.println("음악평균 : "+intNum_04/20);

		System.out.println("국\t\t영\t\t수\t\t음\t\t총");
		
		/*
		 * 1. 20명 학생의 국어, 영어, 수학, 음악점수를 저장하기 위한 배열선언
		 * 2. 각 배열에 51~100 점의 점수를 생성하여 저장
		 * 3. 각 학생의 점수총점, 평균을 계산하고
		 * 4. 과목별 점수총점, 평균을 계산하여
		 * 5. 성적 리스트를 Console에 표시하시오
		 */

	}

}
