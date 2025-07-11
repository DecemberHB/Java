package sub2;

/**
 * 날짜 : 2025/07/07
 * 이름 : 박효빈
 * 내용 : Java 다양한 출력 실습
 * */
public class PrintTest {
	
	public static void main(String[] args) {
		
		// 기본 출력
		System.out.println("Hello Java!"); //한줄 복사 Ctrl + Alt + 방향키 위/아래 
		System.out.println("Hello Korean!"); //한줄 삭제 Ctrl + D  
		System.out.println("Hello Busan!"); //작업 취소 Ctrl + z
		// 한줄 출력
		System.out.print("welcome"); // ln(줄바꿈, 개행) 처리가 안되기 떄문에 그 다음 출력문에 바로 이어서 출력됨
		System.out.print("Java!");
		// 개행 출력
		System.out.println(); //줄바꿈
		System.out.print("Welcome\n"); //줄바꿈
		System.out.println("Korean"); // \n : 개행처리 이스케이프 특수문자
	}

}
