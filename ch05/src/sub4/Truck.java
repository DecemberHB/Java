package sub4;

public class Truck extends Car{
	
	private int capcity; //적재용량

	public Truck(String name, String color, int speed, int capcity) {
		super(name, color, speed);
		
		this.capcity = capcity;
		
	}
	
	public void load(int capacity) {
		this.capcity += capacity;
		
	}
	
	public void show() {
		super.show();
		System.out.println("현재 적재량 : "+ this.capcity);
	}

}
