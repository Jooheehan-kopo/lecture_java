package kr.ac.kopo.day02;

public class OperationMain04 {

	public static void main(String[] args) {
		
		int a =5, b= 8;
		/* a가 b보다 크다면 a
		 * a가 b보다 작다면 b
		 * a와 b가 같다면 0 출력
		 */
		//System.out.println(a>b? a: (a<b?b:0));
		/*
		if(a>=b) {
			if(a == b) {
				System.out.println(0);
			}else {
				System.out.println(a);
			}
		}else {
			System.out.println(b); 
		}
		*/
		
		if (a>b) {
			System.out.println(a);
		} else if(a<b) {
			System.out.println(b);
		} else {//a== 0
			System.out.println(0);
		}
		
		//System.out.println("Max : " +(a>b? a;b));
		
		/*if (a>b) {
			System.out.println("MAX: " + a);
		} else {
			System.out.println("MAX: " + b);
			// 위처럼 단수 항? 일 때에는 {} 생략이 가능함.
			//ctrl + shift+f : 들여쓰기 바로 해줌.
		}*/
	}

}
