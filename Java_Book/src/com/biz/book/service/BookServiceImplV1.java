package com.biz.book.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.book.domain.BookVO;

/*
 * BookService interface를 implements하여 작성
 * 구체적인 method의 코드를 작성해야 한다.
 * interface를 implements하면 interface에 정의된 method를 
 * 모두 Override하여 구현해야 하는 규칙이 적용이된다.
 * 
 * implements를 수행한 다음에는 반드시 
 * add unimplemented method를 실행하여야 한다.
 */
public class BookServiceImplV1 implements BookService {

	List<BookVO> books;
	 public BookServiceImplV1() {
		 books = new ArrayList<BookVO>();
	}
	
	@Override
	public boolean inputBook() {
		// inputBook() method 내에서만 Scanner를 사용하게 될것으로 예상되므로
		// 필드변수에 선언하지 않고
		// method의 지역변수로 선언, 초기화를 수행
		// method의 지역변수로 선언을 하면 inputBook() method의 수행이 끝나면
		// 변수가 자동으로 해제되는 효과를 낼수 있다.
		Scanner scan = new Scanner(System.in);
		BookVO bVO = new BookVO();
		
		int intYear = 0;
		int intPrice = 0;
		
		System.out.println("프로그램 정지 코드(제목칸에) : end");
		System.out.println();
		System.out.println();
		System.out.print("제목 입력 >>");
		String strTitile = scan.nextLine();
		if(strTitile.equals("end")) {
			return false;
		}
		bVO.setTitle(strTitile);
		
		System.out.print("출판사 입력 >>");
		String strComp = scan.nextLine();
		bVO.setComp(strComp);
		
		System.out.println("저자 입력 >>");
		String strWriter = scan.nextLine();
		bVO.setWriter(strWriter);
		
		System.out.println("출판 연도 입력(숫자만) >>");
		String strYear = scan.nextLine();
		try {
			intYear = Integer.valueOf(strYear);
		} catch (Exception e) {
			/*
			 * 만약 문자열로 잘못입력해서 오류가 발생할 경우
			 * 현재 입력하고 있는 도서정보를 도서명부터 다시 입력하도록
			 */
			System.out.println();
			System.out.println("연도는 숫자로만 입력 가능합니다");
			System.out.println("띄어쓰기 특수문자도 안되지롱 ><");
			System.out.println(bVO.getTitle() + "도서정보부터 다시 입력하세요");
			return true;
		} 
		bVO.setYear(intYear);
		
		System.out.println("책 가격 입력(숫자만) >>");
		String strPrice  = scan.nextLine();
		try {
			intPrice = Integer.valueOf(strPrice);
		} catch (Exception e) {
			System.out.println();
			System.out.println("숫자만 입력해 주세요! ><");
			System.out.println(bVO.getTitle() + "도서정보부터 다시 입력하세요");
			return true;
		}
		
		/*
		 * books.add(BookVO) 코드가 실행되기 전에
		 * return true 를 수행하면
		 * 현재 method가 실해되면서 입력했던
		 * 도서정보(도서병, 출판사 등) 들이 아직 리스트에 추가되기 전이므로
		 * 현제의 입력된 도서정보는 모두 무시되어 버린다
		 * main에서는 true가 return 되었으므로
		 * 아무런 판단없이 다시 입력을 수행하는 inputBook() method를 
		 * 호출하게 될 것이고
		 * 
		 * return하기전에 현재 도서를 다시 입력하라는 메시지를 
		 * 보여주었으므로
		 * 입력하는 사용자는 당연히 현재 입력하던 도서를
		 * 다시 입력하게 될 것이다.
		 */
		bVO.setPrice(intPrice);
		books.add(bVO);
		
		// 모든 항목이 입력이 완료되고 다음 도서정보를 입력받겠다
		// 라는 신호를 호출한곳에 return(알림)
		return true;
	}

	@Override
	public void bookList() {
		
		
		System.out.println("===============================================");
		System.out.println("\t\t구매한 도서 목록");
		System.out.println("===============================================");
		
		for(BookVO bVO : books) {
			System.out.println("-----------------------------------------------");
			System.out.println("제목\t출판사\t저자\t출판연도\t가격");
			System.out.print(bVO.getTitle() + "\t");
			System.out.print(bVO.getComp() + "\t");
			System.out.print(bVO.getWriter() + "\t");
			System.out.print(bVO.getYear() + "\t\t");
			System.out.println(bVO.getPrice() + "\t");
		}
		
		
		
		
	}
	
}
