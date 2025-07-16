package sub8;

public class RemoveLG implements RemoteControll {// 인터페이스 구현

	@Override
	public void powerOn() {
		System.out.println("LG PowerOn...");
	}

	@Override
	public void powerOff() {
		System.out.println("LG PowerOff...");

	}

	@Override
	public void chUp() {
		System.out.println("LG chUP...");

	}

	@Override
	public void chDown() {
		System.out.println("LG chDown...");

	}

	@Override
	public void SoundUp() {
		System.out.println("LG SoundUp...");

	}

	@Override
	public void SoundDown() {
		System.out.println("LG SoundDown...");

		
	}

}
