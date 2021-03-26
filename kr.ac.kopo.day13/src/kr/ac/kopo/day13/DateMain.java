package kr.ac.kopo.day13;

import java.util.Date;

public class DateMain {

	public static void main(String[] args) {
		// 오늘은 2021년 3월 24일 입니다.

		Date d = new Date();
		System.out.println("d: " + d);

		int year = d.getYear()+1900;// 이 메소드가 deprecate 되었다는 것
		System.out.println("오늘은" + year + "년");
		
		int month = d.getMonth()+1;
		int date =d.getDate();
		System.out.println("오늘은"+year+"년"+ month+"월"+date+ "입니다.");

	}

}
