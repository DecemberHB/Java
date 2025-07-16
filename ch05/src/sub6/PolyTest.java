package sub6;
/*
 * 
 * 날짜 : 2025/07/15
 * 이름 : 박효빈
 * 내용 : 다형성 실습
 * 
 * 
 * 다형성(Polymorphism)
 *  - 상속관계에서 부모클래스의 기능이 자식클래스에서 다양한 형태로 변하는 특징
 *  - 객체 생성 할 때 타입선언을 부모클래스 타입으로 선언 (업캐스팅)
 *  - 다형성을 통해서 프로그래밍의 중복코드를 줄이고 유연성 향상
 * 
 * */

public class PolyTest {
	public static void main(String[] args) {
		
		
		//다형성 실습 상위 클래스를 타입으로 선언 -- 해당 방식이 더 정형화되어있슴
		//다형성 - 자식객체의 타입선언을 부모타입으로 선언 -> 연관성이 큰이유
		Animal tiger = new Tiger(); //업캐스팅
		Animal eagle = new Eagle(); //업캐스팅
		Animal shark = new Shark(); //업캐스팅
		
		tiger.move();
		tiger.hunt();
		
		eagle.move();
		eagle.hunt();
		
		shark.move();
		shark.hunt();
		
		
		// 다운캐스팅 - 부모타입의 객체를 자식타입으로 캐스팅(Casting, 형변환)
		Tiger t = (Tiger) tiger;
		Eagle e = (Eagle) eagle;
		Shark s = (Shark) shark;
		
		t.move();
		t.hunt();
		e.move();
		e.hunt();
		s.move();
		s.hunt();
		
		// 다형성을 활용한 객체 배열
		 Animal[] arr = {t, e, s}; //공통타입인 Animal이 됨
		 
		 arr[0].move();
		 arr[1].move();
		 arr[2].move();
		 
		 //다형성 확인 문제
		 /* 1. Pet Class 생성 , Dog Class 생성, Cat 클래스 생성
		  * 2. Dog, Cat은 Pet 클래스를 상속
		  * 3. Dog, Cat MakeSound() 정의
		  *  - Dog 멍멍 Cat 야옹
		  *  Main 클래스에서 PrintSound() 정의 후 Dog, Cat을 매개변수로 받아 makeSound를 정의
		  * */
		 
		 Pet cat = new Cat();
		 Pet dog = new Dog();
		 

		 printSound(dog);
		 printSound(cat);
	}
	
	public static void printSound(Pet pet) { //Dog, Cat 매개변수 지정 -> 부모타입을 선언
		
		pet.makeSound();
	}

}
