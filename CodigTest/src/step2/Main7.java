package step2;

/*
 * 1. 시간 H, 분 M 입력 
 * 2. 조리 시간 입력
 * 3. 분 M + 조리시간 S 60이상이면 H++, 0이하
 * 시간 * 60 + 분 = 분으로 
 * */
import java.util.Scanner;

public class Main7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int hour = sc.nextInt();
		int min = sc.nextInt();
		int time = sc.nextInt();

		int xtime = (hour * 60) + min + time;

		int endhour = (xtime / 60) % 24;
		int endmin = (xtime % 60);

		System.out.print(endhour + " " + endmin);

	}
}
