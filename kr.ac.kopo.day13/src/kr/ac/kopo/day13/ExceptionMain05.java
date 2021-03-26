package kr.ac.kopo.day13;

import java.io.FileReader;

public class ExceptionMain05 {

	public static void main(String[] args) {
		
		//checked exception -> try catch 필요. 내가할 것인지, 메소드로 throw 해줄지 결정.
		//ex) 메뉴 선택할 때, 잘못선택한다면.. / int 쓰라했는데 a쓰면 try catch로 묶을 수 있음.
		
		//#1. main이 예외처리.
		try {
			
			b();
		}catch(Exception e) {
			System.out.println("main 예외처리");
			e.printStackTrace();
		}
		
		//#2 jvm이 처리하도록 넘기는 것.
		
		
		//a();
	}
	public static void b() throws ArithmeticException{ //b를 호출한 main으로 예외넘김
		System.out.println("b() 메소드 호출..");
		System.out.println(1/0); //devide by zero 예외
	}
	
	public static void a() {
		System.out.println("a() 메소드 호출..");
		
		try{
			FileReader fr = new FileReader("a.txt"); //checked exc
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
