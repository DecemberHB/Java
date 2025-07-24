package test5;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 날짜 : 2025/07/23
 * 이름 : 박효빈
 * 내용 : 예외처리 연습문제
 * 
 * 
 * 
 * */
public class test01 {
	public static void main(String[] args) {
		int answer = (int) (Math.random() * 10) + 1;
		int input = 0, count = 0;

		do {
			count++;
			System.out.println("--------------------------------");
			System.out.print("1 ~ 10 사이 값 입력: ");

			try {
				Scanner sc = new Scanner(System.in);
				input = sc.nextInt();

				if (input < 0) {
					throw new Exception("음수는 입력할 수 없습니다."); // 예외 생성은 던져야함 throw new << 
				}

				if (answer > input) {
					System.out.println("더 큰 수 입력");
				} else if (answer < input) {
					System.out.println("더 작은 수 입력");
				} else {
					System.out.println(answer + " 정답 ");
					System.out.println("횟수" + count + "회");
					break; // 답이 나왔으니 종료해야함
				}

			} catch (InputMismatchException e) {
				System.out.println("숫자가 아닙니다. 숫자를 입력하세요.");
				continue;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				continue;
			}

		} while(true);

		System.out.println("프로그램 종료...");
	}
}