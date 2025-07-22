package sub1;

import javax.swing.Box;

/*
 * 날짜 : 2025/07/22
 * 이름 : 박효빈
 * 내용 : 자바 제네릭 실습하기
 * 
 * */

public class GenericsTest {
	
	public static void main(String[] args) {
		
		Apple apple = new Apple("한국", 3000);
		Banana banana = new Banana("대만", 2000);
		
		FruitBox<Apple> box1 = new FruitBox<Apple>();
		box1.setFruit(apple);
		
		FruitBox<Banana> box2 = new FruitBox<Banana>();
		box2.setFruit(banana);
		
		System.out.println(box1.getFruit());
		System.out.println(box2.getFruit());
		
	}

}
