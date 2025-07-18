package p224;

class Sample {
	public int a;
	private int b;
	int c; //default
	protected int d;
	
	
}

class sub extends Sample {
	
	public void method() {
		d=10;
	}
	
}
public class AccessEx {

	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.a = 10;
		//sample.b = 10;
		sample.c = 10;
	}
}
