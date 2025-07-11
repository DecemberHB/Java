package test2;
/* 날짜 : 2025/07/10
 * 이름 : 박효빈
 * 내용 : 자바 피보나치 수열 재귀 연습문제
 * */ 
public class Test10 {
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.print(fibo(i)+ " " );
		}
		
	}
	
	public static int fibo(int n) {
		if (n <= 1) {
			return n; // 0,1
		}
		return fibo(n-1) + fibo (n-2); 
	}

}
//백준 1단계~ 10단계까지