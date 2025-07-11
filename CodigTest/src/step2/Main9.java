package step2;

import java.util.Scanner;

public class Main9 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
// 입력 받을 값 입력 
		int a = sc.nextInt(); 
		int b = sc.nextInt();
		int c = sc.nextInt();
	
// 계산 할 총 금액 초기화
		int pri = 0;
// a와 b가 같고 그리고 b와 c도 같다면 a=c이며, 기준값 a
		if (a == b && b == c) {
			pri = 10000 + a * 1000;
			System.out.print(pri);
//a=b는 같으나 a=c가 다를 떄, 기준 값 a  사용함
		} else if (a == b || a == c) {
			pri = 1000 + a * 100;

			System.out.print(pri);
// a=b는 다른데 b=c가 같을떄
		} else if (b == c) {
			pri = 1000 + b * 100;
			System.out.print(pri);
// 모두 아닐 때 3개의 수중 하나를 정하는 if문 작성
		} else {
			int max = a;

			if (b > max) {
				max = b;
			}
			if (c > max) {
				max = c;
			}
			pri = max * 100;
			System.out.print(pri);

		}

	}
}
