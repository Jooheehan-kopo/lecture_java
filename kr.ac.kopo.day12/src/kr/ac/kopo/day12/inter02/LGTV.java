package kr.ac.kopo.day12.inter02;

public class LGTV implements TV {
	
	@Override
	public void powerOn() {
		System.out.println("전원을 킵니다");

	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("전원을 꺼줍니다");

	}

	@Override
	public void channelUp() {
		// TODO Auto-generated method stub
		System.out.println("채널을 올립니다");

	}

	@Override
	public void channelDown() {
		// TODO Auto-generated method stub
		System.out.println("채널을 내립니다");

	}

	@Override
	public void soundUp() {
		// TODO Auto-generated method stub
		System.out.println("소리를 키웁니다");

	}

	@Override
	public void soundDown() {
		// TODO Auto-generated method stub
		System.out.println("소리를 낮춥니다");

	}

	@Override
	public void mute() {
		// TODO Auto-generated method stub
		System.out.println("<음소거>");

	}

}
