package sub4;

public class Doctor extends Person {

	
	private String specialty;
	public Doctor(String name, int age, String specialty) {
		super(name, age);
		
		this.specialty = specialty;
	}
	
	public void work() {
		super.introduce();
		System.out.println("저는 ["+specialty+"]의사입니다. 입니다.");
	}

}
