package step2;


import java.util.Scanner;

public class Main9 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a==b) {
			if(b==c) {
				int good = a;
				System.out.print(10000+(good*1000));
			}
			
		}if (a==b) {
			int good1 = a ;
			System.out.print(1000+(good1*100));
		}else if (b==c){
			int good2 = b ;
			System.out.print(1000+(good2*100));
		}else if (a==c) {
			int good3 = a ;
			System.out.print(1000+(good3*100));
		} 
		else if(a>b && a>c){
			System.out.print(a*100);			
		}else if(b>a&&b>c) {
			System.out.print(b*100);	
		}else {
			System.out.print(c*100);	
		}

	}
}
