package com.biz.student.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.student.domain.StudentVO;

public class StudentServiceImplV1 implements StudentService {

	// 필드변수
	// class Scope의 변수를 선언하기
	// 여기(필드변수 영역)에 선언된 변수는
	// 현재 클래스의 모든 method들이 공유하고, 참조(쓰기, 읽기)가 가능하다.

	// 변수의 Scope
	// 변수를 선언할때 어디에 선언하느냐에 따라
	// 변수를 참조할수 있느냐 없느냐가 결정된다

	// 필드변수를 선언할때 접근제한자를 public, private, protected중에 한가지로
	// 설정할수 있다.
	// 필드변수를 선언할때 가급적 public으로 선언하는 것은 지양(하지말기) 해야 한다.
	// 필드변수를 public으로 선언해 놓으면 외부에서 필드변수에 직접접근하여
	// 값을 변형시킬수 있다. 그러면 예기치 못한 결과를 얻을 수 있다.

	// 필드변수를 private으로 선언하는 것은
	// 객체의 정보은닉, 캡슐화 패턴에 적합한 방식이다
	// 외부에서 접근하지 못하도록 차단하고 현재 클래스에 선언된 method에서만
	// 접근을 허용하는 것이다.
	// 혹시 필드변수를 외부에서 접근할 필요가 있는 경우는 getter, setter를 만든다.

	// 필드변수를 protected로 선언하기
	// protected는 private접근제한자와 거의 유사한 형태이다
	// 만약 현재 클래스를 다른 클래스를 만들 때 상속(extends)하여 사용하려고 할때
	// 상속받은 클래스에서 현재 클래스의 필드변수를 같이 상속받아서 사용하고자 할때는
	// 변수를 protected로 선언한다.

	// 현재 클래스에서는 private처럼 작동하고
	// 상속받은 클래스에서도 마치 자신이 선언한 것처럼 사용할수 있게 된다.

	// 현재 클래스를 상속할 수 있도록 생각하고 구현을 한다면
	// 필드변수를 protected로 선언을 한다.

	// 만약 private로 선언을 하면 상속받은 클래스에서 이 변수들을
	// 다시 선언을 해주어야 한다.

	protected List<StudentVO> studentList;

	// 클래스 생성자
	// 클래스를 객체(인스턴스)로 만들때 호출되는 method
	// 클래스를 객체로 생성할때 1번 호출되는 method로 반드시 생성(초기화)가 필요한
	// 필드변수들을 여기에 생성하는 코드를 작성한다.
	public StudentServiceImplV1() {
		studentList = new ArrayList<StudentVO>();
	}

	@Override
	public boolean inputStudent() {
		StudentVO studentVO = new StudentVO();
		Scanner scan = new Scanner(System.in);

		System.out.println("프로그램 종료 코드 >>end<<\n\n");
		System.out.println("학번을 입력해 주세요");
		System.out.print(">>");
		String strNum = scan.nextLine();

		if (strNum.equals("end")) {
			return false;
		}
		studentVO.setNum(strNum);

		System.out.println("학생이름을 입력해 주세요");
		System.out.print(">>");
		String strName = scan.nextLine();
		studentVO.setName(strName);

		System.out.println("학년을 입력해 주세요(1 ~ 6까지의 숫자만)");
		System.out.print(">>");
		String strGrade = scan.nextLine();
		int intGrade = 0;
		
		// 유효성 검사
		// 현재 입력된 정보가 정상범위(Validate)에 있는지 검사하여
		// 데이터를 사용할지 말지를 결정하고 입력하는 사용자에게 통보하고 다른 행동을 취할수 있도록 하는것
		// 유효성검사는 개발자 입장에서는 무식한 노가다지만
		// 사용자입장에서는 유효성검사가 많으면 그만큼 잘못된 데이터를 입력하는 경우를 
		// 방지 할수 있다.
		try {
			intGrade = Integer.valueOf(strGrade);
		} catch (Exception e) {
			System.out.println("\n학년은 숫자만 입력해주세요 ><");
			System.out.println(studentVO.getName() + "입력이 처음부터 시작됩니다\n.");
			return true;
		}
		if (intGrade > 6 || intGrade < 1) {
			System.out.println("\n학년은 1 ~ 6범위만 입력해 주세요");
			System.out.println(studentVO.getName() + " 입력이 처음부터 시작됩니다\n.");
			return true;
		}
		studentVO.setGrade(intGrade);

		System.out.println("전공을 입력해 주세요");
		System.out.print(">>");
		String strDept = scan.nextLine();
		studentVO.setDept(strDept);

		// 모든 입력이 정상처리 되었으면
		// List에 학생정보를 추가한다.
		studentList.add(studentVO);

		// 제일 끝의 return문은 한 학생의 정보가 모두 정상 입력이 되면
		// true를 return하여 다음 학생 정보를 입력하도록
		// 호출한 곳에 통보(return)해야 하는데 이때 true를 return 하도록 해야 한다.
		return true;
	}

	@Override
	public void studentList() {

		System.out.println("===================================");
		System.out.println("\t  학생 관리 차트");
		System.out.println("-----------------------------------");
		System.out.println("학번\t이름\t학년\t전공");

		for (StudentVO sVO : studentList) {
			System.out.print(sVO.getNum() + "\t");
			System.out.print(sVO.getName() + "\t");
			System.out.print(sVO.getGrade() + "\t");
			System.out.println(sVO.getDept() + "\t");

		}
		System.out.println("===================================");
	}

}
