package sub4;
/*
 * 날짜 : 2025/07/08
 * 이름 : 박효빈
 * 내용 : 자바 While 반복문 실습하기
 * **/
public class WhileTest {
	public static void main(String[] args) {
		//1부터 10까지의함 

		int sum = 0;
		int k = 1;
		
		while( k <= 10) {
			sum += k;
			k++;
		}
		
		System.out.println("1부터 10까지의 합 : " + sum);
		
	
	
	// do - while 최초 무조건 1번 반복 실행문
	
		
	
		int tot = 0 ;
		int j = 1;
		
		do{
			if (j % 2 == 0) {
				tot += j;
			}
			
			j++;
			
		}while(j <= 10);
		
		System.out.println("1부터 10까지의 짝수 합 : " + tot);
		
		//break
		
		int num = 1;
		
		while(true) {
			if(num % 5 == 0 && num % 7 == 0) {
				break;
			}
			num++;
		}
		System.out.println("5와 7의 최소공배수 : " + num);
		
		//Continue 
		
		int total = 0;
		int i = 1;
		
		while (i <= 30) {
			i++;
			
			if(i % 2 == 1) {
				continue;
			}
			
			total += i;
		}
		
		System.out.println("1부터 10까지의 짝수의 합 : " + total);
		
}

	
	
}
