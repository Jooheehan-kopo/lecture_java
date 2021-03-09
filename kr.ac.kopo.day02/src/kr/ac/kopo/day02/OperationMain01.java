package kr.ac.kopo.day02;

public class OperationMain01 {

	public static void main(String[] args) {
		
		int num =10;
		num = num +1;
		num += 1; //아래와 같은 의미임.
		++num; // 전이증가 연산자 - 속도가 더 빠름.
		num++; // 후이증가 연산자
		
		num =10;
		System.out.println(++num);
		num= 10;
		System.out.println(--num);
	}

}
