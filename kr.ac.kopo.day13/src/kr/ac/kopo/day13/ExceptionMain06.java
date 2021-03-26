package kr.ac.kopo.day13;

import java.util.Scanner;

// .등록할 아이디 입력하세요.: hello1234
//아이디는 최대 8글자만 가능합니다.
// .등록할 아이디 입력하세요.: hello123
//아이디를 등록하였습니다.

public class ExceptionMain06 {
	
	static void register() {
		//생성자
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("등록할 아이디를 입력하세요 : ");
		String id = sc.nextLine();
		try {
			if (id.length() > 8) {
				throw new CheckIDException("아이디는 최대 8글자만 가능합니다.");
//				throw new Exception("아이디는 최대 8글자만 가능합니다.");
			}
			System.out.println("아이디를 등록하였습니다");

		} catch (Exception e) {
			e.printStackTrace();
			//System.out.println(e.getMessage);
		}
		/*
		 * if (id.length() > 8) { System.out.println("아이디는 최대 8글자만 가능합니다."); } else {
		 * 
		 * System.out.println("아이디를 등록하였습니다");
		 * 
		 * }
		 */
	}
}
