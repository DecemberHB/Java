package test1;
/*
 * 날짜 : 2025/07/09
 * 이름 : 박효빈
 * 내용 :
 * */
public class Test03 {
	
	public static void main(String[] args) {
		
		int result = 0;
		int num = 1;
		//선대입 후 연산
		result = num++;
		System.out.println("result : " + result ); //result 2 ?
		
		result = ++num;
		System.out.println("result : " + result ); // result 3
		
		result = num--;
		System.out.println("result : " + result ); // result 2?
		
		result = --num;
		System.out.println("result : " + result ); // result 1
	}

}
