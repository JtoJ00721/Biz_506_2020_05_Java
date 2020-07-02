package daum;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class DaumMovie {
	public static void main(String[] args) throws IOException {
		int page = 1;
		int cnt = 0;

		while (true) {
			String url = "https://movie.daum.net/moviedb/grade?movieId=134684&type=netizen&page=" + page;

			Document doc = Jsoup.connect(url).get();
			Elements movieList = doc.select("div.review_info");
			
			if(movieList.size() == 0) {
				break;
			}

			for (Element one : movieList) {

				int score = 0;
				String contents = "";
				String writedate = "";
				String writer = "";

				writer = one.select("em.link_profile").text();
				score = Integer.parseInt(one.select("em.emph_grade").text());
				contents = one.select("p.desc_review").text();
				writedate = one.select("span.info_append").text().substring(0, 10);

				System.out.println("=====================================================");
				System.out.println("별점 : " + score);
				System.out.println("작성자 : " + writer + "\n");
				if (contents.length() == 0) {
					System.out.println(">>>>>>>리뷰 없음<<<<<<<\n");
				} else {
					System.out.println(contents + "\n");
				}
				System.out.println("작성날짜 : " + writedate);
				cnt++;

			}

			page++;
		}
		System.out.println("댓글 "+cnt + "개 수집했지롱");

	}

}
