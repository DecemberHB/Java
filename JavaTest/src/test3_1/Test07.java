package test3_1;

class Customer {
	protected int id;
	protected String name;
	protected String grade;
	protected int point;
	protected double pointRatio;


	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
		this.grade = "SILVER";
		this.point = 100;
		this.pointRatio = 0.01;
	}

	public int calcPrice(int price) {
		point += price * pointRatio;
		return price;
	}

	public void showInfo() {
		System.out.println("--------------------");
		System.out.println("고객 번호 : " + id);
		System.out.println("고객 이름 : " + name);
		System.out.println("고객 등급 : " + grade);
		System.out.println("현재 포인트 : " + point);
		System.out.println("포인트 적립을: " + pointRatio);
	}
}

class VipCustomer extends Customer { //부모클래스에 있는 생성자들임

	private double saleRatio;

	public VipCustomer(int id, String name) {
		super(id, name);
		super.grade = "VIP";
		super.point = 1000;
		super.pointRatio = 0.05;
		this.saleRatio = 0.1;
	}
	public int calcPrice(int price) {
		point += price * pointRatio;
		return price - (int)(price*saleRatio);
	}
}

public class Test07 {
	public static void main(String[] args) {
		Customer kim = new Customer(1001, "김춘추");
		VipCustomer lee = new VipCustomer(1002, "이순신");
		
		System.out.println("김춘추 지불할 금액 : " + kim.calcPrice(10000));
		System.out.println("이순신 지불할 금액 : " + lee.calcPrice(10000));
		
		kim.showInfo();
		lee.showInfo();
	}

}
