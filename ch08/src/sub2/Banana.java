package sub2;

public class Banana {

	private String country;
	private int pricel;
	
	
	public Banana(String country, int pricel) {
		super();
		this.country = country;
		this.pricel = pricel;
	}


	@Override
	public String toString() {
		return "Banana [country=" + country + ", pricel=" + pricel + "]";
	}
	
	
	
}
