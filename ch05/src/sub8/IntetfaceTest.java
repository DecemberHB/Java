package sub8;
/*
 *  날짜 : 2025/07/16
 *  이름 : 박효빈
 *  내용 : 인터페이스 실습하기
 * 
 * */
public class IntetfaceTest {
	public static void main(String[] args) {
		// 인터페이스 역할 
		// 1. 통일된 표준 클래스 설계
		RemoteControll lg = new RemoveLG(); // 다형성 업캐스트 적용 new ~ 구현클래스
		lg.powerOn();
		lg.chUp();
		lg.SoundUp();
		lg.powerOff();
		
		RemoteControll samsung = new RemoteSamsung();
		samsung.powerOn();
		samsung.chUp();
		samsung.SoundUp();
		samsung.powerOff();
		
		// 2. 결합도 완화(유연성)
		Bulb bulb = new Bulb();
		Soket soket = new Power(bulb);
		
		soket.switchOn();
		soket.switchOff();
		
		// 3. 다중상속 효과
		SmartTv smartTv = new SmartTv();
		smartTv.process();
		
		
	}

}
