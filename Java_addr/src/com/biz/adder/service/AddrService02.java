package com.biz.adder.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.addr.domain.AddrVO;

public class AddrService02 {

	private List<AddrVO> addrList;
	// Scanner 와 같은 유형의 클래스는 System의 resource를 사용하므로
	// 신중하게 사용하는 것이 좋다.
	// resource 클래스이 경우는 가급적 필드영역에서 직접 초기화 하지 말고
	// 생성자 method에서 초기화를 시키는 것이 좋다.
	// 필드영역에서 초기화된 객체들은 현제 클래스의 인스턴스가 만료되어도
	// GC가 작동될때까지 메모리에 남아있는 경우가 있다.

	private Scanner scan; // = new Scanner(System.in);

	// 생성자에서 초기화된 객체는 현제 클래스의 인스턴스의 수명과 같다.
	// 즉 현재 클래스르 사용하여 생성된 인스턴스가 사용이 만료되면
	// 생성자에서 초기화된 객체들도 같이 만료(소멸)된다.
	public AddrService02() {
		addrList = new ArrayList<AddrVO>();
		scan = new Scanner(System.in);
	}

	// 키보드를 통해서 주소를 입력받고
	// 입력된 주소를 addrList에 저장
	public void inputAddr() {
		
		System.out.print("이름 >> ");
		String strName = scan.nextLine();

		System.out.print("전화번호 >> ");
		String strTel = scan.nextLine();

		System.out.print("주소 >> ");
		String strAddr = scan.nextLine();

		System.out.print("나이 >> ");
		String strAge = scan.nextLine();

		int intAge = 0;
		try {
			intAge = Integer.valueOf(strAge);

		} catch (Exception e) {
			System.out.println("나이는 숫자만 입력가능합니다");
			System.out.println("입력이 잘못되어 0으로 입시저장합니다");
		}

		System.out.print("관계 >> ");
		String strNet = scan.nextLine();

		AddrVO addrVO = new AddrVO();
		addrVO.setName(strName);
		addrVO.setTel(strTel);
		addrVO.setAddr(strAddr);
		addrVO.setAge(intAge);
		addrVO.setNet(strNet);
		addrList.add(addrVO);

	}

}
