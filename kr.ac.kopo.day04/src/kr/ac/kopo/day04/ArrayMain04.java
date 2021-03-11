package kr.ac.kopo.day04;

// 참조형 배열
import java.util.Arrays;
public class ArrayMain04 {
	

	public static void main(String[] args) {

		String[] strArr = {"폴리텍", "데이터분석", "자바"}; //초기화

/*		System.out.println("strArr:"+ strArr); //주소값 나옴.
		System.out.println("배열의 크기"+ strArr.length); //배열값 3 나옴.
		System.out.println("첫번째 문자열"+ strArr[0]); //폴리텍  나옴.
		
*/		
		System.out.println("배열의 크기"+ strArr.length); //배열값 3 나옴.
		System.out.println("<방식 1>");//index값 나옴
		
		for(int i =0; i<strArr.length; i++) {
			System.out.println(i+1 + "번째 문자열:" + strArr[i]);
		}
		System.out.println(" 방식 2");
		for(String str : strArr) {
			System.out.println(str);
		}
		System.out.println(" 방식 3");
		System.out.println(Arrays.toString(strArr));
	}

}
