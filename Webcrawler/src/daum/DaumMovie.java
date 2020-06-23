package daum;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class DaumMovie {
	public static void main(String[] args) throws IOException {
		int cnt = 0;
		int page = 1;
		String prePage = "";

		while (true) {
			String url = "https://movie.daum.net/moviedb/grade?movieId=134684&type=netizen&page=" + page;

			Document doc = Jsoup.connect(url).get();
			Elements one = doc.select("div.review_info");
			
			for (int i = 0; i < one.size(); i++) {

				int score = 0;
				String contents = "";
				String forWriter = "";
				String forwritedate = "";
				String writedate = "";
				String writer = "";
				
				writer = one.select("p.desc_review").text();
				System.out.println(writer);
			}
			
			
		}
		
		
		
		
		
		
		
		

	}

}
