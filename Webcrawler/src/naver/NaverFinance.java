package naver;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NaverFinance {
	static String base = "https://finance.naver.com/item/frgn.nhn?code=005930&page=1";

	public static void main(String[] args) throws IOException {
		// base 사이트로 가서 전체 페이지의 소스코드를 가져옴
		Document doc = Jsoup.connect(base).get();

		Elements line = doc.select("table.type2 > tbody > tr");
		System.out.println(line.size());

		for (Element element : line) {
			Elements tds = element.select("td");

			if (tds.size() == 9) {

				System.out.println("================================================================");
				System.out.println("날짜 : " + tds.get(0).text());
				System.out.println("종가 : " + tds.get(1).text());
				System.out.println("전일비 : " + tds.get(2).text());
				System.out.println("등락률 : " + tds.get(3).text());
				System.out.println("거래량 : " + tds.get(4).text());
				System.out.println("기관 순매매량 : " + tds.get(5).text());
				System.out.println("외국인 순매매량 : " + tds.get(6).text());
				System.out.println("외국인 보유주수 : " + tds.get(7).text());
				System.out.println("외국인 보유율 : " + tds.get(8).text());
				
				
				

			}

		}

	}

}
