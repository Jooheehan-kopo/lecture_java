package kr.ac.kopo.day12.inter02;

public class SamsungTv implements TV {

	private String modelName;
	private boolean power;
	private int volumeSize;
	private int channelNo;

	private boolean muteToggle; // (t-f-f-t) false임

	int currenVol;

	public SamsungTv() {
		System.out.println("삼성티비 구매 완료"); // setting
		modelName = "삼성 티비";
		power = false;
		volumeSize = 3;
		channelNo = 6;

		// 값지정.
	}

	@Override
	public void powerOn() {
		power = true;
		System.out.println("전원 킨다");
		info();
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("전원 끈다");

	}

	@Override
	public void channelUp() {
		// TODO Auto-generated method stub
		System.out.println("채널 올려준다");

	}

	@Override
	public void channelDown() {
		// TODO Auto-generated method stub
		System.out.println("채널 내려준다");

	}

	@Override
	public void soundUp() {
		// TODO Auto-generated method stub
		System.out.println("볼륨을 높여요");
		// channelNo++
		channelNo = ++channelNo % (100);

		if (muteToggle) {// 만약 음소거t라면 볼륨높이면 소리 높아짐.
			volumeSize = currenVol;
			muteToggle = false;

			if (volumeSize > TV.MIN_VOLUME_SIZE)
				volumeSize--;
			info();
		}
	}

	@Override
	public void soundDown() {
		// TODO Auto-generated method stub
		System.out.println("볼륨을 내려요");
		channelNo--;
		if (channelNo == 0)
			channelNo = 100;
		info();
	}

	@Override
	public void mute() {
		// TODO Auto-generated method stub
		System.out.println("쉿, 조용!");

		// volumeSize = TV.MIN_VOLUME_SIZE; /다시누르면 음소거해제기능. 원래값
		// false는 뮤트가 아닌 상태
		if (muteToggle) {
			System.out.println("음소거 해제");
			muteToggle = false;
		} else {
			System.out.println("음소거 중..");
			muteToggle = true;
			currenVol = volumeSize;

		}
		// muteToggle=!muteToggle (위와 같은 코드임)
		info();

	}

	/* public */ private void info() { // 삼성티비 내부에서만 쓴다면
		System.out.println("채널번호 : " + channelNo + "음량 : " + volumeSize);
		// 파워버튼 킬때만 쓴다? 굳이 public으로 안해도됨. private로 해주면 됨.
		// 주석은 퍼블릭 관련내용만 나옴 --> 접근제한자 private으로
	}

}
