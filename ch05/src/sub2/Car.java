package sub2;

// 클래스 설계(정의)
// 추상화
public class Car { // class = 객체를 표현하는 구조체 문법(키워드)

	// 속성 (맴버변수, 필드) - 무조건 priate으로 선언 ** (현재 캡슐화 된 상태임)
	private String name;
	private String color;
	private int speed;

	// 생성자(Constructor) - 속성을 초기화하는 반환타입이 없고 클래스명 이름이 그대로 메서드 이름으로 사용 (문법이므로 이렇게 써야함)
	public  Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
		
	}
	
	// 기능 (맴버메서드) => 무조건 public 선언
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
	
	// Getter/Setter - 은닉된 속성을 안전하게 처리하기 위한 메서드

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
