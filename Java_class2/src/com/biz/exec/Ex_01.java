package com.biz.exec;

import com.biz.model.AddressVO;

public class Ex_01 {
	
	//컨트롤 f11번을 사용해서 런 하려면 메인 메서드 있어야함
	public static void main(String[] args) {
		AddressVO address1 = new AddressVO();
		AddressVO address2 = new AddressVO();
		AddressVO address3 = new AddressVO();
		
		address1.setName("홍길동");
		address1.setAddr("광주광역시");
		address1.setAge(27);
		address1.setTel("062-111");
		
		address2.setName("용개");
		address2.setAddr("언더시티");
		address2.setAge(1000);
		address2.setTel("010-444");
		
		address3.setName("농농이");
		address3.setAddr("구대륙");
		address3.setAge(19);
		address3.setTel("010-콩콩콩");
		
		String addr1 = address1.getAddr();
		String addr2 = address2.getAddr();
		String addr3 = address3.getAddr();
		System.out.println(addr1);
		System.out.println(addr2);
		System.out.println(addr3);
		
		System.out.println(address1.getTel());
		System.out.println(address2.getName());
		System.out.println(address3.getTel());
		
		
		
		
		
	}
	
}
