package sub5;
/*
 * 
 * 날짜 : 2025/07/15
 * 이름 : 박효빈
 * 내용 : 메서드 오버라이딩 실습
 * */

class AAA {
	public void medhod1() {
		System.out.println("AAA:method1...");
	}

	public void medhod2() {
		System.out.println("AAA:method2...");
	}

	public void medhod3() {
		System.out.println("AAA:method3...");
	}
}

class BBB extends AAA {
	
	@Override
	//부모클래스 method2를 Override 하기떄문에 어노테이션 @Overide 표시
	public void medhod2() {
		System.out.println("BBB:method2...");
	}

	public void medhod3(int a) { //Overload 메서드
		System.out.println("BBB:method3...");
	}
}

class CCC extends BBB {
	@Override
	public void medhod1() {
		System.out.println("CCC:method1...");
	}
	

	
	@Override
	public void medhod2() {
		System.out.println("CCC:method2...");
	}

	public void medhod3(int a, int b) { //Overload
		System.out.println("CCC:method3...");
	}
}

public class MethodOverridingTest {

	public static void main(String[] args) {
		
		//오버라이드 메서드 실습
		CCC c = new CCC();
		c.medhod1();
		c.medhod2();
		c.medhod3();
		c.medhod3(1);
		c.medhod3(1, 2);
		
		// Car  오버라이드 메서드 실습
		Sedan sonata = new Sedan("소나타", "흰색", 0, 2000);
		
		sonata.speedUp(200);
		sonata.show();
		

	}

}
