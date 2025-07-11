package p103;

import java.util.Scanner;

public class CoffeePrice {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("무슨 커피를 드릴까요 ? ");
		
		String order = scanner.next(); //주문 읽기
		
		int price = 0;
		
		switch (order) {
		case "에스프레소" :
		case "카푸치노" :
		case "카페라떼" :
			price = 3500; break;
		case "아메리카노" :
			price = 2000; break;
			default : System.out.print("메뉴에 존재하지않습니다");
		}

		if (price != 0 ) {
			System.out.println(order + "가격은" + price + "원입니다.");
			scanner.close();
		}
	}

}
