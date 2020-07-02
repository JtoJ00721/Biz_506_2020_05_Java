package com.biz.score;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.biz.score.service.ScoreService;
import com.biz.score.service.ScoreServiceImplV1;

public class ScoreEx_01 {

	public static void main(String[] args) {

		// interface를 implements하여 만들어진 클래스는
		// 선언을 할때는 interface로 선언을 하고
		// 초기화 할때는 실제 코드가 구현된 클래스로 최기화한다.
		ScoreService sService = new ScoreServiceImplV1();

		sService.inputScore();
		sService.calcSum();
		sService.calcAvg();
		sService.scoreList();

		/*
		 * List interface 는 ArrayList 클래스를 선언할때 implements한 주체이다 따라서 ArrayList 형
		 * 객체(인스턴스)를 만들때는 선언은 List로 하고, 초기화는 ArrayList로 수행한다.
		 */

		List<String> strList = new ArrayList<String>(); // 리스트 작성기능
		strList = new LinkedList<String>(); // 자료 검색기능 강화
		strList = new Vector<String>(); // 향상된 리스트

		ArrayList<String> strList1 = new ArrayList<String>(); // 둘다 쪽같은 소리하는건데 위의 것이 좋다

	}
}
