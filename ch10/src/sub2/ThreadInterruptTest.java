package sub2;
/*
 * 날짜 : 2025/07/24
 * 이름 : 박효빈
 * 내용 : 자바 스레드 상태 실습하기 
 */

class SubThread extends Thread {

	@Override
	public void run() {
		
		int i = 1;
		try {
			while(true) { //while 문을 breck; 없이 예외발생으로 중단 시킴
				System.out.println(" i : " + i);
				i++;
                Thread.sleep(1000); // 스레드 1초 일시 정지

			}
		} catch (InterruptedException e) { // 1초 일시 정지 순간에 인터럽트(깨움) 
			// TODO: handle exception // 예외 발생으로 
			e.printStackTrace();
			//System.out.println("예외 처리로 작업 스레드 종료");
		}
	
		
		

	}
}

public class ThreadInterruptTest {

	public static void main(String[] args) {
		
		SubThread sub = new SubThread();
		
		// 작업 스레드 실행
		
		sub.start();
		
		try {
			Thread.sleep(1000 * 5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// 작업 스레드 일시정지 발생시키기
		sub.interrupt();
		
		System.out.println("메인 스레드 종료 ...");

	}

}
