package kr.ac.kopo.day02;

import java.util.Scanner;

/* 집에서 출발한 시간 8시 이전 : 걸어서
 * 				8시 15분 이전 : 버스타고
 * 				8시 15분 이후 : 택시타고
 * 
 * 집에서 출발한 시간 읿력 (8시05분은 805입력)
 */
public class ExamMain01 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.print("집에서 출발한 시간 입력(8시 5분은 805입력) : ");
		int time = sc.nextInt();
		
		System.out.println(time);
		
		if (time< 800){
		 System.out.println("걸어서 융기원 도착");
		} else if (time<815){
			System.out.println(" 버스타고 융기원 도착");
		} else 
			System.out.println(" 택시타고 융기원 도착");
		
	}

}
