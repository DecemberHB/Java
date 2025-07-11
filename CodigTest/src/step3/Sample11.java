package step3;

import java.util.Scanner;

public class Sample11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	
		while(true) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			int sum = A+B;
			

			if (A==0&&B==0) {
				break;
			}
			System.out.println(sum);

		}

	}
}
