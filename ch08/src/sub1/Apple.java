package sub1;

public class Apple {

	private String country;
	private int pricel;
	
	
	public Apple(String country, int pricel) {
		super();
		this.country = country;
		this.pricel = pricel;
	}


	@Override
	public String toString() {
		return "Apple [country=" + country + ", pricel=" + pricel + "]";
	}
	
	
	
}
