package test1;
/*
 * 날짜 : 2025/07/09
 * 이름 : 박효빈
 * 내용 :
 * */
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		int year;
		int birth;
		String name;
		
		System.out.print("올해 년도 입력 : ");
		year = scanner.nextInt();
		
		System.out.print("태어난 년도 입력 : ");
		birth = scanner.nextInt();
		
		System.out.print("이름 입력 : ");
		name = scanner.nextLine();
		
		int age = year - birth;
		
		System.out.printf("%s님 안녕하세요. \n 당신은 올해 만 %d세 입니다.",name,age);
		
		scanner.close();
		
		
		
		
		
		
	}
}
