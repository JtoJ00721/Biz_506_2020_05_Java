package com.biz.classis;

import com.biz.classis.service.LineService;

public class ClassEx_07 {

	public static void main(String[] args) {

		LineService line = new LineService();
		
		System.out.println(line.do_line(30));
		System.out.println("성적일람표");
		System.out.println(line.single(30));
		System.out.println(90);
		System.out.println(90);
		System.out.println(90);
		System.out.println(line.do_line(30));
		System.out.println(270);
		
		
	}

}
