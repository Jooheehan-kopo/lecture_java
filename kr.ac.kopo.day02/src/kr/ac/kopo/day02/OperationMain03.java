package kr.ac.kopo.day02;

import java.util.Scanner;
// 자동 import : ctrl + shift + o


/* 정수를 입력하세요 문장을 출력.
 * 키보드로 정수를 입력
 * 결과출력
 * 단, 0이나 음수일 경우 f라고 출력하자.
 * */

public class OperationMain03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);//키보드로 입력받겠다는 것. in
		
		//"정수를 입력하세요: " 문장을 출력
		System.out.println("정수를 입력하세요 :");
		
		// 키보드로 정수를 입력
		int num = sc.nextInt(); //키보드로 정수를 입력받는 메소드 - num이라는 변수에 대입
		
		// 결과 출력
		boolean result = (num>0 && num %2 ==0); //2로 나눈 나머지가 0이니. &&둘다 참이니.
		System.out.println(num+"의 짝수 유무 : "+ result);
	}

}
