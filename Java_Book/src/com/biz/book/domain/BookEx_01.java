package com.biz.book.domain;

import com.biz.book.service.BookService;
import com.biz.book.service.BookServiceImplV1;

public class BookEx_01 {

	public static void main(String[] args) {
		
		BookService bService = new BookServiceImplV1();
				while(true) {
					if(!bService.inputBook()) {
						break;
					}
				}
				
				System.out.println();
				System.out.println();
				
				bService.bookList();
				
				System.out.println();
				System.out.println("입력이 끝났지롱");
			
		
		
	}
}
