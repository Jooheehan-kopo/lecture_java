package kr.ac.kopo.day12;

public class SamsungTv {
	private boolean power; // 온오프 버튼
	private int channelNo;
	private int volumeSize;

	public SamsungTv() { // 생성자로 티비를 구매.,,구현
		power = false;
		channelNo = 3;
		volumeSize = 6;
		System.out.println("삼성 티비를 구매하였습니다.");
		// 제어하려면 전환 켜고 끄고 채널 볼륨 조절

	}

	public void powerOn() {
		System.out.println("전원을 켭니다");
	}

	public void powerOff() {
		System.out.println("전원을 끕니다");
	}

	public void channelUp() {
		System.out.println("채널을 올립니다.");
	}

	public void channelDown() {
		System.out.println("채널을 내립니다.");
	}

	public void volumeUp() {
		System.out.println("채널을 올립니다.");
	}

	public void volumeDown() {
		System.out.println("채널을 내립니다.");
	}
}
