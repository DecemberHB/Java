package sub5;
/*
 * 날짜 : 2025/07/22
 * 이름 : 박효빈
 * 내용 : Math 실습하기
 * 
 * */
public class MathTest {

	public static void main(String[] args) {
		
		
		System.out.println("절대값 : " + Math.abs(-5));
		System.out.println("절대값 : " + Math.abs(5));
		System.out.println("제곱근  : " + Math.sqrt(9));
		System.out.println("제곱근  : " + Math.sqrt(16));
		// 자주 사용되는 Math 함수
		System.out.println("올림값  : " + Math.ceil(1.2));
		System.out.println("올림값  : " + Math.ceil(1.8));
		System.out.println("내림값  : " + Math.floor(1.2));
		System.out.println("내림값  : " + Math.floor(1.8));
		System.out.println("반올림값  : " + Math.round(1.2));
		System.out.println("반올림값  : " + Math.round(1.8));
		
		// random : 임의의 수 (자주 사용되는 Math 함수)
		double num1 = Math.random();
		System.out.println("num1 : " + num1); // 0~1 사이의 실수

		double num2 = num1 * 10;
		System.out.println("num2 : " + num2); // 0 ~ 10사이의 실수
		
		double num3 = Math.ceil(num2);
		System.out.println("num3 : " + num3); // 1 ~ 10 사이의 정수
		
		// 해당 방식으로 많이 사용 됨
		double rand = Math.ceil(Math.random() * 46 ); // 1 ~ 46 까지 임의의 정수
	
		System.out.println("rand : " + rand);
 
	}
}
