package kr.ac.kopo.day11.abs02;

import java.util.Scanner;

public class Menu2 {

	public int selectPrint() {
		Scanner sc = new Scanner(System.in);
		System.out.println("프린터기를 선택하시오. (1.LG 2.삼성 ) =>");
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}

	public void choice() {
		int type = selectPrint();
		print(type);
	}

	public void print(int num) {
		Printer p = null;
		
		switch (num) {
		case 1 :
			p = new LGPrinter();
			p.print();
			break;
		case 2 :
			p= new SamsungPrinter();
			p.print();
			break;
		case 3:
			p = new HPLaserPrinter();
			p.print();
			break;
			
		}if(p!=null) {
		p.print();
	}else{ 
		System.out.println("다시 선택하세요");
	}

	{

	}
	}
}
