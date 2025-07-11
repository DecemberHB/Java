package sub2;



/*
 *  날짜 : 2025/07/07
 *  이름 : 박효빈
 *  내용 : 자바 변수 자료형 실습하기
 * 
 * */
public class DataTypeTest {

	public static void main(String[] args) {
		
		//정수형
		
		byte num1 = 127; //1byte
		short num2 = 32767; //2byte
		char num3 = 97; 	//2byte
		int num4 = 2147483647; //4byte
		long num5 = 922_337_203_685_477_5807L; //8byte
		
		System.out.println("num1 : " + num1); 
		System.out.println("num2 : " + num2); 
		System.out.println("num3 : " + num3); 
		System.out.println("num4 : " + num4); 
		System.out.println("num5 : " + num5); 
		
		//실수형
		
		float var1 = 0.123456789f;  //4byte
		double var2 = 0.1234567890123456789; //8byte
		
		System.out.println("var1 : " + var1); // 소수점 8자리까지 출력
		System.out.println("var2 : " + var2); // 소수점 17자리까지 출력
		
		//논리형
		boolean value1 = true;
		boolean value2 = false;
		
		System.out.println("value1 : " + value1);
		System.out.println("value2 : " + value2);
		
		//문자형
		char c1 = 'A';
		char c2 = '가';
		
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		
		int n1 = c1; //char는 정수형 타입이기때문에 int형으로 대입 가능 A의 아스키코드값이 65
		System.out.println("n1 : " +n1 );
		
		//문자열
		String s1 = "A";
		String s2 = "가";
		String s3 = "APPLE";
		String s4 = "가울";
		
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		System.out.println("s3 : "+s3);
		System.out.println("s4 : "+s4);
		
	}
}
