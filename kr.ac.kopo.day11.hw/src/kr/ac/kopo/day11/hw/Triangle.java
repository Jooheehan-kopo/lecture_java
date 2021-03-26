package kr.ac.kopo.day11.hw;

import java.util.Random;

public class Triangle extends GetArea {

	Random r = new Random();
	private int h = (r.nextInt(8) + 2);
	private int v = (r.nextInt(8) + 2);

	@Override
	public void getArea() {
		System.out.println("밑변" + h + "," + "높이" + v + "의 삼각형 면적은" + (int) (h * v) / 2 + "입니다.");

	}

}
