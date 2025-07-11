package step3;

import java.util.Scanner;

public class Sample1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int nmix = 0;
		for (int i=1; i<10; i++) {
			nmix = n * i;
			System.out.printf("%d"+" " +"*" +" " +"%d"+" = " + "%d",n,i,nmix);
			System.out.print("\n");
		}
	}
}
	
	
	
	
	

	

