package sub4;

public class StockAccout extends Account{

	
	private String stock;
	private int amount;
	private int price;
	public StockAccout(String bank, String id, String name, int balace, String stock, int amount, int price) {
		super(bank, id, name, balace);
		
		this.stock = stock; //stock = stock; 데드코드
		this.amount = amount; // 참조 this
		this.price = price;
		 
	}
	
	public void sell(int amount, int price) {
		this.amount -= amount;
		this.balace += amount * price;
	}
	
	public void buy(int amount, int price) {
		this.amount += amount;
		this.balace -= amount * price;
	}
	
	public void show() {
		System.out.println("증권사 : " + this.bank);
		System.out.println("계좌 번호 : " + this.id);
		System.out.println("입금주 : " + this.name);
		System.out.println("현재 잔액 : " + this.balace);
		System.out.println("주식 종목 : " + this.stock);
		System.out.println("현재 수량 : " + this.amount);
		System.out.println("현재 가격 : " + this.price);
	}
	

}
