package step3;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Sample6 {
    public static void main(String[] args) throws IOException {
        // ✅ Scanner 대신 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // ✅ 첫 줄 입력 (T) 문자열을 정수로 변환
        int T = Integer.parseInt(br.readLine());

        // ✅ 출력용 StringBuilder 선언
        StringBuilder sb = new StringBuilder();

        // ✅ 반복문: 줄마다 입력 받고 계산
        for (int i = 0; i < T; i++) {
            // 줄 하나 읽고 공백 기준으로 split
            String[] parts = br.readLine().split(" ");
            int A = Integer.parseInt(parts[0]);
            int B = Integer.parseInt(parts[1]);

            // ✅ 결과를 StringBuilder에 추가
            sb.append(A + B).append('\n');
        }

        // ✅ 출력은 한 번에
        System.out.print(sb);
    }
}
