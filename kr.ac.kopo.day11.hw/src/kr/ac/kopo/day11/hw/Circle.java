package kr.ac.kopo.day11.hw;

import java.util.Random;

public class Circle extends GetArea {

	Random r = new Random();
	private int h = (r.nextInt(8) + 2);
	private int v = (r.nextInt(8) + 2);

	@Override
	public void getArea() {
		System.out.println("반지름" + h + "인 원의 면적은" + (int) (h * h * 3.14) + "입니다.");

	}

}
