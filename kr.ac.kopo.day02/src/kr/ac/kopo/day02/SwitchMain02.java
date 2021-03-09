package kr.ac.kopo.day02;

import java.util.Scanner;

/* 좋아하는 계절은 입력: spring
 * 봄은 3월~5월까지 입니다.
 */
public class SwitchMain02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("좋아하는 계절을 입력 :");
		String season =sc .nextLine();
		
		switch(season) {
		case "SPRING":
		case "봄":
		case "spring":
			System.out.println("봄은 3월 ~5월까지 입니다.");
			break;
		case "summer":
			System.out.println("여름은 6월 ~8월까지 입니다.");
			break;
		}
		/*if(season == "spring") {//이렇게 물어보면 인식을 못함
			//season.equals("spring")) 으로 해야 나옴. *if는 문법을 따로 써줘야함.
			System.out.println("봄은 3월~5월까지입니다.");
		}else if (season ==)*/
	}

}
