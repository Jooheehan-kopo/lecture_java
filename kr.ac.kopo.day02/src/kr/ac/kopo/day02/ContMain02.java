package kr.ac.kopo.day02;

public class ContMain02 {

	public static void main(String[] args) {
		
		char ch = 'A';
		ch =65;
		
		ch = '\u0041';
		
	//	ch = '\uAC00'; //가
	
		//유니코드 형태의 문자를 찍을거에요. 16진수로 표현해야함.
		System.out.println(ch);
		System.out.println((int)ch); //형변환 : 원래 문자형이지만 정수형으로 인식하게 바꿔주는 것
		int code = ch;
		
		System.out.println(code);
		
		System.out.println("문자: "+ ch);
		
		System.out.println(""+ 'A'+'B');
	}

}
