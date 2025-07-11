package p137;

import java.util.Scanner;

public class ArratLength {
	public static void main(String[] args) {
		int intArray[] = new int[5];
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print(intArray.length + "개의 정수 입력 >>");
		
		for(int i=0; i<intArray.length; i++) {
			intArray[i] = scanner.nextInt();
			
		}
		
		for (int i=0; i<intArray.length; i++) {
			 sum += intArray[i];
		}
		
		System.out.println("평균운" + (double)sum/intArray.length);
		scanner.close();
	}

}
