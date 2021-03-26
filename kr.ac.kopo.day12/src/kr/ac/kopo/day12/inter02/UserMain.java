package kr.ac.kopo.day12.inter02;

public class UserMain {

	public static void main(String[] args) {
		
		
		
		TV tv = new SamsungTv();
		tv.powerOff();
		tv.channelUp();
		tv.channelDown();
		tv.soundUp();
		tv.soundDown();
		tv.mute();
		tv.mute();
		tv.mute();
		tv.soundUp();
		tv.soundUp();
		
		TV tv2 = new LGTV();   //위에 삼성을 지우고 엘지로 바꿔도 에러나지 않음.
		tv2.powerOff();
		tv2.channelUp();
		tv2.channelDown();
		tv2.soundUp();
		tv2.soundDown();
		tv2.mute();
		
		
		

	}

}
