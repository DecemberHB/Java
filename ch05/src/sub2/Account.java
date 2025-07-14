package sub2;

public class Account {

	// 속성 (맴버변수)
	private String bank;
	private String id;
	private String name;
	private int balace;
	
	public Account(String bank, String id, String name, int balace) {
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.balace = balace;
		
	}

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
	
	//Getter / Settet
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
