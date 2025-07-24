package test5;

class Apple {
	private String country;
	private int price;

	@Override
	public String toString() {
		return "Apple [country=" + country + ", price=" + price + "]";
	}

	public Apple(String country, int price) { //생성자 초기화
		super();
		this.country = country;
		this.price = price;
	}

}

class Banana {
	private String country;
	private int price;

	@Override
	public String toString() {
		return "Banana [country=" + country + ", price=" + price + "]";
	}

	public Banana(String country, int price) {
		super();
		this.country = country;
		this.price = price;
	}

}

class Grape {
	private String country;
	private int price;

	@Override
	public String toString() {
		return "Grape [country=" + country + ", price=" + price + "]";
	}

	public Grape(String country, int price) {
		super();
		this.country = country;
		this.price = price;
	}

}

public class test05 {

	public static void main(String[] args) {
		Apple apple = new Apple("한국", 3000);
		Banana banana = new Banana("미국", 2000);
		Grape grape = new Grape("일본", 1000);

		showInfo(apple);
		showInfo(banana);
		showInfo(grape);
	}

	public static void showInfo(Object fruit) { // 앞에 타입이 들어가야함 apple, banana, grape의 상위 클래스 >> 최상위 클래스인 Object로 받은것
		if (fruit instanceof Apple) { // fruit 가 Apple 일때 출력 결과를 toString()을 뱉어내서 위에 정의
			Apple apple = (Apple) fruit; // fruit가 오브젝트인지 타입검사를 해야함으로 instanceof 선언
			System.out.println(apple);   // (Apple) fruit << 오브젝트인 fruit를 객체 Apple로 다운 캐스팅
		} else if (fruit instanceof Banana) {
			Banana banana = (Banana) fruit;
			System.out.println(banana);

		} else if (fruit instanceof Grape) {
			Grape grape = (Grape) fruit;
			System.out.println(grape);
		}
	}
}
