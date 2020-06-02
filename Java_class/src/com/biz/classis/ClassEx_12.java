package com.biz.classis;

import com.biz.classes.model.BankVO;
import com.biz.classis.service.BankServiceV2;

public class ClassEx_12 {

	public static void main(String[] args) {
		
		BankVO[] bankList = new BankVO[5];
		
		BankServiceV2 serv = new BankServiceV2();
		
		serv.bankList();
		
		serv.bankList(bankList);
		
		
	}

}
