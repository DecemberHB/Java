package step3;

import java.util.Scanner;

public class Sample4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int X = scanner.nextInt();
		int N = scanner.nextInt();
		
		int[] a = new int[N];  // 가격 배열
        int[] b = new int[N];  // 개수 배열
        
        
        for(int i=0; i<N; i++) {
        	 a[i] = scanner.nextInt();
    		 b[i] = scanner.nextInt();
        }
        
        int total=0;
        
        for(int i=0; i<N; i++) {
        	total += a[i]*b[i];
        }
        
        if (total==X) {
        	System.out.print("Yes");
        }else {
        	System.out.print("No");

        }
		
        

		
	}
}
	
	
	
	
	

	

