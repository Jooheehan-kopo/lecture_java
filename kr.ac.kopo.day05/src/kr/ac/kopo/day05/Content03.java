package kr.ac.kopo.day05;

public class Content03 {

	public static void main(String[] args) {
		// 1.5 버전은 사용하지 말기
		int[]a= {10,20,30,40,50};
		
		for( int num :a) {
			num=num+100;
		}
		for(int num :a) {
			System.out.println(num); //바뀌지않음.
		}

	}

}
