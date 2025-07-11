package test1;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("x값 입력 : ");
		int x = scanner.nextInt();
		

		System.out.print("y값 입력 : ");
		int y = scanner.nextInt();
		
		
		String result = x>y ? "x가 더 큽니다." : "y가 더 큽니다.";
		
		scanner.close();
		
		System.out.println(result);
	}
}
