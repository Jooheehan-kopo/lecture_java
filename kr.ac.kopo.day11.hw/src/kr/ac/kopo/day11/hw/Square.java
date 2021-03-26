package kr.ac.kopo.day11.hw;

import java.util.Random;

public class Square extends GetArea {
	Random r = new Random();
	private int h=(r.nextInt(8) + 2);
	private int v=(r.nextInt(8) + 2);
	

	@Override
	public void getArea() {
	System.out.println("길이" + h + "의 정사각형 면적은" + h * h + "입니다.");
}
}
