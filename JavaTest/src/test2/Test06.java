package test2;

import java.util.Scanner;

/* 날짜 : 2025/07/10
 * 이름 : 박효빈
 * 내용 : 자바 메서드 연습문제
 * */
public class Test06 {

	
	public static void intro() { //return이 없으므로 void (호출 떄려야함)
		System.out.println("******* START ********");
		System.out.println("두개의 정수를 입력");
	}
	
	
	public static int input(Scanner sc,String name) { //리턴값이 숫자 int 임으로 
	System.out.print("변수 " + name + "값 입 력 : "); // name 변수가 참조되고있다 (매개변수다)
	int input = sc.nextInt();
	return input;
	}
	
	public static void result(int val) { //리턴이없으므로 void 매개변수 prindln에 참조되고있는 val
		System.out.println("덧셈 결과 : " + val);
		System.out.println("******* END ********");
	}
	
	public static int add (int x, int y) { //리턴타입 숫자니깐 int
		return x+y;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		intro(); //처음으로호출되어야하니깐 
		int a = input(sc,"a"); //int a, b를 input함수에 매개변수로 던져
		int b = input(sc,"b");
		
		int output = add(a,b);
		result(output);
		
		sc.close();
		
		
		
	}
}
