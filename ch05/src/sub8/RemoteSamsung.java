package sub8;

public class RemoteSamsung implements RemoteControll{

	@Override
	public void powerOn() {
		System.out.println("Samsung PowerOn...");
	}

	@Override
	public void powerOff() {
		System.out.println("Samsung PowerOff...");

	}

	@Override
	public void chUp() {
		System.out.println("Samsung chUP...");

	}

	@Override
	public void chDown() {
		System.out.println("Samsung chDown...");

	}

	@Override
	public void SoundUp() {
		System.out.println("Samsung SoundUp...");

	}

	@Override
	public void SoundDown() {
		System.out.println("Samsung SoundDown...");

		
	}

}
