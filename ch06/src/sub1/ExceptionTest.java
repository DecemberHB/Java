package sub1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.Socket;

/*
 * 날짜 : 2025/07/21
 * 이름 : 박효빈
 * 내용 : 자바 예외처리 실습하기
 * */
public class ExceptionTest {

	public static void main(String[] args) {
		// ------------------------------------------------
		// 실행 예외 (Runtime) - 프로그램이 실행 중에 발생하는 에러
		// ------------------------------------------------
		// 예외 상황 1 - 어떤 수를 0으로 나눌 때
		int num1 = 1;
		int num2 = 0;

		try {
			// 예외가 발생할 수 있는 코드 작성
			int r1 = num1 + num2;
			int r2 = num1 - num2;
			int r3 = num1 * num2;
			int r4 = num1 / num2;
			System.out.println("r4 : " + r4);

		} catch (Exception e) {
			// 예외가 발생했을 때
			System.out.println("예외 내용 : " + e.getMessage());
		}

		try {
			// 예외 상황 2 - 배열 인덱스 참조가 잘못됐을 때
			int[] arr = { 1, 2, 3, 4, 5 };
			for (int i = 0; i <= arr.length; i++) {
				System.out.println(arr[i]);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		Animal amimal = null;
		try {
			// 예외 상황 3 - 객체 생성을 하지않고 메서드 호출
			amimal.move();

		} catch (Exception e) {
			e.printStackTrace();
		}

		Animal a1 = new Tiger(); // 업캐스팅
		Animal a2 = new Eagle();
		try {
			// 예외사항4 - 잘못 된 캐스팅
			Tiger tiger = (Tiger) a2; // 옳지 않은 다운캐스팅

		} catch (ClassCastException e) {
			e.printStackTrace();

		}

		// ------------------------------------------------
		// 일반 예외 (Compile-time) - 프로그램을 실행하기 전에 발생하는 에러
		// ------------------------------------------------

		// 동적 객체 생성

		try {
			Class cs = Class.forName("sub1.Tiger"); // 문자열 정보로 클레스 로드
			Constructor constuctor = cs.getDeclaredConstructor();
			Tiger tiger = (Tiger) constuctor.newInstance();
			
			tiger.move();
			tiger.hunt();

		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료...");

	}

}
