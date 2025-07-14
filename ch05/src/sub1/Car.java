package sub1;

// 클래스 설계(정의)
// 추상화
public class Car { // class = 객체를 표현하는 구조체 문법(키워드)

	// 속성 (맴버변수, 필드)
	String name;
	String color;
	int speed;

	// 기능 (맴버메서드) = statct를 안씀
	public void speedUp(int speed) {
		//this는 자기 참조 키워드, 클래스의 맴버변수 참조
		this.speed += speed; //
		}

	public void speedDown(int speed) {
		this.speed -= speed;

	}

	public void show() {
		System.out.println("차량 명 : " + this.name); // 
		System.out.println("차량 색 : " + color); // this 생략
		System.out.println("현재 속도 : " + speed); //this 생략 
		
		}

}
