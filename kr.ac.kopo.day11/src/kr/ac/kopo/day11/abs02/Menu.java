package kr.ac.kopo.day11.abs02;

import java.util.Scanner;

//기능 클래스
public class Menu {
	// 프린트가 목적이라면. 이름 그렇게 지정.
	public int selectMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("lv 2. 프린터를 선택하세요. (1.엘지 2. 삼성 3. HP) =>");
		int no = sc.nextInt();
		sc.nextLine();
		return no;
	}

	public void choice() {
		int type = selectMenu();
		print(type);
	}

	public void print(int no) {

		Printer p = null; // 지정하고 아래 시행.
		/*
		 * LGPrinter lg
		 *  SamsungPrinter sam 
		 * HPPrinter hp 
		 * lg.print 
		 * sam.print
		 * HPPrinter hp  -> 값 p로 바꿔줘
		 * 
		 * print 같으니까
		 * 괄호 밖으로, p.print 빼줘.
		 * 
		 * 다른 값넣었을떼
		 * 
		 * 
		 */
		switch (no) {
		case 1:
			// System.out.println("lg선택");
			LGPrinter lg = new LGPrinter();
			lg.print(); // 바꿔줌. lg.lgPrint
			break;
		case 2:
			SamsungPrinter sam = new SamsungPrinter();
			sam.print();
			break;
		case 3: // 추가
			HPPrinter hp = new HPLaserPrinter();
			hp.print();
			break;
			
		}if(p! =null) { //위의 값으로 수정이후 실행.
			p.print();
		}else {
			System.out.println("잘못선택하셨습니다.");
		}
		
	}
}
