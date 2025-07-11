package step3;

import java.util.Scanner;

public class Sample2 {
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
            System.out.println(sum[i]); // i번째에 저장된 합 출력
        }

        scanner.close(); // Scanner 자원 해제
    }
}
//[ 배열 관련 설명 ]

//1. int[] sum = new int[T];
//→ 크기가 T인 정수 배열을 만든다.
//→ 즉, sum[0], sum[1], ..., sum[T-1]까지 T개의 칸이 생긴다.
//→ 각 칸에는 나중에 두 수의 합을 저장한다.

//2. sum[i] = A + B;
//→ 반복문을 돌면서, 매번 입력받은 A와 B의 합을
//→ sum 배열의 i번째 위치에 저장한다.

//3. for (int i = 0; i < T; i++) { System.out.println(sum[i]); }
//→ 배열에 저장된 값들을 한 줄씩 꺼내서 출력한다.
//→ 배열은 0부터 시작하므로 i < T 까지만 반복해야 한다.