package kr.ac.kopo.day09;

public class ValueOf {

	public static void main(String[] args) {
		
		int num =123;
//		String =strNum = num + " ";  - 생성하고 복사 해서 시간이 느림
		String strNum = String.valueOf(num); //num이 가지고 있는 값을 문자열로 바꿔주세요.
		System.out.println(strNum+10);			//return 타입은 다 String 임.
		System.out.println(String.valueOf(true)+false);			//return 타입은 다 String 임.
		
		
		// ==========
		long start = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer();
		for(int i =0; i<100000;i++) {
			sb.append(i); //합쳐주는 메소드
		}
		long end = System.currentTimeMillis();
		System.out.println("소요시간 : "+ (end-start)/1000.0 + "초");
	}

}
