package sub2;
/**
 * 날짜 : 2025/07/14
 * 이름 : 박효빈
 * 내용 : 캡슐화 실습
 * */
public class EncapsuleTest {
	public static void main(String[] args) {
		
		// 객체 생성과 초기화 (String name, String color, int speed)
		Car sonata = new Car("소나타","흰색",0); //생성자 호출
		
		// 초기화 - 은닉된 속성(맴버변수)는 생성자(Constructor)로 초기화
		
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
		
		// 객체 생성과 초기화
		
		Car avante = new Car("아반떼","검정색",0);
		
		avante.speedUp(60);
		avante.speedDown(20);
		
		// 개별 속성이 은닉되어있기 떄문에 속성 수정 불가, Setter로 수정
		//avnte.color = "남색";
		avante.setColor("남색");
		avante.show();
		
		// Account 객체 생성과 초기화1
		// (국민은행, 101-11-1001, 김유신, 10000)
		// 출력 30000
		// 이름 김유신 -> 김유진 수정
		Account kb = new Account("국민은행","101-11-1001","김유신",10000);
		kb.deposit(30000);
		kb.withdraw(10000);
		kb.setName("김유진");
		kb.show();
		
		// Account 객체 생성과 초기2화
		// (우리은행, 101-21-2001, 김춘추, 30000)
		// 출력 50000
		// 은행명 우리은행 -> 너희은행 수정
		Account wr = new Account("우리은행", "101-21-2001", "김춘추", 30000);
		wr.deposit(40000);
		wr.withdraw(20000);
		wr.setBank("너희은행");
		wr.show();
	}

}
