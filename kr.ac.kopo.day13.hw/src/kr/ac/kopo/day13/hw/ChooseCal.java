package kr.ac.kopo.day13.hw;

import java.util.Scanner;
import java.util.Calendar;

public class ChooseCal {

	Scanner sc = new Scanner(System.in);
	/*
	 * 생성자로 만들어도 됨.
	 * private Scanner sc;
	 * public ChooseCal(){
	 * sc= new Scanner(System.in);
	 */

	public int ChooseCal() {
		
		/*
		 * public int getInt(String msg){ //문자받아오는거 만들어줌)
		 * Ststem.out.print(mgs);
		 * int no = sc.nextInt();
		 * sc.nextLine();
		 * 
		 */

		System.out.println("선택하세요(1.특정년도 2.특정월 3.종료)=> ");
		int myCal = sc.nextInt();
		sc.nextLine();
		return myCal;
	}

	public int ChooseYear() {
		System.out.println("년도를 입력하세요 : ");
		int myYear = sc.nextInt();
		return myYear;
	}

	public int ChooseMonth() {
		System.out.println("월을 입력하세요 : ");
		int myMonth = sc.nextInt();
		return myMonth;
	}

	public void CalData() {
		Calendar c = Calendar.getInstance();
		System.out.println("c: " + c);
		int myCal = ChooseCal();
		int year = ChooseYear();
		int month = ChooseMonth();
		c.set(year, month - 1, 1);
		int day = c.get(Calendar.DAY_OF_WEEK); // 요일
		int lastday = c.getActualMaximum(Calendar.DAY_OF_MONTH);

		System.out.print("일\t월\t화\t수\t목\t금\t토");
		System.out.println();
		String[] date = new String[day - 1 + lastday];
		System.out.println(day - 1);
		System.out.println(date.length);
		
		
		for (int i = 1; i < date.length; i++) {
			System.out.print(date[i] + "\t");
			if (i % 7 == 0) {
				System.out.println();
			}

		}

	}
}
