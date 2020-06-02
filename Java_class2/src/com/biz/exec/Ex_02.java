package com.biz.exec;

import com.biz.model.AddressVO;
import com.biz.service.AddrServiceV1;

public class Ex_02 {
	public static void main(String[] args) {
		
		AddressVO[] address = new AddressVO[5];
		
		
		//반드시 일일히 초기화 해줘야 하는데....
		
		//address[0] = new AddressVO();
		//address[1] = new AddressVO();
		//address[2] = new AddressVO();
		//address[3] = new AddressVO();
		//address[4] = new AddressVO();
		
		//위는 길다!
		
		for(int i = 0;i<address.length;i++) {
			address[i] = new AddressVO();
		}
			
			address[0].setName("농농이");
			address[1].setName("빙빙이");
			address[2].setName("Tim");
			address[3].setName("아일러스");
			address[4].setName("쩔쩔이");
			
			address[0].setAddr("구대륙동쪽");
			address[1].setAddr("구대륙서쪽");
			address[2].setAddr("구대륙어딘가");
			address[3].setAddr("정거장V3");
			address[4].setAddr("광주광역시");
			
			address[0].setAge(19);
			address[1].setAge(20);
			address[2].setAge(68);
			address[3].setAge(17);
			address[4].setAge(20);
			
			address[0].setTel("010-콩콩콩");
			address[1].setTel("010-뽕뽕뽕");
			address[2].setTel("010-팀팀팀");
			address[3].setTel("1011001");
			address[4].setTel("010-4038");
			
			
//			for(int i =0;i<5;i++) {
//				System.out.println(address[i].getName());
//				System.out.println(address[i].getAddr());
//				System.out.println(address[i].getAge());
//				System.out.println(address[i].getTel());
//				System.out.println();
//				
//			}
		AddrServiceV1  serv = new AddrServiceV1();
		//배열을 매개변수를 통해 메서드에세 전달할때는 이름만 붙여주면 된다.
		serv.addrList(address);
		
		
		
	}
	
}
