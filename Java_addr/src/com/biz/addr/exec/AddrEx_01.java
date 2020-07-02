package com.biz.addr.exec;

import com.biz.adder.service.AddrService01;

public class AddrEx_01 {
	public static void main(String[] args) {
		AddrService01 addrService = new AddrService01();

		addrService.makeAddr(); // 주소록 생성

		addrService.addrList(); // 주소록 출력

	}

}
