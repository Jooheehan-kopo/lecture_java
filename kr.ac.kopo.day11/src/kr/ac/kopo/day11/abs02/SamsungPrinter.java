package kr.ac.kopo.day11.abs02;

public class SamsungPrinter extends Printer { //추상클래스해서
	
	@Override
	public void print() {
		System.out.println("삼성 프린트에서 출력중..");
	}
}
