package sub8;

public class SmartTv extends Tv implements Internet { // 상속은 하나만

	@Override
	public void access() {
		System.out.println("인터넷 접속 ... ");
	}
	

	public void process() {
		
		PowerOn();
		access();
	
		System.out.println("SmartTv On...");
	}

}
