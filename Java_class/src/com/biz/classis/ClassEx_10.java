package com.biz.classis;

import com.biz.classis.model.BookVO;
import com.biz.classis.service.BookService;

public class ClassEx_10 {

	public static void main(String[] args) {

		//BookVO클래스를 이용하여
		//booklist 인스턴스 배열을 3개 선언
		BookVO[] booklist = new BookVO[3];
		
		//인스턴스 배열은 사용전에 각각 요소들을 
		// 한번더 생성해주는 코드가 필요하다.
		
		booklist[0] = new BookVO();
		booklist[1] = new BookVO();
		booklist[2] = new BookVO();
		
		booklist[0].isbn = "001";
		booklist[1].isbn = "111";
		booklist[2].isbn = "101";
		
		booklist[0].title = "자바입문";
		booklist[0].title = "자바의 정석";
		booklist[0].title = "오라클 입문";
		
		booklist[0].auth = "박은종";
		booklist[0].auth = "남궁성";
		booklist[0].auth = "정재훈";
		
		booklist[0].comp = "이지퍼블리싱";
		booklist[0].comp = "도우출판";
		booklist[0].comp = "한빛";
		
		booklist[0].price = 35000;
		booklist[0].price = 30000;
		booklist[0].price = 100;
		
		BookService bookService = new BookService();
		
		bookService.bookInfo(booklist[0]);
		bookService.bookInfo(booklist[1]);
		bookService.bookInfo(booklist[2]);
		
		bookservice.booklist(BookVO[] booklist);
		
		
	}

}
