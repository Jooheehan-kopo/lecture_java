package kr.ac.kopo.day12.inter02;
//채널 조정, 볼률조정(최대 음량)
public interface TV {
	public static final int MAX_VOLUME_SIZE = 50; //모든 변수를 상수로 인식 final을 써주고 밑줄로 연결, 기울림채 static임
	int MIN_VOLUME_SIZE= 0;
	
	public abstract void powerOn();
	void powerOff();
	void channelUp();
	void channelDown();
	void soundUp();
	void soundDown();
	void mute();
	//표준화를 가지고 만들어야함.
	
	default void copyright() {   // default가 없으면 추상 메소드만 가능하기에 추가시킬 수 없음. 
		System.out.println("모든 기술은 티비 협회에 귀속됩니다.");
	}
}
