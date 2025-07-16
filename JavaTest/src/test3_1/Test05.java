package test3_1;

class Vehicle {
	private String name;
	private int price;

	public Vehicle(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public void info() {
		System.out.println("************************");
		System.out.println("차량명 : " + name);
		System.out.println("가 격 : " + price);
	}
}

class CarFactory { // 자기 클래스안에서 인스턴스 생성 -> 싱글톤
	private static CarFactory instance = new CarFactory();

	private CarFactory() {
	}

	// CarFactory 에서 인스터스를 호출해서 사용하는것
	public static CarFactory getInstance() {
		return instance;
	}

	// 반환 타입을 적어줘야하는데 ?? return 값인 Vehicle <<
	public Vehicle createCar(String name, int price) {
		return new Vehicle(name, price);
	}

}

public class Test05 {
	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();

		Vehicle avante = factory.createCar("아반테", 2500);
		Vehicle sonata = factory.createCar("소나타", 3500);

		avante.info();
		sonata.info();
	}
}