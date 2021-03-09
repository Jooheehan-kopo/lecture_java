package kr.ac.kopo.day02;

public class CastMain {

	public static void main(String[] args) {
		
		System.out.println(10 + 20);
		// 더하기를 기준으로 10,20으로 같음. 정수형 - int : 결과가 int로 나옴
		System.out.println((int)'A'+ 20); //문자 + int -> 같게 맞춰줘야함. 더 큰수의 타입을 따라감.int
		System.out.println('A'+20); //이렇게 해도 됨/
		
		System.out.println(12.3+45);//double + int : double+double로 인식함.
		System.out.println(12.3+(double)45); //() 생략해도 값이 같게 나옴.
		System.out.println((int)12.3+45); //생략하면 안됨. 작은 값이기에 정해줘야함.
		
		double num = 12; //num은 더블, 12는 int 대입안됨.
		double num1 = (double) 12; // 실수가 정수를 포함하기에 더블 생략 가능.
		int num2 =(int)12.34;
	}

}
