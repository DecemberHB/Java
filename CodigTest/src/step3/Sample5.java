package step3;

import java.util.Scanner;

public class Sample5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		
		int N = scanner.nextInt();
		
		if(N%4==0) {
			int count = N/4;
			
			for(int i=1; i<=count; i++) {
				System.out.print("long"+ " ");
				
			}
		}
		System.out.print("int");
		
	}
}
	
	
	
	
	

	

