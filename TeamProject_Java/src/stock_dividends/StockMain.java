package stock_dividends;

public class StockMain {

	public static void main(String[] args) {

		// StockAPI 객체 생성
		StockAPI stockapi = new StockAPI();

		// 배당일
		// stockapi.getApi("cashDvdnPayDt").stream().forEach(System.out:: println);

		// 배당금 * 주식 수로 얼마 받았을까 생각할 수 있다.
		stockapi.getApi("stckGenrDvdnAmt").stream()
		.map(e -> Integer.parseInt(e) * 100)
		.forEach(System.out::println);

	} // main
} // class
