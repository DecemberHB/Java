package step2;

import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 알람 0~23 / 0~59 23 up + 1 24 // 45 아래로 가면 시간 -1
		int H = sc.nextInt();
		int M = sc.nextInt();

		if (M < 45) {
			H--;
			M = 60 - (45 - M);
			if (H < 0) {
				H = 23;
			}
			System.out.println(H + " " + M);

		}else {
			System.out.println(H + " " + (M-45));
		}
	}
}