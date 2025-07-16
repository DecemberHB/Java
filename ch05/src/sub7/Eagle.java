package sub7;

public class Eagle extends Animal{

	@Override // Animal 추상클래스를 상속받아서 선언
	public void move() {
		System.out.println("Eagle move Fly");
		
	}

	@Override
	public void hunt() {
		System.out.println("Eagle hunt...");
		
	}

}
