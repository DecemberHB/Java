package sub1;
/*
 * 날짜 : 2025/07/24
 * 이름 : 박효빈
 * 내용 : 자바 스레드 실습하기 
 */

// 예시 : > 채팅프로그램의 메세지 전송, 수신 

class SubThread extends Thread {

	private String name;

	public SubThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		// 작업 스레드 (자식 스레드 실행)

		

		for (int i = 0; i < 10; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name + "_ 작업 스레드 실행 : " + i);
			
		}

		System.out.println(name + "_ 작업 스레드 종료...");

	};
}

public class ThreadTest {

	public static void main(String[] args) {
		// 자식 스레드 객체 생성
		SubThread st1 = new SubThread("ST1");
		SubThread st2 = new SubThread("ST2");
		// 작업 스레드 실행

		st1.start();
		st2.start();

		// 개념 중요

		for (int i = 0; i < 10; i++) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("실행 : " + i);
		}

		System.out.println("프로그램 종료...");

	}

}
