package p128;

import java.util.Scanner;

public class BreakExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("exit를 입력하면 종료됩니다.");
		
		while(true){
			System.out.print(">>");
			String text = scanner.nextLine();
			if(text.equals("exit"))
				break;
			
		}
		System.out.println("프로그램 종료");

	}

}
