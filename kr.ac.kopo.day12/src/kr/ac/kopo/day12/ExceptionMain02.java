package kr.ac.kopo.day12;
//예외처리

import java.util.Random;

public class ExceptionMain02 {

	public static void main(String[] args) {

		System.out.println("main start..");
		
		Random r = new Random();
		int num = r.nextInt(3); //0~2까지 난수발생
		System.out.println("num: "+ num);
		
		
		String str =null;
		try {
			
			
		System.out.println(10/num); // *예외 처리
		System.out.println("첫번째문자 : "+ str.charAt(0)); 
		
		}catch(ArithmeticException ae){// 이 예외가 발생하면 catch가 실행할 것임
			
			//System.out.println("이유:" + ae.getMessage()); //예외가 나온 이유
			//System.out.println("catch 블럭 진입");
			ae.printStackTrace();
		}
		catch(NullPointerException ne) {
			System.out.println("NullPointerException 에 진입..");
		}
		System.out.println("main end..");
	}

}
