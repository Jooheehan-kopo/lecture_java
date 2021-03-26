package kr.ac.kopo.day11.hw;

import java.util.Random;

public class Rectangle extends GetArea {
	Random r = new Random();
	private int h=(r.nextInt(8) + 2);
	private int v=(r.nextInt(8) + 2);
	

	@Override
	public void getArea() {
		System.out.println("가로" + h + "," + "세로" + v + "의 직사각형 면적은" + h * v + "입니다.");
		///질문

	}
}
