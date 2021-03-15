package kr.ac.kopo.day05;

import java.util.Arrays;

public class Content02 {

	public static void main(String[] args) {

		int[]a = {10,20,30};
		int[]b= {5,7,8,9,20,23};
		
		int[]c = new int[a.length+ b.length];
		System.arraycopy(a,0,c,0,a.length);
		System.arraycopy(b,0,c,a.length,b.length); //a.length: a의 값을 저장한 주소값자리 뒤부터.
		// a는 0부터 총길이의 -1 (a.length)-1 이기에.
		//* 연습* a 배열의 값을 다른 배열로 복사해보기.
		
		
		System.out.println("a: "+ Arrays.toString(a));
		System.out.println("b: "+ Arrays.toString(b));
		System.out.println("c: "+ Arrays.toString(c));
	}

}
