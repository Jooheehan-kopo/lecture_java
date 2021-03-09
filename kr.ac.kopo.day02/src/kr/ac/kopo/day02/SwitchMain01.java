package kr.ac.kopo.day02;

import java.util.Scanner;

/* 1- 3사이 정수 입력 : 1
 * ONE
 *  1- 3사이 정수 입력 : 2
 * TWO
 *  1- 3사이 정수 입력 : 3
 *  THREE
 *   1- 3사이 정수 입력 : 
 */
public class SwitchMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" 1- 3사이 정수 : ");
		int num = sc.nextInt();
		 //  메뉴 선정 하게 할 경우, 문자열 입력받아 쓸때도 switch 많이 씀.
		switch(num){
		case 1:
			System.out.println("ONE");
			break;
		default : // case가 다 실행되고 난 후에 마지막에 실행. 중간에 넣어도 무관.
			System.out.println("ERROR");
		case 2:
			System.out.println("TWO");
			break;
		case 3:
			System.out.println("THREE");
			break;
			
		}
		/*
		if(num==1) {
			System.out.println("ONE");
		}else if (num ==2) {
			System.out.println("TWO");
		}else if (num ==3) {
			System.out.println("THREE");
		}*/
	}

}
