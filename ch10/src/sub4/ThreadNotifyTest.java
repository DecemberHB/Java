package sub4;
/*
 * 날짜 : 2025/07/24
 * 이름 : 박효빈
 * 내용 : 자바 스레드 제어 실습하기 
 */

class WorkObject {
	public synchronized void method1() { // 동기화 블럭 스레드 경합을 막고 순차적으로 진행하기 위해

		Thread thread = Thread.currentThread(); // 해당 메서드에 들어오는 클래스 정보를 받는 객체
		System.out.println(thread.getName() + "- method1 실행 ...");
		
		// 다른 스레드를 실행상태로 전환
		notify();

		try {

			// 자신은 일시 정지 상태로 전환
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void method2() {
		synchronized (this) {

			Thread thread = Thread.currentThread(); // 해당 메서드에 들어오는 클래스 정보를 받는 객체
			System.out.println(thread.getName() + "- method2 실행 ...");
			// 다른 스레드를 실행상태로 전환
			notify();

			try {

				// 자신은 일시 정지 상태로 전환
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}

class ThreadA extends Thread {
	private WorkObject work;
	
	public ThreadA(WorkObject work) {
		this.work = work;
		setName("ThreadA"); // 부모클래스 메서드로 스레드 이름 초기화
	}
	
	@Override
	public void run() {
		for(int i = 0; i<10; i++) {
			work.method1();
		}
	}
}

class ThreadB extends Thread {
	private WorkObject work;
	
	public ThreadB(WorkObject work) {
		this.work = work;
		setName("ThreadB"); // 부모클래스 메서드로 스레드 이름 초기화
	}
	
	@Override
	public void run() {
		for(int i = 0; i<10; i++) {
			work.method2();
		}
	}
}
public class ThreadNotifyTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		WorkObject work = new WorkObject();
		
		ThreadA thA = new ThreadA(work);
		ThreadB thB = new ThreadB(work);
		
		thA.start();
		thB.start();
		
		thA.join();
		thB.join();
		
		System.out.println("프로그램 종료 ...");

	}

}
