package sub4;



public class Sedan extends Car{

	private int cc; // 배기량 추가 
	public Sedan(String name, String color, int speed, int cc) {//부모 클래스 Car에서 상속을 받음 초기화 필요
		// 부모클래스 생성자 호출 , 자식클래스는 부모클래스 속성을 초기화 해주어야함
		super(name, color, speed);
		this.cc = cc;
		
		
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
