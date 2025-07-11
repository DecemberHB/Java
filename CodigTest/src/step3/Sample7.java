package step3;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Sample7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 사용자로부터 입력받기 위한 Scanner 객체 생성

		int T = scanner.nextInt(); // 테스트 횟수(또는 입력 쌍의 개수) 입력받음

		// 결과를 저장할 정수형 배열 sum 생성
		// 크기는 T (입력 쌍의 개수만큼 결과 저장)
		int[] sum = new int[T];

		// T번 반복하면서 두 개의 정수를 입력받고 그 합을 배열에 저장
		for (int i = 0; i < T; i++) {
			int A = scanner.nextInt(); // 첫 번째 정수 입력
			int B = scanner.nextInt(); // 두 번째 정수 입력

			sum[i] = A + B; // 두 수의 합을 배열의 i번째 위치에 저장
		}

		// 저장된 합들을 한 줄씩 출력
		for (int i = 0; i < T; i++) {
			//System.out.println(sum[i]); 
			System.out.println("Case"+" "+"#"+(i+1)+":"+ " " + sum[i]);
		}

		scanner.close(); // Scanner 자원 해제
	}
}
