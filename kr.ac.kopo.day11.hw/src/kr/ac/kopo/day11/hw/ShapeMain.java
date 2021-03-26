package kr.ac.kopo.day11.hw;


import java.util.Random;
import java.util.Scanner;

public class ShapeMain {

	public static void main(String[]args){

	
		Scanner sc = new Scanner(System.in);
		System.out.println("도형을 선택하시오. (1.직사각형 2.정사각형 3.삼각형 4.원) =>");
		int shapeName = sc.nextInt();
		sc.nextLine();

	}

	public int random() { // 랜덤 밖으로 빼고싶으나,,,
		Random r = new Random();
		int ranNum = (r.nextInt(8) + 2);
		return ranNum;

	}

	public void print(int shapeName) {

		GetArea area = null;
		switch (shapeName) {
		case 1:
			area = new Rectangle();
			area.getArea();
			break;

		case 2:
			area = new Square();
			area.getArea();
			break;
		case 3:
			area = new Triangle();
			area.getArea();
			break;
		case 4:
			area = new Circle();
			area.getArea();
			break;
		}
		if (area != null)
			area.getArea();
		else {
			System.out.println("다시 입력하십시오.");
		}

	}
}
