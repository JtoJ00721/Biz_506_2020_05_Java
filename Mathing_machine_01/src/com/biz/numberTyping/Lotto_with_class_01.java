package com.biz.numberTyping;

import java.util.Random;

import com.biz.numberClassis.Lotto_bbobkkiy;
import com.biz.numberVO.LottoVO_01;

public class Lotto_with_class_01 {
	

	public static void maint(String []args) {
		
		Random rnd = new Random();
		LottoVO_01 numbering = new LottoVO_01();

		for(int i = 0;i<6;i++) {
			numbering.setNum(rnd.nextInt(30)+1);
		}
		
		
		Lotto_bbobkkiy bbob = new Lotto_bbobkkiy();
		
		bbob.fishing();
		
		
	}
	

}