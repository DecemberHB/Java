package sub5;



public class Sedan extends Car{

	// 상수 최초 한번 초기화 된 값으로 고정된 변수
	private final int MAX_SPEED = 180; //final int = 상수가 됨 상수는 대문자로
	private int cc; // 배기량 추가 
	public Sedan(String name, String color, int speed, int cc) {//부모 클래스 Car에서 상속을 받음 초기화 필요
		// 부모클래스 생성자 호출 , 자식클래스는 부모클래스 속성을 초기화 해주어야함
		super(name, color, speed);
		this.cc = cc;
		
		
	} 
	
	@Override
	public void speedUp(int speed) {
		// 부모클래스 speedUp을 자식클래스에 맞게 재정의
		
		this.speed += speed;
		
		if(this.speed > MAX_SPEED) {
			this.speed = MAX_SPEED;
		}
	}
	
	public void turbo() { //public으로 재지정하는건 옳지않음 -> protected로 접근제한 변경 -> 자식클래스에서는 참조가능하도록
		// 부모클래스 spped 참조를 위해 접근권한을 private -> protected로 변경
		this.speed += 10; 
	}
	
	public void show() {
		super.show(); // 부모클래스 show() 호출 
		System.out.println("배기량 : " + this.cc);
	}
}
