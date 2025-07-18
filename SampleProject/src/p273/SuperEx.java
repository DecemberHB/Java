package p273;


class Point {
	private int x,y;
	public void set(int x, int y) {
		this.x = x; this.y = y;
	}
	
	public Point (int x, int y) {
		this.x =x; this.y =y;
	}
	public void showPoint() {
		System.out.println("(" + x +", " + y + ")");
	}
}


class ColorPoint extends Point{
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	private String color;
	
	public void showColorPoint() {
		System.out.println(color);
		showPoint();
	}	
}

public class SuperEx {
	
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5,6,"SKY");
	}

	
}
