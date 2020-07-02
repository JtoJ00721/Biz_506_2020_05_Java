package com.biz.adder.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.addr.domain.AddrVO;

public class AddrService01 {
	
	/*
	 * 현제 AddrService01 클래스를 선언하면서
	 * addrList 라는 필드면수를 선언 "만" 해 둔 상태
	 * 선언만 된 필드변수 중에 객체형태의 변수는
	 *  그 변수에 값을 ,저장, 추가 하려고 하면 NullpointExeption이 발생하면서
	 *  코드가 진행되지 않는다
	 *  
	 *  아래의 1부터 3까지의 방법으로 반드시 변수를 초기화 해주어야 한다.
	 *  1. 필드변수를 선언과 동시에 초기화
	 *  	(메모리 관리상 여러가지 문제를 일으킬수 있기 때문에 가급적 사용하지 않는다)
	 *  
	 *  2. 생성자를 이용하여 초기화 하기
	 *  	(가장 권장되는 방법)
	 *  
	 *  3. 사용하기 직전에 초기화 하기
	 *  	(별로 권장되지는 않음)
	 *  
	 *  객체형태의 변수란 클래스를 사용하여 선언된 변수들
	 *  (int, float, boolean, double 등 기본 형태의 변수 이외의 형태로 선언된 변수들)
	 *  
	 *  
	 */
	
	private List<AddrVO> addrList = new ArrayList<AddrVO>(); // 1. 필드변수를 선언과 동시에 초기화
	
	
	
	// 2. 생성자를 이용하여 필드변수를 초기화 하기
	// 클래스의 기본 생성자를 임의로 재 작성하기
	// 누군가 AddrService_01 클래스를 객체로 선언하고
	// 		초기화를 하기 위해 생성자를 호출하면
	// 		자동으로 addrList 필드변수가 초기화 되어
	//		이후의 코드에서 NullpointExeption이 발생하는 것을 방지한다.
	public AddrService01() {
		this.addrList = new ArrayList<AddrVO>();
	}
	
	/*
	 * 5명의 주소를 생성하여
	 * addrList에 추가
	 */
			
	public void makeAddr() {
		
		// 3. 사용하기 직전에 필드변수 초기화 하기
		// 		필드변수를 사용하기 직전에 초기화 하는 방식은 
		// 		유지보수가 어려워지는 코드가 된다.
		addrList = new ArrayList<AddrVO>();
		
		// 1명의 주소를 저장할 VO 객체(인스턴스)
		// AddrVO 클래스를 사용하여
		// addrVO 객체(인스턴스)를 선언
		// 생성자 method를 호출하여 객체를 초기화(사용가능하도록)한다.
		
		AddrVO addrVO = new AddrVO();
		
		addrVO.setName("농농이");
		addrVO.setTel("010-2222-콩콩콩콩");
		addrVO.setAddr("구대륙 중부");
		addrVO.setAge(18);
		addrVO.setNet("외전주인공");
		addrList.add(addrVO); // 새로 생성한 주소(VO)를 주소록(List)에 추가하기
		
		// 또한명의 주소를 저장할 VO객체 만들기
		// 이미 만들어진 addrVO를 재 정의 한다
		// 이미 주소를 담은 addrVO를 새롭게 재 정의하여
		// 저장공간을 비워주는 실행을 한다.
		
		addrVO = new AddrVO(); // 이전에 만들어진 객체(인스턴스)를 재활용하기 위해서는 반드시 다시 생성한다.
		
		addrVO.setName("선생");
		addrVO.setTel("010-3038-4785");
		addrVO.setAddr("조롱이마을");
		addrVO.setAge(37);
		addrVO.setNet("주인공");
		addrList.add(addrVO);
		
		addrVO = new AddrVO(); // 또 털어주기
		
		addrVO.setName("토니 아이오미");
		addrVO.setTel("010-7364");
		addrVO.setAddr("영국");
		addrVO.setAge(72);
		addrVO.setNet("메탈 창시자");
		addrList.add(addrVO);
		
		addrVO = new AddrVO();
		
		addrVO.setName("로니 제임스 디오");
		addrVO.setTel("100-4444");
		addrVO.setAddr("미국");
		addrVO.setAge(78);
		addrVO.setNet("메탈왕");
		addrList.add(addrVO);
		
		addrVO = new AddrVO();
		
		addrVO.setName("앵거스 영");
		addrVO.setTel("010-6676");
		addrVO.setAddr("호주");
		addrVO.setAge(65);
		addrVO.setNet("기타지랄 원조");
		addrList.add(addrVO);
		
		
		addrVO = new AddrVO("농농이","010-2222-콩콩콩콩", "구대륙",37,"외전주인공");
		addrList.add(addrVO);
		
		addrVO = new AddrVO("선생","010-3038-4785", "조롱이마을",18,"주인공");
		addrList.add(addrVO);
		
		addrVO = new AddrVO("농농이","010-2222-콩콩콩콩", "구대륙",18,"외전주인공");
		addrList.add(addrVO);
		
		addrVO = new AddrVO("농농이","010-2222-콩콩콩콩", "구대륙",18,"외전주인공");
		addrList.add(addrVO);
		
		addrVO = new AddrVO("농농이","010-2222-콩콩콩콩", "구대륙",18,"외전주인공");
		addrList.add(addrVO);
		
		addrVO = new AddrVO("빙빙이","010-888-8888");
		addrVO.setAge(20);
		addrList.add(addrVO);
		
		
	}
	
	public void addrList() {
		System.out.println("============================================================");
		System.out.println("주소록");
		System.out.println("------------------------------------------------------------");
		System.out.println("이름\t전화번호\t주소\t나이\t관계");
		System.out.println("------------------------------------------------------------");
		
		// i < 5 로 설정을 하게되면
		// 5명의 주소록을 표시할 때는 문제가 없으나
		// 만약 주소록의 데이터의 개수가 변경되면 문제가 발생한다
		// addList의 개수를 별도의 변수에 담고
		int addrSize = addrList.size();
		
		// 개수만큼 반복문을 수행하도록 변경
		for(int i = 0; i < addrSize; i++) {
			AddrVO vo = addrList.get(i);
			System.out.print(vo.getName());
			System.out.print(vo.getTel());
			System.out.print(vo.getAddr());
			System.out.print(vo.getAge());
			System.out.print(vo.getNet());
			System.out.println();
			System.out.println("------------------------------------------------------------");
			System.out.println();
		}
	}
	
	
			
}
