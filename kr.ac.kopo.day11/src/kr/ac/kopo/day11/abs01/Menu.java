package kr.ac.kopo.day11.abs01;

import java.util.Scanner;

//기능 클래스
public class Menu {
	// 프린트가 목적이라면. 이름 그렇게 지정.
	public int selectMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("프린터를 선택하세요. (1.엘지 2. 삼성) =>");
		int no = sc.nextInt();
		sc.nextLine();
		return no;
	}

	public void choice() {
		int type = selectMenu();
		print(type);
	}

	public void print(int no) {
			switch(no) {
			case 1:
				//System.out.println("lg선택");
				LGPrinter lg = new LGPrinter();
				lg.lgPrint();
				break;
			case 2:
				SamsungPrinter sam = new SamsungPrinter();
				sam.samPrint();
				break;
				
			}
		}
}
