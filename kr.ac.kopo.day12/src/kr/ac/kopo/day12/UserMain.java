package kr.ac.kopo.day12;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SamsungTv sam = new SamsungTv();
		sam.powerOn();
		sam.volumeUp();
		sam.volumeDown();
		sam.channelDown();
		
		//lg 구매
		LGTV lg = new LGTV();
		lg.turnOn();
		lg.powerOn(); //은 에러가 남.

		//각자의 명령어가 있기에, 제어가 불가능함.
		/*
		 * 메소드 이름을 동일하게 한다면 어디서든 가능함.
		 */
		
	}

}
