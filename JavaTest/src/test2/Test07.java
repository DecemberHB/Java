package test2;
/* 날짜 : 2025/07/10
 * 이름 : 박효빈
 * 내용 : 자바 배열 문자 출력 연습문제
 * */
public class Test07 {
	public static void main(String[] args) {
		System.out.println("1과 5의 최대 공약수 : " + gcd(1,5)); //인자값 1,5를 전달
		System.out.println("3과 6의 최대 공약수 : " + gcd(3,6));
		System.out.println("12과 18의 최대 공약수 : " + gcd(12,18));
		System.out.println("60과 24의 최대 공약수 : " + gcd(60,24));
		System.out.println("192과 162의 최대 공약수 : " + gcd(192,162));
	}
	
	//최대공야굿 메서드 정의
	
	public static int gcd(int a, int b) {
		int temp = 0;
		
		if (a<b) { //작은걸 먼저 temp로 전달
			temp = a;
		}else {
			temp = b;
		}
		
		while (true) {
			if (a % temp == 0 && b%temp ==0) {
				//무한 반복되는 경우 둘다 나눠서 0이면 
				break; // 그럼 여기서 반복문을 끝내야함으로 break; 선언....
				
			}
			temp --; //회전할때 temp 값을 -1 해서 나머지가 0으로 떨어질떄까지 찾는거임 그러다가 구하는거
		}
		return temp;
	}

}
