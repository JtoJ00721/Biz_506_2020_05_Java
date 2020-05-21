package com.biz.hello;

public class VarBoolean_01 {

	public static void main(String[] args) {

		int bbong = 6974;
		
		boolean hoongyee = (bbong % 2 == 0);
		
		if(hoongyee) {
		
		System.out.println(bbong + "은 짝수입니다");
		}
		
		if(!hoongyee) {
			
			System.out.println(bbong + "은 짝수가 아닙니다");
			
		}
	}

}
