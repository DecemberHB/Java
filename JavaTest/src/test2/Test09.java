package test2;
/* 날짜 : 2025/07/10
 * 이름 : 박효빈
 * 내용 : 자바 최대공약수 재귀 연습문제 유클리드호재법으로 푼것 
 * 두 자연수 A B에 대해서 A>B일때 A와 B를 나눈 나머지가 R이라고하면 A B의 최대공약수의 B와 R의 최대공약수와같다
 * 계속해서 나가다보면 나머지가 0으로 떨어지는 수가 있음
 * */
public class Test09 {
	public static void main(String[] args) {
		System.out.println("1과 5의 최대 공약수 : " + gcd(5,1)); //인자값 1,5를 전달
		System.out.println("3과 6의 최대 공약수 : " + gcd(6,3));
		System.out.println("12과 18의 최대 공약수 : " + gcd(18,12));
		System.out.println("60과 24의 최대 공약수 : " + gcd(24,60));
		System.out.println("192과 162의 최대 공약수 : " + gcd(192,162));
	}

	public static int gcd(int a, int b) { //5,1 일부러 뒤에 작은 수로 한거임(편하고)
		if (a%b==0) {
			return b; // 나머지가 0이므로 b 가 나오게되는것
		}else {
			return gcd(b, a%b); // 아니면 재호출(재귀) 나머지가 들어가야함
		}
	}
}
