package sub2;
/*
 * 날짜 : 2025/07/24
 * 이름 : 박효빈
 * 내용 : 자바 스레드 상태 실습하기 
 */
class WorkThread extends Thread {
	@Override
	public void run() {
		
		for(int i=1; i<=10; i++) {
			System.out.println("WorkThread - " + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ThreadJoinTest {
	public static void main(String[] args) {
		
		
		WorkThread work = new WorkThread();
		
		// 작업 스레드 실행 (메인이 종료되고 스레드는 실행되고있어서 좀비 상태임)
		// work.join() 없이 실행 시임
		work.start();
		
		try {
			// 작업 스레드 종료 대기
			work.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("프로그램 종료 . . .");
		
	}

}
