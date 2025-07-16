package sub4;
/**
 * 
 * 날짜 : 2025/07/15
 * 이름 : 박효빈
 * 내용 : 자바객체프로그래밍 상속(Inheritance) 실습
 * */


public class InheritTest {

	public static void main(String[] args) {
		
		Sedan sonata = new Sedan("소나타", "White", 0, 2000);
		sonata.speedUp(80);
		sonata.turbo();
		sonata.speedDown(20);
		sonata.show();
		
		Truck bongo = new Truck("봉고", "남색", 0, 0);
		bongo.load(100);
		bongo.speedUp(80);
		bongo.speedDown(20);
		bongo.show();
		
		
		//StockAccount 실습
		StockAccout kb = new StockAccout("KB증권", "101-22-0110", "홍길동", 10000, "삼성전자", 10, 1000000);
		kb.deposit(1000000);
		kb.withdraw(50000);
		kb.buy(5, 80000);
		kb.show();
		System.out.println("----------------------------------");
		
		kb.sell(5, 90000);
		kb.show();
		
		//Person 실습//
		Doctor doctor = new Doctor("김유진", 23, "소아과");
		Engineer engineer = new Engineer("김춘추", 21, "소프트웨어");
		
		doctor.work();
		engineer.work();
	}
	
}

