package sub3;

import java.util.Set;

public class Count {
	
	private int num = 0;
	
	public int getNum() {
		return num;
	}
	
	
	// synchronized : 동기화 블럭, 스레드의 경합(Race Condition)을 막고 순차적으로 스레드 실행
	public synchronized void setNum() { // 1, 2 , 3 , 4, 5 들어오면 num++ 계속 더함
		// 임계영역 : 하나의 스레드가 해당 영역에 들어올때 Lock을 걸고 영역을 빠져나갈 때 해제
		this.num++;
	}

}
