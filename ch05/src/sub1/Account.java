package sub1;

public class Account {

	// 속성 (맴버변수)
	public String bank;
	public String id;
	public String name;
	public int balace;

	// 기능
	public void deposit(int money) {
		this.balace += money;
		

	}

	public void withdraw(int money) {

		this.balace -= money;

	}

	public void show() {
		System.out.println("-------------------------");
		System.out.println("은행 명 : " + this.bank);
		System.out.println("계좌 번호 : " + this.id);
		System.out.println("입금주 : " + this.name);
		System.out.println("현재 잔액 : " + this.balace);
		System.out.println("-------------------------");

	}
}
