package naver;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NaverMovie {
	public static void main(String[] args) throws IOException {
		int cnt = 0;
		int page = 1;
		String prePage = "";

		while (true) {

			String url = "https://movie.naver.com/movie/bi/mi/pointWriteFormList.nhn?code=189633&type=after&isActualPointWriteExecute=false&isMileageSubscriptionAlready=false&isMileageSubscriptionReject=false&page="
					+ page;

			Document doc = Jsoup.connect(url).get();

			Elements movieList = doc.select("div.score_result li");
			String nowPage = doc.select("input#page").attr("value");

			if (nowPage.equals(prePage)) {
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("댓글 총" + cnt + "건");
				System.out.println("다 수집했지롱");
				break;
			} else {
				prePage = nowPage;
			}

			for (Element one : movieList) {

				int score = 0;
				String contents = "";
				String forWriter = "";
				String forwritedate = "";
				String writedate = "";
				String writer = "";

				score = Integer.parseInt(one.select("div.star_score > em").text());
				contents = one.select("div.score_reple > p").text();

				forWriter = one.select("div.score_reple > dl > dt > em > a > span").text();
				forwritedate = one.select("div.score_reple > dl > dt > em").text();

				if (forwritedate.contains(")")) {
					String cutdate = forwritedate.substring(forwritedate.lastIndexOf(")") + 2, forwritedate.length());
					writedate = cutdate;
				} else {
					writedate = "없음";
				}

				if (forWriter.contains("(")) {
					String cutWrit = forWriter.substring(0, forWriter.lastIndexOf("("));
					writer = cutWrit;
				} else {
					writer = forWriter;
				}

				System.out.println("=============================================================================");
				System.out.println("평점 : " + score);
				System.out.println(contents);
				System.out.println("작성자 : " + writer);
				System.out.println("작성날짜 : " + writedate);
				cnt++;

			}
			page++;

		}

	}
}
